/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate;
import unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller15.Ejercicios.*;

/**
 *
 * @author Mitzuke
 */
public class MainEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = ServiciosLibro.crearLibro(001, "Bella Botello", "Diosito", 999, "La mejor", "Pais de las maravillas", "No me quiere llevar a farmear");
        GenerarInformacionLibro generarInfo = new GenerarInformacionLibro();
        GenerarReporteLibro generarReporte = new GenerarReporteLibro();
        System.out.println("\n");
        generarInfo.generarInformacion(libro1);
        System.out.println("\n");
        generarReporte.generarReportes(libro1);
        
    }
    
}
