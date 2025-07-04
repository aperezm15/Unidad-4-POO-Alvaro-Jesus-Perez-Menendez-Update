/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller8.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarInformacion (){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
        
    }
    
}
