package ejerciciosfinales11;

public class EstudianteInt extends Estudiante {

    
   
    private boolean esErasmus;
    //Nacionalidad es un tipo enum para enumerar las nacionalidades disponibles.
    private Nacionalidad nacionalidad;
    
    public enum Nacionalidad {
        INGLES, FRANCES, PORTUGUES, AMERICANO
    }
    
    public EstudianteInt () {
        
    }
    
    

    public EstudianteInt(boolean esErasmus, Nacionalidad nacionalidad, String codigo, String nombre, String direccion, int edad) {
        super(codigo, nombre, edad, direccion);
        this.esErasmus = esErasmus;
        this.nacionalidad = nacionalidad;
    }
    
    
    public boolean getEsErasmus() {
        return esErasmus;
    }

    public void setEsErasmus(boolean esErasmus) {
        this.esErasmus = esErasmus;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

 
    private boolean erasmus(Nacionalidad nacionalidad) {
        return nacionalidad == Nacionalidad.INGLES || nacionalidad == Nacionalidad.FRANCES || nacionalidad == Nacionalidad.PORTUGUES;
    
    }
    
    public boolean europeo (Nacionalidad nacionalidad) {
        return nacionalidad == Nacionalidad.FRANCES || nacionalidad == Nacionalidad.INGLES || nacionalidad == Nacionalidad.PORTUGUES;
    }
    
    public boolean descuentoJovenes () {
        return erasmus(nacionalidad) && getEdad() > 25;
    }
}
