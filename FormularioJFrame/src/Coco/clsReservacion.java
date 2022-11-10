package Coco;
import java.util.Scanner;

import Clases.Inicio;
import Formularios.frmAgregarCliente;
import Formularios.frmEliminarReserva;
import Formularios.frmImprimirReserva;
import Formularios.frmReservar;
import Formularios.frmVerCliente;

public class clsReservacion 
{
	static Scanner Tc=new Scanner(System.in);
	public String FechaInicio;
	public int CantidadDias, NumeroHabitacion, cedula;
	
	
	public void Reservar()
	{
		frmReservar reservar = new frmReservar();
		
		for (int i=0;i<=4;i++) {
			if(Inicio.Cliente[i][0] == reservar.textCedula.getText()) {
				for (int r=0;r<=4;r++) {
					if(Inicio.Reserva[i][0] == null)
					{
						Inicio.Reserva[i][0] = reservar.textCedula.getText();
						Inicio.Reserva[i][1] = reservar.textFechaInicio.getText();
						Inicio.Reserva[i][2] = reservar.textCantidadDias.getText();
						Inicio.Reserva[i][3] = reservar.textNumHabitacion.getText();
					}
				}
			}
		}
	}
	
	public void EliminarReserva()
	{
		frmEliminarReserva eliminar = new frmEliminarReserva();
		
		for (int i=0;i<=4;i++) {
			if(Inicio.Reserva[i][0] == eliminar.textBuscarCedula.getText())
			{
				Inicio.Reserva[i][0] = "";
				Inicio.Reserva[i][1] = "";
				Inicio.Reserva[i][2] = "";
				Inicio.Reserva[i][3] = "";
			}}
	}
	
	public void ImprimirReserva()
	{
		frmImprimirReserva imprimir = new frmImprimirReserva();
		
		for (int i=0;i<=4;i++) {
			if(Inicio.Reserva[i][0] == imprimir.textBuscarCedula.getText())
			{
				imprimir.textCedula.setText(Inicio.Reserva[i][0]);
				imprimir.textFechaInicio.setText(Inicio.Reserva[i][1]);
				imprimir.textCantidadDias.setText(Inicio.Reserva[i][2]);
				imprimir.textNumHabitacion.setText(Inicio.Reserva[i][3]);
			}
		}	
	}
	
}
