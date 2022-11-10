package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Coco.clsCliente;
import Coco.clsReservacion;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class frmImprimirReserva extends JFrame {

	private JPanel contentPane;
	public JTextField textBuscarCedula;
	private JButton btnImprimirReserva;
	private JLabel lblCedula;
	public JTextField textCedula;
	public JTextField textFechaInicio;
	private JLabel lblFechaInicio;
	private JLabel lblCantidadDias;
	public JTextField textCantidadDias;
	public JTextField textNumHabitacion;
	private JLabel lblNumHabitacion;

	public frmImprimirReserva() {
		setTitle("Imprimir reserva");
    	setBounds(750, 300, 440, 332);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBuscarCdula = new JLabel("Ingrese la cédula de la reserva que desea imprimir:");
		lblBuscarCdula.setForeground(Color.WHITE);
		lblBuscarCdula.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBuscarCdula.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblBuscarCdula.setBounds(-35, 24, 420, 20);
		contentPane.add(lblBuscarCdula);
		
		textBuscarCedula = new JTextField();
		textBuscarCedula.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textBuscarCedula.setColumns(10);
		textBuscarCedula.setBounds(133, 55, 161, 20);
		contentPane.add(textBuscarCedula);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnVolver.setBounds(235, 239, 121, 29);
		contentPane.add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
    			setVisible(false);
        	}
        });
		
		JButton btnImprimirReserva = new JButton("Imprimir");
		btnImprimirReserva.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnImprimirReserva.setBounds(85, 239, 121, 29);
		contentPane.add(btnImprimirReserva);
		btnImprimirReserva.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		clsReservacion reservar = new clsReservacion();
				reservar.ImprimirReserva();
        	}
        });
		
		lblCedula = new JLabel("Cedula:");
		lblCedula.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCedula.setForeground(Color.WHITE);
		lblCedula.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblCedula.setBounds(61, 103, 133, 20);
		contentPane.add(lblCedula);
		
		textCedula = new JTextField();
		textCedula.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textCedula.setColumns(10);
		textCedula.setBounds(204, 103, 161, 20);
		contentPane.add(textCedula);
		
		textFechaInicio = new JTextField();
		textFechaInicio.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textFechaInicio.setColumns(10);
		textFechaInicio.setBounds(204, 134, 161, 20);
		contentPane.add(textFechaInicio);
		
		lblFechaInicio = new JLabel("Fecha de inicio:");
		lblFechaInicio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaInicio.setForeground(Color.WHITE);
		lblFechaInicio.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblFechaInicio.setBounds(61, 134, 133, 20);
		contentPane.add(lblFechaInicio);
		
		lblCantidadDias = new JLabel("Cantidad de días:");
		lblCantidadDias.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCantidadDias.setForeground(Color.WHITE);
		lblCantidadDias.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblCantidadDias.setBounds(61, 165, 133, 20);
		contentPane.add(lblCantidadDias);
		
		textCantidadDias = new JTextField();
		textCantidadDias.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textCantidadDias.setColumns(10);
		textCantidadDias.setBounds(204, 165, 161, 20);
		contentPane.add(textCantidadDias);
		
		textNumHabitacion = new JTextField();
		textNumHabitacion.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textNumHabitacion.setColumns(10);
		textNumHabitacion.setBounds(204, 196, 41, 20);
		contentPane.add(textNumHabitacion);
		
		lblNumHabitacion = new JLabel("Número de habitación:");
		lblNumHabitacion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumHabitacion.setForeground(Color.WHITE);
		lblNumHabitacion.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblNumHabitacion.setBounds(24, 196, 170, 20);
		contentPane.add(lblNumHabitacion);
		
	}
}
