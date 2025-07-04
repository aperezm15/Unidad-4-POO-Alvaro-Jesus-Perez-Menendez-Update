/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller2.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Estudiante {
    String nombre;
    int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDetalle (){
        System.out.println("El nombre es "+nombre);
        System.out.println("La edad es "+edad);
    }
    
}
