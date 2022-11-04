package Formularios;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;

public class frmClientes extends JFrame implements ActionListener{
	
    public frmClientes() {
    	setTitle("Clientes");
    	setBounds(750, 300, 560, 457);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	getContentPane().setBackground(new Color(0, 0, 0));
        getContentPane().setLayout(null);
        
        JButton btnAgregarCliente = new JButton("Agregar Cliente");
        btnAgregarCliente.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmAgregarCliente frmAgregarCliente = new frmAgregarCliente();
        		frmAgregarCliente.setVisible(true);
        	}
        });
        btnAgregarCliente.setFont(new Font("Ebrima", Font.BOLD, 15));
        btnAgregarCliente.setBounds(170, 71, 201, 42);
        getContentPane().add(btnAgregarCliente);
        
        JButton btnEditarCliente = new JButton("Editar Cliente");
        btnEditarCliente.setFont(new Font("Ebrima", Font.BOLD, 15));
        btnEditarCliente.setBounds(170, 200, 201, 42);
        getContentPane().add(btnEditarCliente);
        
        JButton btnSalir = new JButton("Volver");
        btnSalir.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmRecepcionista frmRecepcionista = new frmRecepcionista();
    			frmRecepcionista.setVisible(true);
    			setVisible(false);
        	}
        });
        btnSalir.setFont(new Font("Ebrima", Font.BOLD, 15));
        btnSalir.setBounds(208, 287, 121, 29);
        getContentPane().add(btnSalir);
        
        JButton btnVerCliente = new JButton("Ver Cliente");
        btnVerCliente.setFont(new Font("Ebrima", Font.BOLD, 15));
        btnVerCliente.setBounds(170, 136, 201, 42);
        getContentPane().add(btnVerCliente);
        JMenuBar MenuBar = new JMenuBar();
        MenuBar.setBackground(new Color(0, 0, 0));
        MenuBar.setFont(new Font("Arial", Font.PLAIN, 14));
        setJMenuBar(MenuBar);

        JMenu menuClientes = new JMenu("Menu");
        menuClientes.setForeground(new Color(255, 255, 255));
        menuClientes.setFont(new Font("Ebrima", Font.PLAIN, 16));
        MenuBar.add(menuClientes);
   
        JMenuItem mntmAgregarCliente = new JMenuItem("Agregar Cliente");
        mntmAgregarCliente.setForeground(new Color(0, 0, 0));
        mntmAgregarCliente.setBackground(new Color(238, 238, 238));
        mntmAgregarCliente.setHorizontalAlignment(SwingConstants.LEFT);
        mntmAgregarCliente.setIcon(null);
        mntmAgregarCliente.setFont(new Font("Ebrima", Font.PLAIN, 14));
        mntmAgregarCliente.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            	frmCliente frmCliente = new frmCliente();
    			frmCliente.setVisible(true);						//HACE VISIBLE EL CONSTRUCTOR
        	}
        });

        menuClientes.add(mntmAgregarCliente);
        
        JMenuItem mntmVerCliente = new JMenuItem("Ver Cliente");
        mntmVerCliente.setHorizontalAlignment(SwingConstants.LEFT);
        mntmVerCliente.setBackground(new Color(238, 238, 238));
        mntmVerCliente.setFont(new Font("Ebrima", Font.PLAIN, 14));
        menuClientes.add(mntmVerCliente);
        
        JMenuItem mntmEditarCliente = new JMenuItem("Editar Cliente");
        mntmEditarCliente.setHorizontalAlignment(SwingConstants.LEFT);
        mntmEditarCliente.setFont(new Font("Ebrima", Font.PLAIN, 14));
        mntmEditarCliente.setBackground(new Color(238, 238, 238));
        menuClientes.add(mntmEditarCliente);
        
        JMenu menuOpciones = new JMenu("Opciones");
        menuOpciones.setForeground(new Color(255, 255, 255));
        menuOpciones.setFont(new Font("Ebrima", Font.PLAIN, 16));
        MenuBar.add(menuOpciones);
                
        JMenuItem mntmVolver = new JMenuItem("Volver");
        mntmVolver.setFont(new Font("Ebrima", Font.PLAIN, 14));
        mntmVolver.setIcon(null);
        mntmVolver.addActionListener(this);
        
        
        menuOpciones.add(mntmVolver);
        
        JMenuItem mntmSalir_1 = new JMenuItem("Salir");
        mntmSalir_1.setFont(new Font("Ebrima", Font.PLAIN, 14));
        menuOpciones.add(mntmSalir_1);
        
    }

	public void actionPerformed(ActionEvent eventoClick) {
		frmRecepcionista frmRecepcionista = new frmRecepcionista();
		frmRecepcionista.setVisible(true);
		setVisible(false);
	}
}


