/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller14.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Rectangulo extends Figura {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public void calcularArea (){
        super.calcularArea();
        System.out.println("El area del rectangulo es: "+(base*altura));
    }
}
