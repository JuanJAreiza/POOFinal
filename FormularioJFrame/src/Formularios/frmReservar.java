package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Inicio;
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

public class frmReservar extends JFrame	{
	
	private JPanel contentPane;
	public JTextField textNumHabitacion;
	public JTextField textCedula;
	public JTextField textFechaInicio;
	private JButton btnRegistrarReserva;
	public JTextField textCantidadDias;
	private JLabel lblCantidadDias;

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
		lblNumHabitación.setBounds(38, 172, 178, 20);
		contentPane.add(lblNumHabitación);
		
		JLabel lblCdula = new JLabel("Cédula:");
		lblCdula.setForeground(Color.WHITE);
		lblCdula.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCdula.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblCdula.setBounds(54, 60, 161, 20);
		contentPane.add(lblCdula);
		
		JLabel lblFechaInicio = new JLabel("Fecha de inicio:");
		lblFechaInicio.setForeground(Color.WHITE);
		lblFechaInicio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaInicio.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblFechaInicio.setBounds(54, 96, 161, 20);
		contentPane.add(lblFechaInicio);
		
		textNumHabitacion = new JTextField();
		textNumHabitacion.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textNumHabitacion.setBounds(235, 172, 31, 20);
		contentPane.add(textNumHabitacion);
		textNumHabitacion.setColumns(10);
		
		textCedula = new JTextField();
		textCedula.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textCedula.setColumns(10);
		textCedula.setBounds(234, 60, 161, 20);
		contentPane.add(textCedula);
		String Cedula = textCedula.getText();
		
		textFechaInicio = new JTextField();
		textFechaInicio.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textFechaInicio.setColumns(10);
		textFechaInicio.setBounds(234, 96, 161, 20);
		contentPane.add(textFechaInicio);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnVolver.setBounds(233, 220, 121, 29);
		contentPane.add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmReservacion frmReservacion = new frmReservacion();
    			setVisible(false);
        	}
        });
		
		btnRegistrarReserva = new JButton("Reservar");
		btnRegistrarReserva.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnRegistrarReserva.setBounds(83, 220, 121, 29);
		contentPane.add(btnRegistrarReserva);
		btnRegistrarReserva.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		clsReservacion reserva = new clsReservacion();
				reserva.Reservar();
        	}
        });
		
		textCantidadDias = new JTextField();
		textCantidadDias.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textCantidadDias.setColumns(10);
		textCantidadDias.setBounds(234, 134, 161, 20);
		contentPane.add(textCantidadDias);
		
		lblCantidadDias = new JLabel("Cantidad de días:");
		lblCantidadDias.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCantidadDias.setForeground(Color.WHITE);
		lblCantidadDias.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblCantidadDias.setBounds(54, 134, 161, 20);
		contentPane.add(lblCantidadDias);
	}
	
	void Reservar(String Cedula) {
		
		boolean habitual = false;
		Inicio ini = new Inicio();
		
		for(int i = 0; i<=4; i++) {
			
			if(Inicio.Cliente[i][0] == Cedula)
			{
				habitual=true;
			}
		}
		
	
	}
}
