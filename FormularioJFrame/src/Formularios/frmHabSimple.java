package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Coco.HSimple;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class frmHabSimple extends JFrame {

	private JPanel contentPane;
	private JTextField textPrecioNoche;

	public frmHabSimple() {
		setTitle("Habitación simple");
		
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
		
		
		//CREAMOS EL OBJETO HSIMPLE
		HSimple simple = new HSimple();
		
		textPrecioNoche = new JTextField();
		//LLAMAMOS EL METODO MOSTRAR PRECIO
		textPrecioNoche.setText(simple.MostrarPrecio());
		
		textPrecioNoche.setFont(new Font("Ebrima", Font.PLAIN, 14));
		textPrecioNoche.setColumns(10);
		textPrecioNoche.setBounds(218, 31, 106, 20);
		contentPane.add(textPrecioNoche);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Ebrima", Font.BOLD, 15));
		btnVolver.setBounds(156, 234, 121, 29);
		contentPane.add(btnVolver);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(frmHabSimple.class.getResource("/Imagenes/HabSimple.png")));
		lblNewLabel.setBounds(57, 61, 342, 163);
		contentPane.add(lblNewLabel);
		btnVolver.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
    			setVisible(false);
        	}
        });
	}
}
