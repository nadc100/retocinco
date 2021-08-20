package modelo;

/**
 *
 * @author Néstor Alvaro Diaz Castro
 * ©2021
 */
public class Requerimiento1vo {

    private String fechaComprado;
    private Integer codCompra;
    private String nombreProveedor;
    private String pagado;

    public Requerimiento1vo() {
    }

    public Requerimiento1vo(Integer codCompra, String nombreProveedor, String pagado, String fechaComprado) {
        this.fechaComprado = fechaComprado;
        this.codCompra = codCompra;
        this.nombreProveedor = nombreProveedor;
        this.pagado = pagado;
    }

    public String getFechaComprado() {
        return fechaComprado;
    }

    public void setFechaComprado(String fechaComprado) {
        this.fechaComprado = fechaComprado;
    }

    public Integer getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(Integer codCompra) {
        this.codCompra = codCompra;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getPagado() {
        return pagado;
    }

    public void setPagado(String pagado) {
        this.pagado = pagado;
    }

}
