/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller5.Ejercicios;


/**
 *
 * @author Mitzuke
 */
public class MainEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto1 = new Producto("Maracuya", 3200, 14);
        System.out.println("Nombre del Producto");
        System.out.println(producto1.nombre);
        System.out.println("Precio del producto");
        System.out.println(producto1.precio);
        System.out.println("Stocks Disponibles");
        System.out.println(producto1.stock);
        System.out.println("________________________________________________");
        System.out.println("Ha subido el precio del producto");
        producto1.precio = 4800;
        System.out.println("________________________________________________");
        System.out.println("Producto Actualizado");
        System.out.println("Nombre del Producto");
        System.out.println(producto1.nombre);
        System.out.println("Precio del producto");
        System.out.println(producto1.precio);
        System.out.println("Stocks Disponibles");
        System.out.println(producto1.stock);
        
    }
    
}
