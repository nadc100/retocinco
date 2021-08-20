package modelo;
import java.sql.*;
import java.util.ArrayList;
import utilidades.JDBCUtility;
import modelo.Requerimiento1vo;
/**
 *
 * @author Néstor Alvaro Diaz Castro
 * ©2021
 */
public class Requerimiento1dao {

    public ArrayList<Requerimiento1vo> requerimiento() throws SQLException {

        ArrayList<Requerimiento1vo> respuesta = new ArrayList<Requerimiento1vo>();
        Connection conn = JDBCUtility.getConnection();

        try {
            String consulta = "SELECT c.Fecha, c.ID_Compra, c.Proveedor, c.Pagado "
                    + "FROM Compra c ORDER BY c.ID_Compra DESC LIMIT 10";

            PreparedStatement statement = conn.prepareStatement(consulta);
            ResultSet rs = statement.executeQuery();

            // Recorrer los registros en los VO especificos
            while (rs.next()) {
                Requerimiento1vo Requi = new Requerimiento1vo();
                Requi.setFechaComprado(rs.getString("Fecha"));
                Requi.setCodCompra(rs.getInt("ID_Compra"));
                Requi.setNombreProveedor(rs.getString("Proveedor"));
                Requi.setPagado(rs.getString("Pagado"));
                respuesta.add(Requi);
            }
            rs.close();
            statement.close();

        } catch (SQLException se) {
            System.out.println("error en la consulta" + se);
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return respuesta;
    }
}
