package Coco;

import Clases.Inicio;
import Formularios.frmAgregarCliente;
import Formularios.frmEditarCliente;
import Formularios.frmVerCliente;

public class clsCliente 
{
	public void AgregarCliente() 
	{
		frmAgregarCliente agregar = new frmAgregarCliente();
		
		for (int i=0;i<=4;i++) {
			//clsCliente clsCliente = new clsCliente();
			//clsCliente.Comparador(Inicio.Cliente[i][0], null);
			if(Inicio.Cliente[i][0] == null)
			{
				Inicio.Cliente[i][0] = agregar.textCedula.getText();
				Inicio.Cliente[i][1] = agregar.textNombreCliente.getText();
				Inicio.Cliente[i][2] = agregar.textEmail.getText();
				Inicio.Cliente[i][3] = agregar.textFechaNacimiento.getText();
			}
		}
		}
	
	public void EditarCliente()
	{
		frmEditarCliente editar = new frmEditarCliente();
		
		
		}
	
	public void VerCliente()
	{
		frmVerCliente ver = new frmVerCliente();
		
		for (int i=0;i<=4;i++) {
			/*clsCliente clsCliente = new clsCliente();
			clsCliente.Comparador(Inicio.Cliente[i][0], ver.textBuscarCedula.getText());*/
			if(Inicio.Cliente[i][0] == ver.textBuscarCedula.getText()) //Volverlo un metodo, hacer la comparativa. Hacerlo un booleano, que retorne true o false.
			{
				ver.textCedula.setText(Inicio.Cliente[i][0]);
				ver.textNombre.setText(Inicio.Cliente[i][1]);
				ver.textEmail.setText(Inicio.Cliente[i][2]);
				ver.textFechaNacimiento.setText(Inicio.Cliente[i][3]);
			}
	}	
	}
	
	/*public boolean Comparador(String comp1, String comp2) {
		boolean resultado = false;
		if(comp1 == comp2) {
			resultado = true;
		}
		return resultado;
	}*/
	
}
