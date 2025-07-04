/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller8.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class ClaseC extends ClaseB {
    
    public ClaseC(String atributoA) {
        super(atributoA);
    }
    
    public void mostrarDetalles (){
        System.out.println("Mostrar atributo A"+atributoA);
    }
    /*
    Esto no se podra, dado que el atributo A que viene de la clase base
    es privado, y para acceder a ella se necesita un GET
    */
}
