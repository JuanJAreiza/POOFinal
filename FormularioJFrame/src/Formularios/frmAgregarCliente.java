package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Inicio;
import Coco.Cliente;
import Coco.clsCliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class frmAgregarCliente extends JFrame {

	private JPanel contentPane;
	public JTextField textEmail;
	public JTextField textCedula;
	public JTextField textNombreCliente;
	public JButton btnGuardarCliente;
	public JTextField textFechaNacimiento;

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
		
		JLabel lblCedula = new JLabel("Cédula:");
		lblCedula.setForeground(Color.WHITE);
		lblCedula.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCedula.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblCedula.setBounds(37, 31, 161, 20);
		contentPane.add(lblCedula);
		
		JLabel lblNombreCliente = new JLabel("Nombre del cliente:");
		lblNombreCliente.setForeground(Color.WHITE);
		lblNombreCliente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombreCliente.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblNombreCliente.setBounds(37, 72, 161, 20);
		contentPane.add(lblNombreCliente);
		
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
		
		btnGuardarCliente = new JButton("Guardar");
		btnGuardarCliente.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnGuardarCliente.setBounds(83, 207, 121, 29);
		contentPane.add(btnGuardarCliente);
		btnGuardarCliente.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				/*clsCliente cliente = new clsCliente();
				cliente.AgregarCliente();*/
				
				//Crear un objeto de la clase Cliente
				Cliente clienteNuevo = new Cliente();
				
				//Hacer set de cada uno
				clienteNuevo.setCedula(Integer.valueOf(textCedula.getText()));
				clienteNuevo.setNombre(textNombreCliente.getText());
				clienteNuevo.setEmail(textEmail.getText());
				clienteNuevo.setFechaNacimiento(textFechaNacimiento.getText());
				
				
				//Set: Establecer el dato
				//Get: Obtener el dato
				
				//Guardar en el vector /Revisar nulo, return
				for(int i=0;i<Inicio.vectorClientes.length;i++) {
					if(Inicio.vectorClientes[i] == null) {
					Inicio.vectorClientes[i] = clienteNuevo;
					}
				}
				
				avisarCorrecto();
				return;
			}
		});
		
		textFechaNacimiento = new JTextField();
		textFechaNacimiento.setToolTipText("Día");
		textFechaNacimiento.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textFechaNacimiento.setColumns(10);
		textFechaNacimiento.setBounds(218, 154, 161, 20);
		contentPane.add(textFechaNacimiento);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaNacimiento.setForeground(Color.WHITE);
		lblFechaNacimiento.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblFechaNacimiento.setBounds(19, 154, 178, 20);
		contentPane.add(lblFechaNacimiento);
	}
	
	private void avisarCorrecto() {
		JOptionPane.showMessageDialog(null, "Cliente guardado correctamente.");
		textCedula.setText("");
		textNombreCliente.setText("");
		textEmail.setText("");
		textFechaNacimiento.setText("");
	}
}