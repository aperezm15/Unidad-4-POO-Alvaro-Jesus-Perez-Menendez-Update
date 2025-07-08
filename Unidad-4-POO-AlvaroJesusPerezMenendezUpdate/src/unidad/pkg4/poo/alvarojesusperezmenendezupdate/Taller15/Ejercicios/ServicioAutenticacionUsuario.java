/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller15.Ejercicios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mitzuke
 */
public class ServicioAutenticacionUsuario {
    private List<Usuario> usuariosAlmacenados;
    
    public ServicioAutenticacionUsuario() {
        this.usuariosAlmacenados = new ArrayList<>();
        usuariosAlmacenados.add(new Usuario("admin", "123456"));
    }
    
    public boolean registrarUsuario (String user, String password){
        for(Usuario u : usuariosAlmacenados){
            if (u.getUser().equalsIgnoreCase(user)){
                System.out.println("El binbre de usuarui '"+user+"' ya esta registrado.");
                return false;
            }
        }
        Usuario usuario1 = new Usuario(user, password);
        usuariosAlmacenados.add(usuario1);
        return true;
    }  
    
        public Usuario iniciarSesion(String user, String password) {
        for (Usuario usuario : usuariosAlmacenados) {
            if (usuario.getUser().equals(user)) {
                
                if (verificarPassword(password, usuario.getPassword())) {
                    return usuario;
                } else {
                    return null; 
                }
            }
        }
        return null;
    }
     
        public String hashPassword(String password){
            return "hashed_" + password;
        }
        public boolean verificarPassword(String PasswordIngresada, String PasswordAlmacenada) {
            return hashPassword(PasswordIngresada).equals(PasswordAlmacenada);
        }
}

