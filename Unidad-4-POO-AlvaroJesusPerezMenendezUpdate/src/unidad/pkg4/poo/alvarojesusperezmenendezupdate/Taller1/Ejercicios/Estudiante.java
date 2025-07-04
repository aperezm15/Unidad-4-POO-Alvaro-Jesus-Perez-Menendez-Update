/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller1.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Estudiante {
    String nombre;
    int edad;
    String curso;

    public Estudiante() {
        nombre = "Desconocido";
        edad = 0;
        curso = "Desconocido";
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
    
    

    public Estudiante(String nombre, int edad, String curso) {
        this(nombre);
        this.edad = edad;
        this.curso = curso;
        
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", curso=" + curso + '}';
    }
    
    
    
    
}
    
    
    
    
    
   