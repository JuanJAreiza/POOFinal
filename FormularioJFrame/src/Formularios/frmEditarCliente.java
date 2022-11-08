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
import javax.swing.JButton;
import java.awt.Color;

public class frmEditarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textCedula;
	private JButton btnEliminarReserva;

	public frmEditarCliente() {
		setTitle("Eliminar reserva");
    	setBounds(750, 300, 440, 332);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBuscarCdula = new JLabel("Ingrese la cédula del cliente que desea Editar:");
		lblBuscarCdula.setForeground(Color.WHITE);
		lblBuscarCdula.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBuscarCdula.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblBuscarCdula.setBounds(-35, 70, 420, 20);
		contentPane.add(lblBuscarCdula);
		
		textCedula = new JTextField();
		textCedula.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textCedula.setColumns(10);
		textCedula.setBounds(135, 115, 161, 20);
		contentPane.add(textCedula);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnVolver.setBounds(234, 197, 121, 29);
		contentPane.add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
    			setVisible(false);
    			frmClientes Clientes = new frmClientes();
    			Clientes.setVisible(true);
        	}
        });
		
		btnEliminarReserva = new JButton("Editar");
		btnEliminarReserva.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnEliminarReserva.setBounds(84, 197, 121, 29);
		contentPane.add(btnEliminarReserva);
		btnEliminarReserva.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
        		
        	}
        });
		
	}
}
