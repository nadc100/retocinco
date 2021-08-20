package modelo;
import java.sql.*;
import java.util.ArrayList;
import modelo.Requerimiento3vo;
import utilidades.JDBCUtility;
/**
 *
 * @author Néstor Alvaro Diaz Castro
 * ©2021
 */
public class Requerimiento3dao {
    
 public ArrayList<Requerimiento3vo> requerimiento3() throws SQLException {

        ArrayList<Requerimiento3vo> respuesta3 = new ArrayList<Requerimiento3vo>();
        Connection conn = JDBCUtility.getConnection();
        
        try {
            String consulta = "SELECT SUBSTR(l.Nombre,1,3) || SUBSTR(l.Primer_Apellido,1,3) "
                    + "|| SUBSTR(l.Segundo_Apellido,1,3) AS 'Abrev.' " + "FROM Lider l";

            PreparedStatement statement = conn.prepareStatement(consulta);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Requerimiento3vo Requerimiento3vo = new Requerimiento3vo(rs.getString("Abrev."));
                respuesta3.add(Requerimiento3vo);
            }

            rs.close();
            statement.close();

        } catch (SQLException es) {
            System.err.println("Error en la consulta SQL Requerimiento 2 -> " + es);
        } finally {
            if (conn != null) {
                conn.close();
            }
        }

        return respuesta3;
    }
}