package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Coco.HDoble;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class frmHabDoble extends JFrame {

	private JPanel contentPane;
	private JTextField textPrecioNoche;
	private JLabel lblNewLabel;

	public frmHabDoble() {
		setTitle("Habitación doble");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750, 300, 440, 332);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrecioNoche = new JLabel("Precio por noche:");
		lblPrecioNoche.setForeground(Color.WHITE);
		lblPrecioNoche.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrecioNoche.setFont(new Font("Ebrima", Font.PLAIN, 15));
		lblPrecioNoche.setBounds(37, 31, 161, 20);
		contentPane.add(lblPrecioNoche);
		
		
		
		HDoble doble = new HDoble();
		textPrecioNoche = new JTextField();
		
		
		textPrecioNoche.setText(doble.MostrarPrecio());
		textPrecioNoche.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textPrecioNoche.setColumns(10);
		textPrecioNoche.setBounds(218, 31, 106, 20);
		contentPane.add(textPrecioNoche);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnVolver.setBounds(154, 243, 121, 29);
		contentPane.add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
    			setVisible(false);
        	}
        });
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(frmHabDoble.class.getResource("/Imagenes/habitacion doble.jpg")));
		lblNewLabel.setBounds(57, 61, 342, 163);
		contentPane.add(lblNewLabel);
	}
}
