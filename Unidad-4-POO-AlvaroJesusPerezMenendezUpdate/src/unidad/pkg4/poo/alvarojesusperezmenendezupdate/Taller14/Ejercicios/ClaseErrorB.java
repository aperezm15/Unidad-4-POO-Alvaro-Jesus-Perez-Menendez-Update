/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller14.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class ClaseErrorB extends ClaseErrorA {
    
    //Se esta viendo sobreescritura, pero realmente no modifica nada, del metodo 
    //de la clase madre, por lo cual no es necesario el implementar el metodo
    //ya que existe en el metodo padre.
    @Override
    public void metodoA (){
        super.metodoA();
        
    }
    public void metodoB(){
        System.out.println("Metodo independiente de la ClaseErrorB");
    }

}
