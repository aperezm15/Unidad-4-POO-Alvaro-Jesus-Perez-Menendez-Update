/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller6.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Banco {
    /*
    Aunque el código compila, es una mala práctica permitir que subclases o clases del mismo paquete 
    accedan directamente a datos sensibles como la contraseña.
    */
    protected double saldo;
    
    /*
    Para este tipo de datos, mejor utilizamos private.
    */
    
    private double saldo2;
}
