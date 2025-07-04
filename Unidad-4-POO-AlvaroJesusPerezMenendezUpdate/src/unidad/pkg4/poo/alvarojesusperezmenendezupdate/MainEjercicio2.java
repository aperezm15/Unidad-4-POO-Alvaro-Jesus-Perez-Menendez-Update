/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate;
import unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller5.Ejercicios.Vehiculos.*;
/**
 *
 * @author Mitzuke
 */
public class MainEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        En este caso, nos deja crear un objeto de vehiculo, porque la clase
        como tal es public
        */
        Vehiculo vehiculo1 = new Vehiculo("Todo Terreno");
        /*
        En cambio la clase Moto no lo es, esta por default, como no estan en el
        mismo paquete, no puede acceder a ella
        */
        Moto moto1 = new Moto();
        
        /*Aca a pesar de que la clase sea public, si el atributo
        esta por default, no podra acceder a el tampoco si no esta dentro
        del mismo paquete.
        */
        System.out.println(vehiculo1.tipo);
    }
    
}
