package modelos;

import java.util.ArrayList;

public class Profesor {
    public String codigo;
    public String nombre;
    public String apellido;
    public int edad;
    public String direccion;
    public String telefono;
    public int aniosdeTrabajo;
    public String facultad;
    public double BonoFijo;
    public ArrayList<Paralelo> paralelos;

    public Profesor(String codigo, String nombre, String apellido, String facultad, int edad, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        paralelos= new ArrayList<>();
    }
    public void getInformacionAdicionalProfesor(int aniosdeTrabajo,String facultad, double BonoFijo){
        this.aniosdeTrabajo=aniosdeTrabajo;
        this.facultad=facultad;
        this.BonoFijo=BonoFijo;
    }
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }

    public int getAniosdeTrabajo() {
        return aniosdeTrabajo;
    }

    public void setAniosdeTrabajo(int aniosdeTrabajo) {
        this.aniosdeTrabajo = aniosdeTrabajo;
    }

    public double getBonoFijo() {
        return BonoFijo;
    }

    public void setBonoFijo(double BonoFijo) {
        this.BonoFijo = BonoFijo;
    }
    
    
}
