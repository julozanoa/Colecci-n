/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class ConjuntoLibro {
    
    private Libro[] libros;

    public ConjuntoLibro() {
        this.libros = new Libro[10];
    }
    
    public boolean añadirlibro(Libro libro){
        for (int i = 0; i < libros.length; i++) {
            if(this.libros[i] == null){
            this.libros[i] = libro;
            return true;
        }else if(this.libros[i] == libro){
            return false;
        }
        }
        return false;
    }
    
    public boolean eliminarXautor(String autorNombre, String autorApellido){
        for (int i = 0; i < 10; i++) {
            if(libros[i].getAutor().getNombre() .equals(autorNombre) && libros[i].getAutor().getApellido() .equals(autorApellido)){
                this.libros[i] = null;
                return true;
            }
        }
        return false;
    }
    
    
    
}
