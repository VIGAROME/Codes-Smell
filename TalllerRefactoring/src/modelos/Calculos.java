package modelos;

public class Calculos {
    
    public double calcularSueldo(Profesor prof){
        double sueldo=0;
        sueldo= prof.getAniosdeTrabajo()*600 + prof.getBonoFijo();
        return sueldo;
    }
    
    public double calcularNota(double nexamen,double ndeberes, double nlecciones, double ntalleres){
        return calcularNotaTeorico(nexamen, ndeberes, nlecciones) + calcularNotaPractico(ntalleres);
    }

    public double calcularNotaTeorico(double nexamen,double ndeberes, double nlecciones){
        return (nexamen+ndeberes+nlecciones)*0.80;
    }

    public double calcularNotaPractico(double ntalleres){
        return (ntalleres)*0.20;
    }
    
}
