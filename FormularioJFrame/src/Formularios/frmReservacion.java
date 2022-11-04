package Formularios;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;

public class frmReservacion extends JFrame implements ActionListener{

	public frmReservacion() {
		setTitle("Menú de reservas");
    	setBounds(750, 300, 560, 457);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnRecepcionista = new JMenu("Menu");
		mnRecepcionista.setIcon(null);
		mnRecepcionista.setFont(new Font("Ebrima", Font.PLAIN, 16));
		menuBar.add(mnRecepcionista);
		
		JMenuItem mntmReservar = new JMenuItem("Reservar");
		mntmReservar.setFont(new Font("Ebrima", Font.PLAIN, 14));
		mnRecepcionista.add(mntmReservar);
		mntmReservar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmReservar frmReservar = new frmReservar();
    			frmReservar.setVisible(true);
        	}
        });
		
		JMenuItem mntmEliminarReserva = new JMenuItem("Eliminar reserva");
		mntmEliminarReserva.setFont(new Font("Ebrima", Font.PLAIN, 14));
		mnRecepcionista.add(mntmEliminarReserva);
		mntmEliminarReserva.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmEliminarReserva frmEliminarReserva = new frmEliminarReserva();
        		frmEliminarReserva.setVisible(true);
        	}
        });
		
		JMenuItem mntmImprimirReserva = new JMenuItem("Imprimir reserva");
		mntmImprimirReserva.setFont(new Font("Ebrima", Font.PLAIN, 14));
		mnRecepcionista.add(mntmImprimirReserva);
		mntmImprimirReserva.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmImprimirReserva frmImprimirReserva = new frmImprimirReserva();
        		frmImprimirReserva.setVisible(true);
        	}
        });
		
		JMenu mnOpciones = new JMenu("Opciones");
		mnOpciones.setIcon(null);
		mnOpciones.setFont(new Font("Ebrima", Font.PLAIN, 16));
		menuBar.add(mnOpciones);
		
		JMenuItem mntmVolver = new JMenuItem("Volver");
		mntmVolver.setFont(new Font("Ebrima", Font.PLAIN, 14));
		mnOpciones.add(mntmVolver);
		mntmVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmRecepcionista frmRecepcionista = new frmRecepcionista();
    			frmRecepcionista.setVisible(true);
    			setVisible(false);
        	}
        });
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.setFont(new Font("Ebrima", Font.PLAIN, 14));
		mnOpciones.add(mntmSalir);
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnReservar = new JButton("Reservar");
		btnReservar.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnReservar.setBounds(179, 71, 183, 42);
		contentPane.add(btnReservar);
		btnReservar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmReservar frmReservar = new frmReservar();
    			frmReservar.setVisible(true);
        	}
        });
		
		JButton btnEliminar = new JButton("Eliminar reserva");
		btnEliminar.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnEliminar.setBounds(179, 124, 183, 42);
		contentPane.add(btnEliminar);
		btnEliminar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmEliminarReserva frmEliminarReserva = new frmEliminarReserva();
        		frmEliminarReserva.setVisible(true);
        	}
        });
		
		JButton btnImprimirReserva = new JButton("Imprimir reserva");
		btnImprimirReserva.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnImprimirReserva.setBounds(179, 177, 183, 42);
		contentPane.add(btnImprimirReserva);
		btnImprimirReserva.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmImprimirReserva frmImprimirReserva = new frmImprimirReserva();
        		frmImprimirReserva.setVisible(true);
        	}
        });
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnVolver.setBounds(208, 287, 121, 29);
		contentPane.add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmRecepcionista frmRecepcionista = new frmRecepcionista();
    			frmRecepcionista.setVisible(true);
    			setVisible(false);
        	}
        });
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
