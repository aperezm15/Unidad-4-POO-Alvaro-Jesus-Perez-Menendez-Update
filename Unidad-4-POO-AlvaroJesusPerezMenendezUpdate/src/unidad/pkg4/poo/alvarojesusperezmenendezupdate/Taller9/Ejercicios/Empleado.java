/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller9.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Empleado extends Persona {
    private String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }
    
    @Override
    public void mostrarDetalles () {
        super.mostrarDetalles();
        System.out.println("Departamento: "+departamento);
    }
    
}
