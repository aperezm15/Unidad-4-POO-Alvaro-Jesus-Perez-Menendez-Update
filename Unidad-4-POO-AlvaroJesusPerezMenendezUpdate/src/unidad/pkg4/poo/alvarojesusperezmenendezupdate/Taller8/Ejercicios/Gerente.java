/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller8.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }
    
    @Override
    public void mostrarDetalles (){
        super.mostrarDetalles();
        System.out.println("Departamento: "+departamento);
    }
    
    
}
