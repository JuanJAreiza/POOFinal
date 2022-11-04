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

public class frmReservar extends JFrame {

	private JPanel contentPane;
	private JTextField textNumHabitacion;
	private JTextField textCedula;
	private JTextField textNombreCliente;
	private JButton btnRegistrarReserva;

	public frmReservar() {
		setTitle("Hacer reserva");
    	setBounds(750, 300, 440, 332);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumHabitación = new JLabel("Número de la habitación:");
		lblNumHabitación.setForeground(Color.WHITE);
		lblNumHabitación.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumHabitación.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblNumHabitación.setBounds(36, 65, 178, 20);
		contentPane.add(lblNumHabitación);
		
		JLabel lblCdula = new JLabel("Cédula:");
		lblCdula.setForeground(Color.WHITE);
		lblCdula.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCdula.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblCdula.setBounds(53, 102, 161, 20);
		contentPane.add(lblCdula);
		
		JLabel lblNombreCliente = new JLabel("Nombre del cliente:");
		lblNombreCliente.setForeground(Color.WHITE);
		lblNombreCliente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombreCliente.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblNombreCliente.setBounds(53, 143, 161, 20);
		contentPane.add(lblNombreCliente);
		
		textNumHabitacion = new JTextField();
		textNumHabitacion.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textNumHabitacion.setBounds(234, 65, 31, 20);
		contentPane.add(textNumHabitacion);
		textNumHabitacion.setColumns(10);
		
		textCedula = new JTextField();
		textCedula.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textCedula.setColumns(10);
		textCedula.setBounds(234, 102, 161, 20);
		contentPane.add(textCedula);
		
		textNombreCliente = new JTextField();
		textNombreCliente.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textNombreCliente.setColumns(10);
		textNombreCliente.setBounds(234, 143, 161, 20);
		contentPane.add(textNombreCliente);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnVolver.setBounds(234, 197, 121, 29);
		contentPane.add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmReservacion frmReservacion = new frmReservacion();
    			setVisible(false);
        	}
        });
		
		btnRegistrarReserva = new JButton("Reservar");
		btnRegistrarReserva.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnRegistrarReserva.setBounds(84, 197, 121, 29);
		contentPane.add(btnRegistrarReserva);
		btnRegistrarReserva.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
        		
        	}
        });
		
	}
}
