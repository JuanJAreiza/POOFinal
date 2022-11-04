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

public class frmAgregarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textEmail;
	private JTextField textCedula;
	private JTextField textNombreCliente;
	private JButton btnRegistrarReserva;
	private JTextField textFechaDía;
	private JTextField textFechaMes;
	private JTextField textFechaAnio;

	public frmAgregarCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750, 300, 440, 332);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblEmail.setBounds(20, 112, 178, 20);
		contentPane.add(lblEmail);
		
		JLabel lblCdula = new JLabel("Cédula:");
		lblCdula.setForeground(Color.WHITE);
		lblCdula.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCdula.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblCdula.setBounds(37, 31, 161, 20);
		contentPane.add(lblCdula);
		
		JLabel lblNombreDelCliente = new JLabel("Nombre del cliente:");
		lblNombreDelCliente.setForeground(Color.WHITE);
		lblNombreDelCliente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombreDelCliente.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblNombreDelCliente.setBounds(37, 72, 161, 20);
		contentPane.add(lblNombreDelCliente);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textEmail.setBounds(218, 112, 161, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textCedula = new JTextField();
		textCedula.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textCedula.setColumns(10);
		textCedula.setBounds(218, 31, 161, 20);
		contentPane.add(textCedula);
		
		textNombreCliente = new JTextField();
		textNombreCliente.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textNombreCliente.setColumns(10);
		textNombreCliente.setBounds(218, 72, 161, 20);
		contentPane.add(textNombreCliente);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnVolver.setBounds(233, 207, 121, 29);
		contentPane.add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
    			setVisible(false);
        	}
        });
		
		btnRegistrarReserva = new JButton("Guardar");
		btnRegistrarReserva.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnRegistrarReserva.setBounds(83, 207, 121, 29);
		contentPane.add(btnRegistrarReserva);
		
		textFechaDía = new JTextField();
		textFechaDía.setToolTipText("Día");
		textFechaDía.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textFechaDía.setColumns(10);
		textFechaDía.setBounds(218, 154, 41, 20);
		contentPane.add(textFechaDía);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaNacimiento.setForeground(Color.WHITE);
		lblFechaNacimiento.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblFechaNacimiento.setBounds(19, 154, 178, 20);
		contentPane.add(lblFechaNacimiento);
		
		textFechaMes = new JTextField();
		textFechaMes.setToolTipText("Mes");
		textFechaMes.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textFechaMes.setColumns(10);
		textFechaMes.setBounds(270, 154, 41, 20);
		contentPane.add(textFechaMes);
		
		textFechaAnio = new JTextField();
		textFechaAnio.setToolTipText("Año");
		textFechaAnio.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textFechaAnio.setColumns(10);
		textFechaAnio.setBounds(323, 154, 58, 20);
		contentPane.add(textFechaAnio);
		btnRegistrarReserva.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
        		
        	}
        });
		
	}
}
