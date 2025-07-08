/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller15.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Producto {
    private String atributo;
    
    

    //Ponemos el constructor private, para poder crear un producto solamente
    //con un metodo
    public String getAtributo() {
        return atributo;
    }

    Producto(String atributo) {
        this.atributo = atributo;
    }
    
    //Hacemos el metodo aqui, mostrando como seria implementarlo en la misma clase
    //pero para hacer la utlizacion SRP, se crearan las clases a parte con sus metodos.
//    public static Producto crearProducto(String atributo){       
//        return new Producto(atributo);
//    }
//    
//    public void generarDatos(){
//        System.out.println("Los datos son: "+atributo);
//    }
//    
//    public void generarEtiqueta(){
//        System.out.println("Se ha generado la etiqueta: "+atributo);
//    }
    
//    public void generarCalculoPrecio(){
//        System.out.println("Se generado el calculo de Precio: "+atributo);
//    }
    
    //Ya teniendo los metodos identificados, ahora implementaremos el SRP
}
