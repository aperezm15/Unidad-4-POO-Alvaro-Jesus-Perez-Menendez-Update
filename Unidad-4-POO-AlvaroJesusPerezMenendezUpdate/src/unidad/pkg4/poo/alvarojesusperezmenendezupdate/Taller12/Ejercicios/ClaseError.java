/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller12.Ejercicios;

/**
 *
 * @author Mitzuke
 */
//Error al no implementar el metodo de una interface
public class ClaseError implements InterfaceError,InterfaceError2 {

    @Override
    public void correr() {
        //La idea es poner metodos logicos a las clases, en este caso
        //no es un error, pero es una mala practicar el poner algo ilogico
        //como esto
        System.out.println("La roca esta corriendo");
    }

    
    
}
