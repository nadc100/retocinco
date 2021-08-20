/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.Requerimiento1vo;
import modelo.Requerimiento2vo;
import modelo.Requerimiento3vo;
import modelo.Requerimiento1dao;
import modelo.Requerimiento2dao;
import modelo.Requerimiento3dao;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author lilop
 */
public class Controlador {
    
    private final Requerimiento1dao midao1 = new Requerimiento1dao();
    private final Requerimiento2dao midao2 = new Requerimiento2dao();
    private final Requerimiento3dao midao3 = new Requerimiento3dao();
    
    public ArrayList<Requerimiento1vo> consulta1() throws SQLException {
        return this.midao1.requerimiento();
    }  

    public ArrayList<Requerimiento2vo> consulta2() throws SQLException {
        return this.midao2.requerimiento2();
    }    
    
    public ArrayList<Requerimiento2vo> consulta2(String fIni, String fFin, String nCiu) throws SQLException {
        return this.midao2.requerimiento2(fIni,fFin,nCiu);
    }   

    public ArrayList<Requerimiento3vo> consulta3() throws SQLException {
        return this.midao3.requerimiento3();
    }      

} 