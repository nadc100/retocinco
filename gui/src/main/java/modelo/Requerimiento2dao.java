package modelo;

import java.sql.*;
import java.util.ArrayList;
import utilidades.JDBCUtility;

/**
 *
 * @author Néstor Alvaro Diaz Castro
 * ©2021
 */
public class Requerimiento2dao {

    public ArrayList<Requerimiento2vo> requerimiento2() throws SQLException {

        ArrayList<Requerimiento2vo> respuesta2 = new ArrayList<Requerimiento2vo>();
        Connection conn = JDBCUtility.getConnection();

        try {
            String consulta = "SELECT p.Fecha_Inicio, p.Ciudad, p.Constructora, "
                    + "l.Nombre || ' ' || l.Segundo_Apellido as 'Nombre Lider', " + "t.Codigo_Tipo, t.Estrato "
                    + "FROM Proyecto p  INNER JOIN Lider l ON p.ID_Lider = l.ID_Lider "
                    + "INNER JOIN Tipo t ON p.ID_Tipo = t.ID_Tipo "
                    + "WHERE (p.Fecha_Inicio >= '2019-09-01' AND p.Fecha_Inicio <= '2019-09-09' AND p.Ciudad = 'Pereira')";

            PreparedStatement statement = conn.prepareStatement(consulta);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Requerimiento2vo Requerimiento2vo = new Requerimiento2vo(rs.getString("Fecha_Inicio"), rs.getString("Ciudad"),
                        rs.getString("Constructora"), rs.getString("Nombre Lider"), rs.getInt("Codigo_Tipo"),
                        rs.getInt("Estrato"));

                respuesta2.add(Requerimiento2vo);
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

        return respuesta2;
    }



 public ArrayList<Requerimiento2vo> requerimiento2(String fIni, String fFin, String nCiu) throws SQLException {

        ArrayList<Requerimiento2vo> respuesta2 = new ArrayList<Requerimiento2vo>();
        Connection conn = JDBCUtility.getConnection();

        try {
            String consulta = "SELECT p.Fecha_Inicio, p.Ciudad, p.Constructora, "
                    + "l.Nombre || ' ' || l.Segundo_Apellido as 'Nombre Lider', " + "t.Codigo_Tipo, t.Estrato "
                    + "FROM Proyecto p  INNER JOIN Lider l ON p.ID_Lider = l.ID_Lider "
                    + "INNER JOIN Tipo t ON p.ID_Tipo = t.ID_Tipo "
                    + "WHERE (p.Fecha_Inicio >= '" + fIni + "' AND p.Fecha_Inicio <= '" + fFin +"' AND p.Ciudad = '" + nCiu + "')";

            PreparedStatement statement = conn.prepareStatement(consulta);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Requerimiento2vo Requerimiento2vo = new Requerimiento2vo(rs.getString("Fecha_Inicio"), rs.getString("Ciudad"),
                        rs.getString("Constructora"), rs.getString("Nombre Lider"), rs.getInt("Codigo_Tipo"),
                        rs.getInt("Estrato"));

                respuesta2.add(Requerimiento2vo);
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

        return respuesta2;
    }
}
