package Coco;
import java.util.Scanner;
public class HSimple extends Habitacion{

	static Scanner sc = new Scanner(System.in);
	
	String foto;
	int precio = 0;
	
	
	public void MostrarFoto() {
		
	}
	
	public String MostrarPrecio() {
		
		precio = 50000;
		String nprecio = Integer.toString(precio);
		
		return nprecio;
		
	}
	
	public void Clonar() {
		
	}

}
