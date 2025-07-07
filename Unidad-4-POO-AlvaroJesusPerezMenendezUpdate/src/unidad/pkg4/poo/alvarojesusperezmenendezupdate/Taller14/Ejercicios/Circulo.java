/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller14.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Circulo extends Figura {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }
    
    
    
    @Override
    public void calcularArea() {
    super.calcularArea();
        System.out.println("el area del circulo es: "+(Math.PI*radio*radio));
    }
    
}
