/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller15.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class GenerarReporteLibro {
        public void generarReportes(Libro libro) {
        System.out.println("Generando reportes de renta...");
        System.out.println("ID: "+libro.getId());
        System.out.println("Edicion: "+libro.getEdicion());
        System.out.println("Sede: "+libro.getSede());
        System.out.println("Disponibilidad: "+libro.getDisponibilidad());
    }
}
