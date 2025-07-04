/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate;
import java.util.Scanner;
import unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller1.Ejercicios.*;

/**
 *
 * @author Mitzuke
 */
public class MainEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libro libro1 = new Libro ("El principito", "Antoine de Saint-Exupéry", 94);
        Libro libro2 = new Libro ();
        
        CuentaBancaria cuenta1 = new CuentaBancaria(99019874, "Ahorro");
        
        Estudiante estudiante1 = new Estudiante("Bella Botello", 18, "Segundo Semestre");
        
        System.out.println("Introduce el titulo para libro2: ");
        libro2.setTitulo(scanner.nextLine());
        System.out.println("Introduce el autor para el libro2: ");
        libro2.setAutor(scanner.nextLine());
        System.out.println("Introduce el # paginas para el libro2: ");
        libro2.setNumeroPaginas(Integer.parseInt(scanner.nextLine()));
        System.out.println("___________________________________________________");
        System.out.println("Libros creados.");
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println("Cuentas creadas.");
        System.out.println(cuenta1.toString());
        System.out.println("Estudiantes creados.");
        System.out.println(estudiante1.toString());
    }
    
}
