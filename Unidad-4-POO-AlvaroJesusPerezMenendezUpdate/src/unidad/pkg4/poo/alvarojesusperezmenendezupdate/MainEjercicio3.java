/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate;
import unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller7.Ejercicios.Utilidades;

/**
 *
 * @author Mitzuke
 */
public class MainEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultadoSuma = Utilidades.suma(8, 20);
        int restuladoResta = Utilidades.resta(20, 18);
        int resultadoMultiplicacion =Utilidades.multiplicacion(5, 5);
        int resultadoDivision = Utilidades.division(80, 8);
        
        System.out.println("La suma de 8 + 20 es: "+resultadoSuma);
        System.out.println("La resta de 20 - 18 es: "+restuladoResta);
        System.out.println("La multiplicacion de 5 * 5 es: "+resultadoMultiplicacion);
        System.out.println("La divison de 80 / 8 es: "+resultadoDivision);
        
    }
    
}
