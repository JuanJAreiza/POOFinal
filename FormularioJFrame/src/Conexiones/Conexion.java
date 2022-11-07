package Conexiones;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

Connection ccn = null;
Statement st = null;

    public Conexion(){
        try 
            {
                String rutafile = "\"C:\\Users\\teoar\\OneDrive\\Documents\\SEMESTRE EN PROGRESO\\SEMESTRE 2-2022\\PROGRAMACION ORIENTADA A OBJETOS\\FINAL_POO\\POOFinal\\FormularioJFrame\\BDReservaHotel.accdb\"";
                String Url = "jdbc:ucanaccess://" + rutafile;
                ccn = DriverManager.getConnection(Url);
                st = ccn.createStatement();
            } catch (SQLException e) 
                {
                    JOptionPane.showMessageDialog(null, "CONEXION ERRONEA " + e);  
                }
    }
    
    public Connection getConnection(){
        return ccn;
    }
    
    public void Desconexion(){
        try 
            {
                ccn.close();            
                System.exit(0);
            } catch (SQLException ex) 
                {
                    Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    
}