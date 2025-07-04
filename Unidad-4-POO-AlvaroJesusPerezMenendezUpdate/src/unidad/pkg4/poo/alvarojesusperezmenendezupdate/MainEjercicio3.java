/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate;
import unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller8.Ejercicios.*;

/**
 *
 * @author Mitzuke
 */
public class MainEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Bella", 2400000);
        Gerente gerente1 = new Gerente("Bella Botello", 3200000, "ingenieria");
        System.out.println("Datos de empleado");
        empleado1.mostrarDetalles();
        System.out.println("\n");
        System.out.println("Datos de gerente");
        gerente1.mostrarDetalles();
    }
    
}
