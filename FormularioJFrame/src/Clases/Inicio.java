package Clases;

import javax.swing.JOptionPane;

import Formularios.frmMenu;

public class Inicio {
	
	public static String Cliente[][] = new String [5][4];
	public static String Habitaciones[][] = new String [15][4];
	public static String Reserva[][] = new String [10][4];
	public static int contador = 0;
	
    public static void main(String[] ar) {
    	Inicio.Cliente[0][0]= "98";
    	Inicio.Cliente[0][1]= "Nicolas Vélez";
    	Inicio.Cliente[0][2]= "nicorico@gmail.com";
    	Inicio.Cliente[0][3]= "1997 - 03 - 22";
    	
    	Inicio.Cliente[1][0]= "25";
    	Inicio.Cliente[1][1]= "Teo Mauricio";
    	Inicio.Cliente[1][2]= "teotemorboseo@gmail.com";
    	Inicio.Cliente[1][3]= "1999 - 06 - 10";
    	
    	Inicio.Cliente[2][0]= "35";
    	Inicio.Cliente[2][1]= "Areiza Mauricio";
    	Inicio.Cliente[2][2]= "areizateareiza@gmail.com";
    	Inicio.Cliente[2][3]= "1998 - 05 - 04";
    	
    	int respuesta = JOptionPane.showConfirmDialog(null,"¿Desea ingresar al sistema?");
    	if (JOptionPane.OK_OPTION == respuesta){
        	frmMenu frmMenu = new frmMenu();
        	frmMenu.setVisible(true);
        }
    	for (int i = 0 ; i <= 3 ; i++)
    	{
    		for(int j = 0 ; j <= 3 ; j++)
    		{
    			System.out.println(Inicio.Cliente[i][j]);
    		}
    	}
    }    
}

