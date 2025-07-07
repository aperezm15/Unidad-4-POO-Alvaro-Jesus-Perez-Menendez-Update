/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate;

import unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller14.Ejercicios.Bicicleta;
import unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller14.Ejercicios.Coche;
import unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller14.Ejercicios.Vehiculo;

/**
 *
 * @author Mitzuke
 */
public class MainEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Coche coche = new Coche();
        Bicicleta bicicleta = new Bicicleta();
         
         vehiculo.mover();
         coche.mover();
         bicicleta.mover();
    }
    
}
