package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Color;

public class frmCambiarDescuento extends JFrame {

	private JPanel contentPane;
	private JTextField textDescuentoNuevo;
	private JButton btnActualizarDescuento;
	private JTextField textDescuentoActual;

	public frmCambiarDescuento() {
		setTitle("Cambiar precio habitación");
    	setBounds(750, 300, 440, 332);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescuentoActual = new JLabel("El descuento actual es:");
		lblDescuentoActual.setForeground(Color.WHITE);
		lblDescuentoActual.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescuentoActual.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblDescuentoActual.setBounds(-160, 35, 451, 20);
		contentPane.add(lblDescuentoActual);
		
		textDescuentoNuevo = new JTextField();
		textDescuentoNuevo.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textDescuentoNuevo.setColumns(10);
		textDescuentoNuevo.setBounds(132, 174, 161, 20);
		contentPane.add(textDescuentoNuevo);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnVolver.setBounds(232, 225, 121, 29);
		contentPane.add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmAdministrador frmAdministrador = new frmAdministrador();
        		frmAdministrador.setVisible(true);
				setVisible(false);
        	}
        });
		
		btnActualizarDescuento = new JButton("Actualizar");
		btnActualizarDescuento.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnActualizarDescuento.setBounds(82, 225, 121, 29);
		contentPane.add(btnActualizarDescuento);
		
		JLabel lblDescuentoNuevo = new JLabel("Ingrese el descuento nuevo:");
		lblDescuentoNuevo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescuentoNuevo.setForeground(Color.WHITE);
		lblDescuentoNuevo.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblDescuentoNuevo.setBounds(-141, 131, 451, 20);
		contentPane.add(lblDescuentoNuevo);
		
		textDescuentoActual = new JTextField();
		textDescuentoActual.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textDescuentoActual.setColumns(10);
		textDescuentoActual.setBounds(132, 76, 161, 20);
		contentPane.add(textDescuentoActual);
		btnActualizarDescuento.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
        		
        	}
        });
		
	}
}
