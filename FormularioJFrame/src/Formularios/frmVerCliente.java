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

public class frmVerCliente extends JFrame {

	private JPanel contentPane;
	public JTextField textBuscarCedula;
	private JButton btnVerCliente;
	public JTextField textCedula;
	public JTextField textNombre;
	public JTextField textEmail;
	public JTextField textFechaNacimiento;

	public frmVerCliente() {
		setTitle("Ver cliente");
    	setBounds(750, 300, 440, 332);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBuscarCdula = new JLabel("Ingrese la cédula del cliente que desea ver:");
		lblBuscarCdula.setForeground(Color.WHITE);
		lblBuscarCdula.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuscarCdula.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblBuscarCdula.setBounds(-14, 21, 359, 20);
		contentPane.add(lblBuscarCdula);
		
		textBuscarCedula = new JTextField();
		textBuscarCedula.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textBuscarCedula.setColumns(10);
		textBuscarCedula.setBounds(22, 52, 161, 20);
		contentPane.add(textBuscarCedula);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnVolver.setBounds(268, 235, 121, 29);
		contentPane.add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
    			frmClientes Clientes = new frmClientes();
    			Clientes.setVisible(true);
        	
        	}
        });
		
		JButton btnVerCliente = new JButton("Ver");
		btnVerCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cedulaBuscar = "";
				
				//DIGITAR Y CAPTURAR
				if(textBuscarCedula.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Por favor digite la cedula.");
					return;
				}
				
				//Garantizar que sea número (pendiente)
				cedulaBuscar = textBuscarCedula.getText();
				
				
				//BUSCAR
				for(int i=0;i<Inicio.vectorClientes.length;i++) {
					/*if(Inicio.vectorClientes[i] == null) {
						System.out.println("Nulo en la posición " + i);
						avisarNulo();
						return;
					}*/
					if(Integer.valueOf(cedulaBuscar) == Inicio.vectorClientes[i].getCedula()){
						mostrarCliente(Inicio.vectorClientes[i]);
						return;
					}
				}
				avisarNulo();
				
				
				//IMPRIMIR
				//mostrarCliente(Inicio.vectorClientes[0]);
				
				
			}
		});
		btnVerCliente.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnVerCliente.setBounds(268, 52, 121, 29);
		contentPane.add(btnVerCliente);
		
		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCedula.setForeground(Color.WHITE);
		lblCedula.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblCedula.setBounds(10, 112, 133, 20);
		contentPane.add(lblCedula);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblNombre.setBounds(10, 143, 133, 20);
		contentPane.add(lblNombre);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblEmail.setBounds(10, 174, 133, 20);
		contentPane.add(lblEmail);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha nacimiento:");
		lblFechaNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaNacimiento.setForeground(Color.WHITE);
		lblFechaNacimiento.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblFechaNacimiento.setBounds(10, 205, 133, 20);
		contentPane.add(lblFechaNacimiento);
		
		textCedula = new JTextField();
		textCedula.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textCedula.setColumns(10);
		textCedula.setBounds(153, 112, 161, 20);
		contentPane.add(textCedula);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textNombre.setColumns(10);
		textNombre.setBounds(153, 143, 161, 20);
		contentPane.add(textNombre);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textEmail.setColumns(10);
		textEmail.setBounds(153, 174, 161, 20);
		contentPane.add(textEmail);
		
		textFechaNacimiento = new JTextField();
		textFechaNacimiento.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textFechaNacimiento.setColumns(10);
		textFechaNacimiento.setBounds(153, 205, 161, 20);
		contentPane.add(textFechaNacimiento);
		
		/*btnVerCliente.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		clsCliente cliente = new clsCliente();
				cliente.VerCliente();
        	}
        });*/
		
	}
	
	private void mostrarCliente(Cliente usuario) {
		
		textCedula.setText(String.valueOf(usuario.getCedula()));
		textNombre.setText(usuario.getNombre());
		textEmail.setText(usuario.getEmail());
		textFechaNacimiento.setText(usuario.getFechaNacimiento());
			
		
	}
	
	private void avisarNulo() {
		JOptionPane.showMessageDialog(null, "El cliente no se encontró.");
		textBuscarCedula.setText("");
		textCedula.setText("");
		textNombre.setText("");
		textEmail.setText("");
		textFechaNacimiento.setText("");
	}
	
}