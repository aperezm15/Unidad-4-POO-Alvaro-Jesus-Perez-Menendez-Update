/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller11.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Gerente extends Empleado {
        private double salarioBase;
    
    @Override
    public double calcularSalario(){
    return salarioBase * 0.25;
    }
    
}
