/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller11.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public abstract class Empleado {
    
    public abstract double calcularSalario();
    
    public void mostrarDetalles(){
        System.out.println("El salario es: "+calcularSalario());
    }
    
}
