package Formularios;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;

public class frmHabitaciones extends JFrame implements ActionListener{
	
    public frmHabitaciones() {
    	setTitle("Habitaciones");
    	setBounds(750, 300, 560, 457);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	getContentPane().setBackground(new Color(0, 0, 0));
        getContentPane().setLayout(null);
        
        JButton btnHabSimple = new JButton("Habitación Simple");
        btnHabSimple.setFont(new Font("Ebrima", Font.BOLD, 15));
        btnHabSimple.setBounds(170, 71, 201, 42);
        getContentPane().add(btnHabSimple);
        btnHabSimple.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmHabSimple frmHabSimple = new frmHabSimple();
        		frmHabSimple.setVisible(true);
        	}
        });
        
        
        JButton btnHabDoble = new JButton("Habitación Doble");
        btnHabDoble.setFont(new Font("Ebrima", Font.BOLD, 15));
        btnHabDoble.setBounds(170, 136, 201, 42);
        getContentPane().add(btnHabDoble);
        btnHabDoble.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            	frmHabDoble frmHabDoble = new frmHabDoble();
            	frmHabDoble.setVisible(true);
        	}
        });
        
        JButton btnVolver = new JButton("Volver");
        btnVolver.setFont(new Font("Ebrima", Font.BOLD, 15));
        btnVolver.setBounds(208, 287, 121, 29);
        getContentPane().add(btnVolver);
        btnVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmRecepcionista frmRecepcionista = new frmRecepcionista();
    			frmRecepcionista.setVisible(true);
    			setVisible(false);
        	}
        });
        
        JButton btnHabMatrimonial = new JButton("Habitación Matrimonial");
        btnHabMatrimonial.setFont(new Font("Ebrima", Font.BOLD, 15));
        btnHabMatrimonial.setBounds(170, 201, 201, 42);
        getContentPane().add(btnHabMatrimonial);
        btnHabMatrimonial.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            	frmHabMatrimonial frmHabMatrimonial = new frmHabMatrimonial();
            	frmHabMatrimonial.setVisible(true);
        	}
        });
        
        JMenuBar MenuBar = new JMenuBar();
        MenuBar.setBackground(new Color(0, 0, 0));
        MenuBar.setFont(new Font("Arial", Font.PLAIN, 14));
        setJMenuBar(MenuBar);

        JMenu menuHabitaciones = new JMenu("Menu");
        menuHabitaciones.setForeground(new Color(255, 255, 255));
        menuHabitaciones.setFont(new Font("Ebrima", Font.PLAIN, 16));
        MenuBar.add(menuHabitaciones);
   
        JMenuItem mntmHabSimple = new JMenuItem("Habitación Simple");
        mntmHabSimple.setForeground(new Color(0, 0, 0));
        mntmHabSimple.setBackground(new Color(238, 238, 238));
        mntmHabSimple.setHorizontalAlignment(SwingConstants.LEFT);
        mntmHabSimple.setFont(new Font("Ebrima", Font.PLAIN, 14));
        mntmHabSimple.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            	frmHabSimple frmHabSimple = new frmHabSimple();
            	frmHabSimple.setVisible(true);
        	}
        });

        menuHabitaciones.add(mntmHabSimple);
        
        JMenuItem mntmHabDoble = new JMenuItem("Habitación Doble");
        mntmHabDoble.setHorizontalAlignment(SwingConstants.LEFT);
        mntmHabDoble.setBackground(new Color(238, 238, 238));
        mntmHabDoble.setFont(new Font("Ebrima", Font.PLAIN, 14));
        menuHabitaciones.add(mntmHabDoble);
        mntmHabDoble.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            	frmHabDoble frmHabDoble = new frmHabDoble();
            	frmHabDoble.setVisible(true);
        	}
        });
        
        JMenuItem mntmHabMatrimonial = new JMenuItem("Habitación Matrimonial");
        mntmHabMatrimonial.setHorizontalAlignment(SwingConstants.LEFT);
        mntmHabMatrimonial.setFont(new Font("Ebrima", Font.PLAIN, 14));
        mntmHabMatrimonial.setBackground(new Color(238, 238, 238));
        menuHabitaciones.add(mntmHabMatrimonial);
        mntmHabMatrimonial.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            	frmHabMatrimonial frmHabMatrimonial = new frmHabMatrimonial();
            	frmHabMatrimonial.setVisible(true);
        	}
        });
        
        JMenu menuOpciones = new JMenu("Opciones");
        menuOpciones.setForeground(new Color(255, 255, 255));
        menuOpciones.setFont(new Font("Ebrima", Font.PLAIN, 16));
        MenuBar.add(menuOpciones);
                
        JMenuItem mntmVolver = new JMenuItem("Volver");
        menuOpciones.add(mntmVolver);
        mntmVolver.setFont(new Font("Ebrima", Font.PLAIN, 14));
        mntmVolver.setIcon(null);
        mntmVolver.addActionListener(this);
        mntmVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmRecepcionista frmRecepcionista = new frmRecepcionista();
    			setVisible(false);
        	}
        });
        
        JMenuItem mntmSalir = new JMenuItem("Salir");
        mntmSalir.setFont(new Font("Ebrima", Font.PLAIN, 14));
        menuOpciones.add(mntmSalir);
    }

	public void actionPerformed(ActionEvent eventoClick) {
		frmRecepcionista frmRecepcionista = new frmRecepcionista();
		frmRecepcionista.setVisible(true);
		setVisible(false);
	}
}


