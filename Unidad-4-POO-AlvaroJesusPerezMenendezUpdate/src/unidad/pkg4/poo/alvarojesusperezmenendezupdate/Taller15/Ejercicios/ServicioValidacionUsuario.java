/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller15.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class ServicioValidacionUsuario {
    
    public boolean validarPassword(String password) {
            if(password == null || password.trim().isEmpty()){
                System.out.println("Error, La contraseña no puede estar vacia");
                return false;
            }
            if(password.length() < 6){
                System.out.println("Error, La contraseña debe tener almenos 6 digitos");
                return false;
            }
            return true;
    }
    
    public boolean validarUser(String user){
        if(user == null || user.trim().isEmpty()){
            System.out.println("Error, El usuario no puede estar vacio");
            return false;
        }
        return true;
    }
    
    
    
}
