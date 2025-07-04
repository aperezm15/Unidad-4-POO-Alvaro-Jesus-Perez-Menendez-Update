/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate;
import unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller4.Ejercicios.Estudiante;

/**
 *
 * @author Mitzuke
 */
public class MainEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Bella Botello", 18, 4.5);
        System.out.println("Nombre de la estudiante: ");
        System.out.println(estudiante1.getNombre());
        System.out.println("Edad de la estudiante: ");
        System.out.println(estudiante1.getEdad());
        System.out.println("Nota promedio de la estudiante: ");
        System.out.println(estudiante1.getNotaPromedio());
        
    }
    
}
