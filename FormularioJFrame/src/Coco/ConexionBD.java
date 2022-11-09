package Coco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexionBD
{
    public static void main( String [] args)
    {
        try
        {
        	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conexion = DriverManager.getConnection("jdbc:odbc:ReservaHotel");
            Statement st = conexion.createStatement();

            ResultSet rs = st.executeQuery("select * from Cliente");
            while ( rs.next() )
            {
                System.out.println(rs.getObject(1));
                System.out.println(rs.getObject(2));
            }
       }
        catch ( Exception e )
        {
            System.out.println("Error de conexion...");
        }
   }
}
