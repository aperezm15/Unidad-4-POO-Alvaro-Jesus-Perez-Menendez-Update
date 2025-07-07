/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate;

import unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller14.Ejercicios.Circulo;
import unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller14.Ejercicios.Figura;
import unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller14.Ejercicios.Rectangulo;

/**
 *
 * @author Mitzuke
 */
public class MainEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura figura = new Figura();
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(2, 4);
        
        figura.calcularArea();
        circulo.calcularArea();
        rectangulo.calcularArea();
    }
    
}
