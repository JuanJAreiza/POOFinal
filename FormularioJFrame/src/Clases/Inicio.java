package Clases;

import javax.swing.JOptionPane;

import Formularios.frmMenu;

public class Inicio {
	
	String matrizClientes [][] = new String [5][4];
    public static void main(String[] ar) {
    	int respuesta = JOptionPane.showConfirmDialog(null,"¿Desea ingresar al sistema?");
    	if (JOptionPane.OK_OPTION == respuesta){
        	frmMenu frmMenu = new frmMenu();
        	frmMenu.setVisible(true);
        }
    }    
    


}

