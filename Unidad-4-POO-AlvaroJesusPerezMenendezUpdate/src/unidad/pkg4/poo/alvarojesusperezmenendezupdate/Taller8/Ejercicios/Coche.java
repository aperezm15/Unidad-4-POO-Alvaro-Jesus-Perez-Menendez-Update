/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller8.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, int velocidadMaxima, int numeroPuertas) {
        super(marca, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public void mostrarInformacion () {
        super.mostrarInformacion();
        System.out.println("Numero de puertas: "+numeroPuertas);
        
    }
    
}
