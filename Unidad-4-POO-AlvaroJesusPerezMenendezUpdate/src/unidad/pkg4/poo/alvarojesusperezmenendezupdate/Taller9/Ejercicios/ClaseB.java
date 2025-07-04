/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller9.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class ClaseB extends ClaseA {
    private String atributoB;

    public ClaseB(String atributoA, String atributoB) {
        super(atributoA);
        this.atributoB = atributoB;
    }
    
    public void MostrarDetalles (){
        /*
        Aca podemos ver que el atributo A que es de la clase base no deja
        acceder a ella, debido a que su acceso es Private, y para esto
        se necesita implementacion de GET
        */
        System.out.println("Atributo A: "+super.atributoA);
        
        /*
        En el atributo B intentamos acceder con super, siendo no este un
        atributo de una clase base heredada, por lo que tendremos un error, porque
        en la clase base no tenemos ningun atributo llamado asi.
        */
        System.out.println("Atributo B: "+super.atributoB);
    }
    
}
