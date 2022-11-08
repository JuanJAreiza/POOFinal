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

public class frmCambiarPrecio extends JFrame {

	private JPanel contentPane;
	private JTextField textCambioPrecio;
	private JButton btnActualizarPrecio;

	public frmCambiarPrecio() {
		setTitle("Cambiar precio habitación");
    	setBounds(750, 300, 440, 332);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBuscarHabitacion = new JLabel("Ingrese la habitación que desea modificar:");
		lblBuscarHabitacion.setForeground(Color.WHITE);
		lblBuscarHabitacion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBuscarHabitacion.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblBuscarHabitacion.setBounds(-91, 36, 451, 20);
		contentPane.add(lblBuscarHabitacion);
		
		textCambioPrecio = new JTextField();
		textCambioPrecio.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textCambioPrecio.setColumns(10);
		textCambioPrecio.setBounds(132, 174, 161, 20);
		contentPane.add(textCambioPrecio);
		
		JComboBox cbxHabitación = new JComboBox();
		cbxHabitación.setFont(new Font("Arial", Font.PLAIN, 14));
		cbxHabitación.setModel(new DefaultComboBoxModel(new String[] {"Habitación Simple", "Habitación Doble", "Habitación Matrimonial"}));
		cbxHabitación.setBounds(66, 80, 298, 22);
		contentPane.add(cbxHabitación);
		
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
		
		btnActualizarPrecio = new JButton("Actualizar");
		btnActualizarPrecio.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnActualizarPrecio.setBounds(82, 225, 121, 29);
		contentPane.add(btnActualizarPrecio);
		
		JLabel lblNuevoPrecio = new JLabel("Ingrese el nuevo precio que desea:");
		lblNuevoPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNuevoPrecio.setForeground(Color.WHITE);
		lblNuevoPrecio.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblNuevoPrecio.setBounds(-122, 132, 451, 20);
		contentPane.add(lblNuevoPrecio);
		btnActualizarPrecio.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
        		
        	}
        });
		
	}
}
