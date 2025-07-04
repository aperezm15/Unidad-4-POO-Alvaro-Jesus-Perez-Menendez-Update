/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller5.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class MainEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nombre de la persona: ");
        Persona persona1 = new Persona("Bella", 18);
        //El nombre es accesible dado que tiene un metodo get
        //Recordemos que los atributos privados, solo pueden ser accedidos o
        //modificados con metodos GET y SET
        System.out.println(persona1.getNombre());
        
        System.out.println("Edad de la persona: ");
        System.out.println(persona1.edad);
        //Aqui podemos ver que ingresamos directamente al atributo edad
        //dado que como esta en default, nos da acceso si estamos en el mismo 
        //paquete.
        
        /*
        Para datos mas privados el cual sean sensibles, se necesita usar
        private, dado que este solo le podemos dar acceso desde otras clases por
        metidio de GETTERS y SETTERS, a diferencia de tener por default un
        atributo el cual podemos acceder desde el mismo paquete.
        */
    }
    
}
