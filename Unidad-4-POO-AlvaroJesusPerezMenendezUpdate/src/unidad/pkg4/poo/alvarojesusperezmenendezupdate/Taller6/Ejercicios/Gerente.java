/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller6.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Gerente extends Empleado {
    private String departamento;
    
    @Override
    public void mostrarInformacion (){
        super.mostrarInformacion();
        System.out.println("El departamento es: "+departamento);
    
    }
}
