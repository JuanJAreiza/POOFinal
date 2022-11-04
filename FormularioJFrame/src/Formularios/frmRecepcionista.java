package Formularios;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;

public class frmRecepcionista extends JFrame implements ActionListener{
	
    public frmRecepcionista() {
    	setTitle("Recepcionista");
    	setBounds(750, 300, 560, 457);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        
        JButton btnListaHab = new JButton("Habitaciones");
        btnListaHab.setBounds(179, 71, 183, 42);
        btnListaHab.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmHabitaciones frmHabitaciones = new frmHabitaciones();
    			frmHabitaciones.setVisible(true);
    			setVisible(false);
        	}
        });
        getContentPane().setLayout(null);
        btnListaHab.setFont(new Font("Ebrima", Font.BOLD, 15));
        getContentPane().add(btnListaHab);
        
        JButton btnClientes = new JButton("Clientes");
        btnClientes.setBounds(179, 136, 183, 42);
        btnClientes.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmClientes frmClientes = new frmClientes();
    			frmClientes.setVisible(true);
    			setVisible(false);
        	}
        });
        btnClientes.setFont(new Font("Ebrima", Font.BOLD, 15));
        getContentPane().add(btnClientes);
        
        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(208, 287, 121, 29);
        btnVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmMenu frmMenu = new frmMenu();
    			frmMenu.setVisible(true);
    			setVisible(false);
        	}
        });
        btnVolver.setFont(new Font("Ebrima", Font.BOLD, 15));
        getContentPane().add(btnVolver);
        
        JButton btnReservas = new JButton("Reservas");
        btnReservas.setBounds(179, 201, 183, 42);
        btnReservas.setFont(new Font("Ebrima", Font.BOLD, 15));
        getContentPane().add(btnReservas);
        btnReservas.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmReservacion frmReservacion = new frmReservacion();
    			frmReservacion.setVisible(true);
    			setVisible(false);
        	}
        });
        
        JMenuBar MenuBar = new JMenuBar();
        MenuBar.setBackground(new Color(0, 0, 0));
        MenuBar.setFont(new Font("Arial", Font.PLAIN, 14));
        setJMenuBar(MenuBar);

        JMenu menuRecepcionista = new JMenu("Menu");
        menuRecepcionista.setForeground(new Color(255, 255, 255));
        menuRecepcionista.setFont(new Font("Ebrima", Font.PLAIN, 16));
        MenuBar.add(menuRecepcionista);
   
        JMenuItem mntmHabitaciones = new JMenuItem("Habitaciones");
        mntmHabitaciones.setForeground(new Color(0, 0, 0));
        mntmHabitaciones.setBackground(new Color(238, 238, 238));
        mntmHabitaciones.setHorizontalAlignment(SwingConstants.CENTER);
        mntmHabitaciones.setIcon(null);
        mntmHabitaciones.setFont(new Font("Ebrima", Font.PLAIN, 14));
        mntmHabitaciones.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmHabitaciones frmHabitaciones = new frmHabitaciones();
    			frmHabitaciones.setVisible(true);
    			setVisible(false);					//HACE VISIBLE EL CONSTRUCTOR
        	}
        });

        menuRecepcionista.add(mntmHabitaciones);
        
        JMenuItem mntmClientes = new JMenuItem("Clientes");
        mntmClientes.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmClientes frmClientes = new frmClientes();
    			frmClientes.setVisible(true);
    			setVisible(false);
        	}
        });
        mntmClientes.setBackground(new Color(238, 238, 238));
        mntmClientes.setFont(new Font("Ebrima", Font.PLAIN, 14));
        menuRecepcionista.add(mntmClientes);
        
        JMenuItem mntmReservas = new JMenuItem("Reservas");
        mntmReservas.setFont(new Font("Ebrima", Font.PLAIN, 14));
        mntmReservas.setBackground(new Color(238, 238, 238));
        menuRecepcionista.add(mntmReservas);
        
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
		
		frmMenu frmMenu = new frmMenu();
		frmMenu.setVisible(true);
		setVisible(false);
		
		}
	}



