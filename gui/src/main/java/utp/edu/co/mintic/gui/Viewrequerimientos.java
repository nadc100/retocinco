package utp.edu.co.mintic.gui;
import java.util.ArrayList;
import controlador.Controlador;
import modelo.Requerimiento1vo;
import modelo.Requerimiento2vo;
import modelo.Requerimiento3vo;
/**
 *
 * @author Néstor Alvaro Diaz Castro
 * ©2021
 */
public class Viewrequerimientos {
   
    public static final Controlador controlador = new Controlador();

    
    public static void requerimiento1() {
        try {
           
            ArrayList<Requerimiento1vo> listaRequerimiento1vo;
            listaRequerimiento1vo = controlador.consulta1();

            for(Requerimiento1vo Requerimiento1vo: listaRequerimiento1vo){
                System.out.println(
                    Requerimiento1vo.getFechaComprado() + " " +
                    Requerimiento1vo.getCodCompra() + " " +
                    Requerimiento1vo.getNombreProveedor() + " " +
                    Requerimiento1vo.getPagado()
                );
            }
        } catch (Exception es){
            System.err.println(es);
        }
    }

    public static void requerimiento2() {
        try {
            ArrayList<Requerimiento2vo> listaRequerimiento1vo2;
            listaRequerimiento1vo2 = controlador.consulta2();

            for(Requerimiento2vo Requerimiento1vo2: listaRequerimiento1vo2){
                System.out.println(
                    Requerimiento1vo2.getFecIni() + " " +
                    Requerimiento1vo2.getNombreCiudad() + " " +
                    Requerimiento1vo2.getConstructora() + " " +
                    Requerimiento1vo2.getNombreLider() + " " +
                    Requerimiento1vo2.getCodigoTipo() + " " +
                    Requerimiento1vo2.getEstrato()
                );
            }
        } catch (Exception e){
            System.err.println(e);
        }
    } 
    
    public static void requerimiento3() {
        try {
            ArrayList<Requerimiento3vo> listaRequerimiento3;
            listaRequerimiento3 = controlador.consulta3();

            for(Requerimiento3vo req3: listaRequerimiento3){
                System.out.println(
                    req3.getAbrev()
                );
            }
        } catch (Exception es){
            System.err.println(es);
        }
    } 
}