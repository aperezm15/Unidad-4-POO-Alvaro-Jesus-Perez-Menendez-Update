/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate;

import unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller14.Ejercicios.ClaseErrorB;
import unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller14.Ejercicios.ClaseErrorA;

/**
 *
 * @author Mitzuke
 */
public class MainEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseErrorA prueba = new ClaseErrorA();
        prueba.metodoA();
        //nos dice que el objeto instanciado de ClaseErrorA, no puede llamar el 
        //MetodoB porque este esta en la clase derivada ClaseErrorB
        prueba.metodoB();
        
    }
    
}
