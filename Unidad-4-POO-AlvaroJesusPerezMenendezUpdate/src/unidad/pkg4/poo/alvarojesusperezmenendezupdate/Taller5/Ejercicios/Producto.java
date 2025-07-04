/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller5.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    public void mostrarInfo () {
        System.out.println("El nombre del producto es: "+nombre);
        System.out.println("El precio del producto es: "+precio);
        System.out.println("Stock Disponibles del producto: "+stock);
        
    }
    
}
