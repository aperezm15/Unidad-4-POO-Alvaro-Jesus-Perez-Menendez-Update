/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller12.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Persona implements Hablador,Trabajador {

    @Override
    public void hablar() {
        System.out.println("La persona esta hablando");
    }

    @Override
    public void trabajar() {
        System.out.println("La Persona esta trabajando");
    }
    
}
