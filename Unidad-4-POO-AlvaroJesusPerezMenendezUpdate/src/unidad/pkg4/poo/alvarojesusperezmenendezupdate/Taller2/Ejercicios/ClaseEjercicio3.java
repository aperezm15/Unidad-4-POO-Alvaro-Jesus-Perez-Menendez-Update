/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller2.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class ClaseEjercicio3 {
    String atributo1;
    static String atributo2;

    public ClaseEjercicio3(String atributo1) {
        this.atributo1 = atributo1;
    }
    //Aqui tenemos un metodo Static en el cual no nos deja utilizar el this,
    //Esto se debe a que this se refiere a una instancia de la clase, y los metodos
    //static no dependen de instancias.
    public static void mostrarInformacion (){
        System.out.println("atributo 1: "+this.atributo1);
    }
    
    //Para corregirlo, yo tendria dos formas
    //La primera es poner el atributo en static y no utilizar el this
    public static void mostrarInformacion2 (){
        System.out.println("atributo 2: "+atributo2);    
    }
    
    //Por otro lado, simplemente no utilizar el static en el metodo para el atributo
    //que no es static
    public void mostrarInfomacion3 () {
        System.out.println("atributo 1:"+this.atributo1);
    }
    
}
