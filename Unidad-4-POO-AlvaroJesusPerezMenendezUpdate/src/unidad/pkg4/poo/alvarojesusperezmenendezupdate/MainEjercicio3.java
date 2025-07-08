/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate;

import java.util.Scanner;
import unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller15.Ejercicios.ServicioAutenticacionUsuario;
import unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller15.Ejercicios.ServicioValidacionUsuario;
import unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller15.Ejercicios.Usuario;

/**
 *
 * @author Mitzuke
 */
public class MainEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Prueba ejercicio 3");
        
        ServicioValidacionUsuario validador = new ServicioValidacionUsuario();
        ServicioAutenticacionUsuario autenticador = new ServicioAutenticacionUsuario();
        
        System.out.println("\n Intentando Registar usuario");
        String nuevoUser = "bella";
        String nuevaPassword = "123456";
        
        
        boolean userValido = validador.validarUser(nuevoUser);
        boolean PasswordValida = validador.validarPassword(nuevaPassword);
        
        if (userValido && PasswordValida){
            if(autenticador.registrarUsuario(nuevoUser, nuevaPassword)) {
                System.out.println("Usuario "+nuevoUser+" Registrado con exito");
            }else {
                System.out.println("Error, el usuario ya existe");
            }
        }
        
         System.out.println("\n--- Intentando Iniciar Sesión ---");
        String usuarioIntento1 = "alice";
        String contrasenaIntento1 = "mipassword";

        // La validación de credenciales para iniciar sesión es implícita en la autenticación.
        // Aquí no validamos la 'forma' de la contraseña, sino si es la 'correcta'.
        Usuario usuarioLogeado = autenticador.iniciarSesion(usuarioIntento1, contrasenaIntento1);

        if (usuarioLogeado != null) {
            System.out.println("¡Inicio de sesión exitoso para " + usuarioLogeado.getUser()+ "!");
        } else {
            System.out.println("Fallo en el inicio de sesión para " + usuarioIntento1 + ". Credenciales incorrectas.");
        }

        System.out.println("\n--- Intentando Iniciar Sesión con Credenciales Incorrectas ---");
        Usuario usuarioLogeadoFallido = autenticador.iniciarSesion("alice", "contrasenaErronea");
        if (usuarioLogeadoFallido != null) {
            System.out.println("¡Inicio de sesión exitoso para " + usuarioLogeadoFallido.getUser() + "!");
        } else {
            System.out.println("Fallo en el inicio de sesión para 'alice'. Credenciales incorrectas.");
        }

        System.out.println("\n--- Intentando Iniciar Sesión con Usuario Inexistente ---");
        Usuario usuarioNoExiste = autenticador.iniciarSesion("charlie", "cualquierpass");
        if (usuarioNoExiste != null) {
            System.out.println("¡Inicio de sesión exitoso para " + usuarioNoExiste.getUser() + "!");
        } else {
            System.out.println("Fallo en el inicio de sesión para 'charlie'. Usuario no encontrado.");
        }

        
    }
}
        
    
    

