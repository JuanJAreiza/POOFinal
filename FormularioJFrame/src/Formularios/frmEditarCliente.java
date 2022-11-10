package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Inicio;
import Coco.clsCliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Color;

public class frmEditarCliente extends JFrame {

	private JPanel contentPane;
	public JTextField textCampoEditar;
	private JButton btnEditarCliente;
	private JTextField textField;
	private JLabel lblBuscarCdula_1;
	
	public frmEditarCliente() {
		setTitle("Editar cliente");
    	setBounds(750, 300, 440, 332);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBuscarCdula = new JLabel("¿Que dato desea editar?");
		lblBuscarCdula.setBounds(-128, 100, 420, 20);
		lblBuscarCdula.setForeground(Color.WHITE);
		lblBuscarCdula.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBuscarCdula.setFont(new Font("Ebrima", Font.PLAIN, 15));
		contentPane.add(lblBuscarCdula);
		
		String tipohab[] = {"Nombre", "Cédula", "Dirección", "Email", "Fecha de Nacimiento"}; 
		JComboBox cbxEditar = new JComboBox();
		cbxEditar.setBounds(72, 142, 298, 22);
		cbxEditar.setFont(new Font("Arial", Font.PLAIN, 14));
		cbxEditar.setModel(new DefaultComboBoxModel(tipohab));
		contentPane.add(cbxEditar);
		
		textCampoEditar = new JTextField();
		textCampoEditar.setBounds(131, 181, 161, 20);
		textCampoEditar.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textCampoEditar.setColumns(10);
		contentPane.add(textCampoEditar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(234, 227, 121, 29);
		btnVolver.setFont(new Font("Ebrima", Font.BOLD, 15));
		contentPane.add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
    			setVisible(false);
    			frmClientes Clientes = new frmClientes();
    			Clientes.setVisible(true);
        	}
        });
		
		btnEditarCliente = new JButton("Editar");
		btnEditarCliente.setBounds(71, 227, 121, 29);
		btnEditarCliente.setFont(new Font("Ebrima", Font.BOLD, 15));
		contentPane.add(btnEditarCliente);
		
		textField = new JTextField();
		textField.setBounds(131, 59, 161, 20);
		textField.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textField.setColumns(10);
		contentPane.add(textField);
		
		lblBuscarCdula_1 = new JLabel("Ingrese la cédula del cliente que desea Editar:");
		lblBuscarCdula_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBuscarCdula_1.setForeground(Color.WHITE);
		lblBuscarCdula_1.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblBuscarCdula_1.setBounds(-50, 29, 420, 20);
		contentPane.add(lblBuscarCdula_1);
		btnEditarCliente.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        				clsCliente cliente = new clsCliente();
        				cliente.EditarCliente();
        				avisarCorrecto();
        				String cedulaBuscar = "";
        				
        				if(textCampoEditar.getText().equals("")) {
        					JOptionPane.showMessageDialog(null, "Digite la cedula del usuario.");
        					return;
        				}
        				
        				cedulaBuscar = textCampoEditar.getText();
        				
        				for(int i=0;i<Inicio.vectorClientes.length;i++) {
        					/*if(Inicio.vectorClientes[i] == null) {
        						System.out.println("Nulo en la posición " + i);
        						avisarNulo();
        						return;
        					}*/
        					if(Integer.valueOf(cedulaBuscar) == Inicio.vectorClientes[i].getCedula()){
        						
        						
        						
        		    			
        						
        					}
        				}
        				
        				
        			}
        		});
	}
	
	private void avisarCorrecto() {
		JOptionPane.showMessageDialog(null, "Cliente editado correctamente.");
		
	}
	
}
