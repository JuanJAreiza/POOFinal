package Coco;
import java.util.Scanner;
public class HDoble extends Habitacion{

	static Scanner sc = new Scanner(System.in);

	String foto;
	int precio = 0;
	
	public String MostrarPrecio() {
		
		precio = 100000;
		String nprecio = Integer.toString(precio);
		
		return nprecio;
		
	}
	
	public void Clonar() {
		
	}
	
}