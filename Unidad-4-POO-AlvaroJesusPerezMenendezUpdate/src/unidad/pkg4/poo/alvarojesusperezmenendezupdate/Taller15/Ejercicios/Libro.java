/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller15.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private String edicion;
    private String sede;
    private String disponibilidad;

    public Libro(int id, String titulo, String autor, int numeroPaginas, String edicion, String sede, String disponibilidad) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.edicion = edicion;
        this.sede = sede;
        this.disponibilidad = disponibilidad;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        titulo = "";
        autor = "";
        numeroPaginas = 0;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getEdicion() {
        return edicion;
    }

    public String getSede() {
        return sede;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }
    
    
    
    public void generarInformacion() {
        System.out.println("Informacion del Libro");
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Numero de paginas: "+numeroPaginas);
    }
    
    public void generarReportes() {
        System.out.println("Reportes de renta");
        System.out.println("ID: "+id);
        System.out.println("Edicion: "+edicion);
        System.out.println("Sede: "+sede);
        System.out.println("Disponibilidad: "+disponibilidad);
    }
    
    
    public static Libro crearLibro(int id, String titulo, String autor, int numeroPaginas, String edicion, String sede, String disponibilidad){
        return new Libro(id,titulo,autor,numeroPaginas,edicion,sede,disponibilidad);
        }
    
}
