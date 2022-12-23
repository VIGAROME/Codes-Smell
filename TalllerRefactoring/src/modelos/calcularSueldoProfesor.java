package modelos;

public class calcularSueldoProfesor {
    
    public double calcularSueldo(Profesor prof){
        double sueldo=0;
        sueldo= prof.getAniosdeTrabajo()*600 + prof.getBonoFijo();
        return sueldo;
    }  
}
