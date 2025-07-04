/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate;
import unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller7.Ejercicios.CuentaBancaria;

/**
 *
 * @author Mitzuke
 */
public class MainEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(101800048, 500000.0, "Ahorro");
        /*
        No nos dejara entrar al atributo numeroCuenta ya que este es private
        */
        System.out.println(cuenta1.numeroCuenta);
        /*
        Esta seria la forma correcta para poder entrar a ella, por medio de GET
        */
        System.out.println(cuenta1.getNumeroCuenta());
    }
    
}
