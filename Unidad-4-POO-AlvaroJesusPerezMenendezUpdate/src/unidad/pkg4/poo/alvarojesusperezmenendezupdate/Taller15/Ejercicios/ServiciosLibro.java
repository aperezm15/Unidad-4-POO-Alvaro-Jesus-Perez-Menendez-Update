/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller15.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class ServiciosLibro {
        public static Libro crearLibro(int id, String titulo, String autor, int numeroPaginas, String edicion, String sede, String disponibilidad){

        return new Libro(id,titulo,autor,numeroPaginas,edicion,sede,disponibilidad);
        }
        //esto es en caso tal de tener base datos, este metodo se ajustara para crear el libro y se adicione
        //a la base de datos
}
