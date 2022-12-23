package modelos;

import java.util.ArrayList;

public class Estudiante extends Persona{
    //Informacion del estudiante
    public String matricula;
    public String facultad;
    public String telefono;
    public ArrayList<Paralelo> paralelos;

    public Estudiante(String nombre, String apellido, String direccion, int edad) {
        super(nombre, apellido, direccion, edad);
    }
    //Getter y setter de Matricula

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //Getter y setter de la Facultad
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    //Getter y setter de la edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
        //Getter y setter del telefono

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
        
    
    
    
            
        
        
