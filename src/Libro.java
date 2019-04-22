/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Libro {
    private String titulo;
    private Autor autor;
    private int numPag;
    private int calificacion;

    public Libro(String titulo, Autor autor, int numPag, int calificacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    
    
    
    
}
