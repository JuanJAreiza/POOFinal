package Clases;

import javax.swing.JOptionPane;

import Formularios.frmMenu;

public class Inicio {
	
	public static String Cliente[][] = new String [5][4];
	public static String Habitaciones[][] = new String [15][4];
	public static String Reserva[][] = new String [10][4];
	public static int contador = 0;
    public static void main(String[] ar) {
    	int respuesta = JOptionPane.showConfirmDialog(null,"¿Desea ingresar al sistema?");
    	if (JOptionPane.OK_OPTION == respuesta){
        	frmMenu frmMenu = new frmMenu();
        	frmMenu.setVisible(true);
        }
    }    
}

