package modelo;

/**
 *
 * @author Néstor Alvaro Diaz Castro
 * ©2021
 */
public class Requerimiento2vo {
    

    private String fecIni;
    private String nombreCiudad;
    private String constructora;
    private String nombreLider;
    private Integer codigoTipo;
    private Integer estrato;

    public Requerimiento2vo() {
    }

    public Requerimiento2vo(String fecIni, String nombreCiudad, String constructora, String nombreLider, Integer codigoTipo,Integer estrato) {
        this.fecIni = fecIni;
        this.nombreCiudad = nombreCiudad;
        this.constructora = constructora;
        this.nombreLider = nombreLider;
        this.codigoTipo = codigoTipo;
        this.estrato = estrato;
    }

    public String getFecIni() {
        return fecIni;
    }

    public void setFecIni(String fecIni) {
        this.fecIni = fecIni;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getNombreLider() {
        return nombreLider;
    }

    public void setNombreLider(String nombreLider) {
        this.nombreLider = nombreLider;
    }

    public Integer getCodigoTipo() {
        return codigoTipo;
    }

    public void setCodigoTipo(Integer codigoTipo) {
        this.codigoTipo = codigoTipo;
    }

    public Integer getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }

}
