package ejerciciosfinales11;

public class EstudianteInt extends Estudiante {

    private boolean esErasmus;
    
    //Nacionalidad es un tipo enum para enumerar las nacionalidades disponibles.
    private Nacionalidad nacionalidad;

    public enum Nacionalidad {
        INGLES, FRANCES, PORTUGUES, AMERICANO
    }

    public EstudianteInt() {

    }

    public EstudianteInt(boolean esErasmus, Nacionalidad nacionalidad, String codigo, String nombre, String direccion, int edad) {
        super(codigo, nombre, edad, direccion);
        this.nacionalidad = nacionalidad;
        this.esErasmus = this.erasmus();
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

    private boolean erasmus() {
        return this.nacionalidad == Nacionalidad.INGLES || this.nacionalidad == Nacionalidad.FRANCES || this.nacionalidad == Nacionalidad.PORTUGUES;

    }

    public boolean europeo(Nacionalidad nacionalidad) {
        return nacionalidad == Nacionalidad.FRANCES || nacionalidad == Nacionalidad.INGLES || nacionalidad == Nacionalidad.PORTUGUES;
    }

    public boolean descuentoJovenes() {
        return erasmus() && getEdad() < 25;
    }

    @Override
    public String toString() {

        return "La Persona:\n"
                + "\nNombre: " + nombre
                + "\nDirecciòn: " + direccion
                + "\nEdad: " + edad
                + "\nCodigo: " + getCodigo()
                + "\nNacionalidad Europea: " + erasmus()
                + "\nDescuento: " + descuentoJovenes()
                + '.';
    }
}
