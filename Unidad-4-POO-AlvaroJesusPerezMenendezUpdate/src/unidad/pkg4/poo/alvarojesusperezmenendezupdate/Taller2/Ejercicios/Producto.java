/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller2.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void mostrarProducto(){
        System.out.println("El nombre del producto es: "+nombre);
        System.out.println("El precio del producto es: "+precio);
    }
    
}
