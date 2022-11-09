package Coco;

import Clases.Inicio;
import Formularios.frmAgregarCliente;

public class clsCliente 
{
	public void AgregarCliente() 
	{
		
		frmAgregarCliente agrega = new frmAgregarCliente();
		Inicio.contador++;
		int i = Inicio.contador;
		
		if(Inicio.Cliente[i][0] == null)
		{
				Inicio.Cliente[i][0] = agrega.textCedula.getText();
				Inicio.Cliente[i][1] = agrega.textNombreCliente.getText();
				Inicio.Cliente[i][2] = agrega.textEmail.getText();
				Inicio.Cliente[i][3] = agrega.textFechaNacimiento.getText();
		}
		else
		{
			
		}
		
	}
	
	public void BorrarCliente() {
		
	}
	
	public void VerCliente() {
		
	}
}
