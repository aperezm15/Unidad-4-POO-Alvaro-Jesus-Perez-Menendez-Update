/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller8.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }
    
    @Override
    public void mostrarInformacion (){
        super.mostrarInformacion();
        System.out.println("Estado de matricula: "+matricula);
    }
    
}
