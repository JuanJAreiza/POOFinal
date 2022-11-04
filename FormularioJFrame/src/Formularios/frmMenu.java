package Formularios;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;

public class frmMenu extends JFrame implements ActionListener{
	
    public frmMenu() {
    	setTitle("Menú principal");
    	setBounds(750, 300, 560, 457);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        getContentPane().setLayout(null);
        
        JButton btnRecepcionista = new JButton("Recepcionista");
        btnRecepcionista.setFont(new Font("Ebrima", Font.BOLD, 15));
        btnRecepcionista.setBounds(200, 93, 138, 42);
        getContentPane().add(btnRecepcionista);
        btnRecepcionista.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmRecepcionista frmRecepcionista = new frmRecepcionista();
    			frmRecepcionista.setVisible(true);
    			setVisible(false);
        	}
        });
        
        
        JButton btnAdministrador = new JButton("Administrador");
        btnAdministrador.setFont(new Font("Ebrima", Font.BOLD, 15));
        btnAdministrador.setBounds(200, 158, 138, 42);
        getContentPane().add(btnAdministrador);
        btnAdministrador.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmAdministrador frmAdministrador = new frmAdministrador();
        		frmAdministrador.setVisible(true);
    			setVisible(false);
        	}
        });
        
        JButton btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Ebrima", Font.BOLD, 15));
        btnSalir.setBounds(208, 287, 121, 29);
        getContentPane().add(btnSalir);
        JMenuBar MenuBar = new JMenuBar();
        MenuBar.setBackground(new Color(0, 0, 0));
        MenuBar.setFont(new Font("Arial", Font.PLAIN, 14));
        setJMenuBar(MenuBar);

        JMenu menuIngreso = new JMenu("Menu");
        menuIngreso.setForeground(new Color(255, 255, 255));
        menuIngreso.setFont(new Font("Ebrima", Font.PLAIN, 16));
        MenuBar.add(menuIngreso);
   
        JMenuItem mntmRecepcionista = new JMenuItem("Recepcionista");
        mntmRecepcionista.setForeground(new Color(0, 0, 0));
        mntmRecepcionista.setBackground(new Color(238, 238, 238));
        mntmRecepcionista.setHorizontalAlignment(SwingConstants.CENTER);
        mntmRecepcionista.setIcon(null);
        mntmRecepcionista.setFont(new Font("Ebrima", Font.PLAIN, 14));
        mntmRecepcionista.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmRecepcionista frmRecepcionista = new frmRecepcionista();
    			frmRecepcionista.setVisible(true);
    			setVisible(false);					//HACE VISIBLE EL CONSTRUCTOR
        	}
        });

        menuIngreso.add(mntmRecepcionista);
        
        JMenuItem mntmAdministrador = new JMenuItem("Administrador");
        mntmAdministrador.setBackground(new Color(238, 238, 238));
        mntmAdministrador.setFont(new Font("Ebrima", Font.PLAIN, 14));
        menuIngreso.add(mntmAdministrador);
        
        JMenu menuOpciones = new JMenu("Opciones");
        menuOpciones.setForeground(new Color(255, 255, 255));
        menuOpciones.setFont(new Font("Ebrima", Font.PLAIN, 16));
        MenuBar.add(menuOpciones);
                
        JMenuItem mntmSalir = new JMenuItem("Salir");
        mntmSalir.setFont(new Font("Ebrima", Font.PLAIN, 14));
        mntmSalir.setIcon(null);
        mntmSalir.addActionListener(this);
        
        menuOpciones.add(mntmSalir);
    }

	public void actionPerformed(ActionEvent eventoClick) {
	}
}


