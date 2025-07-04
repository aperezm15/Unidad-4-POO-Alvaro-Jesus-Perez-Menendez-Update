/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate;
import unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller4.Ejercicios.Coche;

/**
 *
 * @author Mitzuke
 */
public class MainEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche coche1 = new Coche("Suzuki", "Gixxer", 127);
        
        /*
        Aqui nos damos cuenta que si intentamos acceder directamente a las propiedades
        no nos dejara, porque estas estan en private, la unica forma de poder acceder
        a ellas, es tenienendo GET
        */
        System.out.println(coche1.marca);
        System.out.println(coche1.modelo);
        System.out.println(coche1.velocidadMaxima);
    }
    
}
