/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller9.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Pez extends Animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }
    
    @Override
    public void mostrarEspecie() {
        System.out.println("Especie: "+super.especie);
        System.out.println("Tipo de agua: "+tipoDeAgua);
    }
    
}
