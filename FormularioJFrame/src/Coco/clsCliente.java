package Coco;

import Clases.Inicio;
import Formularios.frmAgregarCliente;
import Formularios.frmVerCliente;
import Formularios.EJEMPLOPROFE;

public class clsCliente 
{
	
	public String Nombre,email,FechaNacimiento;
	public int Celular,Cc;
	
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
		frmAgregarCliente agrega = new frmAgregarCliente();
		
		for (int i=0;i<=4;i++) {
			if(Inicio.Cliente[i][0] == agrega.textCedula.getText())
			{
				Inicio.Cliente[i][0] = agrega.textCedula.getText();
				Inicio.Cliente[i][1] = agrega.textNombreCliente.getText();
				Inicio.Cliente[i][2] = agrega.textEmail.getText();
				Inicio.Cliente[i][3] = agrega.textFechaNacimiento.getText();
			}
		}
		}
	
	public void VerCliente()
	{
		/*frmAgregarCliente agrega = new frmAgregarCliente();
		
		for (int i=0;i<=4;i++) {
			if(Inicio.Cliente[i][0] == agrega.textCedula.getText())
			{
				Inicio.Cliente[i][0] = "";
				Inicio.Cliente[i][1] = "";
				Inicio.Cliente[i][2] = "";
				Inicio.Cliente[i][3] = "";
			}*/
		frmAgregarCliente agrega = new frmAgregarCliente();
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
