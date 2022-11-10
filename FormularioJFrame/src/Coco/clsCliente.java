package Coco;

import Clases.Inicio;
import Formularios.frmAgregarCliente;
import Formularios.frmVerCliente;

public class clsCliente 
{
	public void AgregarCliente() 
	{
		frmAgregarCliente agrega = new frmAgregarCliente();
		
		for (int i=0;i<=4;i++) {
			if(Inicio.Cliente[i][0] == null)
			{
				Inicio.Cliente[i][0] = agrega.textCedula.getText();
				Inicio.Cliente[i][1] = agrega.textNombreCliente.getText();
				Inicio.Cliente[i][2] = agrega.textEmail.getText();
				Inicio.Cliente[i][3] = agrega.textFechaNacimiento.getText();
			}
		}
		}
	
	public void EditarCliente()
	{
		frmAgregarCliente editar = new frmAgregarCliente();
		
		for (int i=0;i<=4;i++) {
			if(Inicio.Cliente[i][0] == editar.textCedula.getText())
			{
				Inicio.Cliente[i][0] = editar.textCedula.getText();
				Inicio.Cliente[i][1] = editar.textNombreCliente.getText();
				Inicio.Cliente[i][2] = editar.textEmail.getText();
				Inicio.Cliente[i][3] = editar.textFechaNacimiento.getText();
			}
		}
		}
	
	public void VerCliente()
	{
		frmVerCliente ver = new frmVerCliente();
		
		for (int i=0;i<=4;i++) {
			if(Inicio.Cliente[i][0] == ver.textBuscarCedula.getText())
			{
				ver.textCedula.setText(Inicio.Cliente[i][0]);
				ver.textNombre.setText(Inicio.Cliente[i][1]);
				ver.textEmail.setText(Inicio.Cliente[i][2]);
				ver.textFechaNacimiento.setText(Inicio.Cliente[i][3]);
			}
	}	
}}
