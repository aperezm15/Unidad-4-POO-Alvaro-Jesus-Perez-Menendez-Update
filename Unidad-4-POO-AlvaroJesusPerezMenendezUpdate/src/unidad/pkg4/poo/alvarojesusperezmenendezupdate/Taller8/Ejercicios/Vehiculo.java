/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller8.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Vehiculo {
    protected String marca;
    protected int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public void mostrarInformacion () {
        System.out.println("La marca es: "+marca);
        System.out.println("La velocidad maxima es: "+velocidadMaxima);
    }
    
}
