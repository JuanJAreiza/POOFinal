package Clases;

import javax.swing.JOptionPane;

import Coco.*;
import Formularios.frmMenu;

public class Inicio {
	
	public static Cliente vectorClientes[] = new Cliente[5];
	public static String Cliente[][] = new String [5][4];
	public static String Habitaciones[][] = new String [15][4];
	public static String Reserva[][] = new String [10][4];
	public static int contador = 0;
	
    public static void main(String[] ar) {
    	
    	Cliente usuario1 = new Cliente();
    	usuario1.setCedula(54);
    	usuario1.setNombre("Juan");
    	usuario1.setEmail("juan@hotmail.com");
    	usuario1.setFechaNacimiento("1994");
    	vectorClientes[0] = usuario1;
    	
    	Cliente usuario2 = new Cliente();
    	usuario2.setCedula(35);
    	usuario2.setNombre("Mateo");
    	usuario2.setEmail("mateo@hotmail.com");
    	usuario2.setFechaNacimiento("1978");
    	vectorClientes[1] = usuario2;
    	
    	Cliente usuario3 = new Cliente();
    	usuario3.setCedula(46);
    	usuario3.setNombre("Nicolas");
    	usuario3.setEmail("nicolas@hotmail.com");
    	usuario3.setFechaNacimiento("1954");
    	vectorClientes[2] = usuario3;
    	
    	
    	/*Inicio.Cliente[0][0]= "98";
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
    	Inicio.Cliente[2][3]= "1998 - 05 - 04";*/
    	
    	int respuesta = JOptionPane.showConfirmDialog(null,"¿Desea ingresar al sistema?");
    	if (JOptionPane.OK_OPTION == respuesta){
        	frmMenu frmMenu = new frmMenu();
        	frmMenu.setVisible(true);
        }
    }    
}

