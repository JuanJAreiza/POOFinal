package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmAdministrador extends JFrame {

	private JPanel contentPane;

	public frmAdministrador() {
		setTitle("Administrador");
    	setBounds(750, 300, 560, 457);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCalcularGanancias = new JButton("Calcular ganancias mensuales");
		btnCalcularGanancias.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnCalcularGanancias.setBounds(149, 221, 250, 42);
		contentPane.add(btnCalcularGanancias);
		btnCalcularGanancias.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {

        		
        		
        	}
        });
		
		JButton btnCamPrecio = new JButton("Cambiar precio habitación");
		btnCamPrecio.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnCamPrecio.setBounds(150, 102, 249, 42);
		contentPane.add(btnCamPrecio);
		btnCamPrecio.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {

        		
        		
        	}
        });
		
		JButton btnCambiarDescuento = new JButton("Cambiar descuento");
		btnCambiarDescuento.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnCambiarDescuento.setBounds(149, 160, 250, 42);
		contentPane.add(btnCambiarDescuento);
		btnCambiarDescuento.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {

        		
        		
        	}
        });
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnVolver.setBounds(212, 300, 121, 29);
		contentPane.add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frmMenu frmMenu = new frmMenu();
    			frmMenu.setVisible(true);
    			setVisible(false);
        	}
        });
	}

}
