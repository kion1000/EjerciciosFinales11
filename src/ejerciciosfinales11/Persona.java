package ejerciciosfinales11;

public class Persona {

    protected String nombre;
    protected String direccion;
    protected int edad;

    public Persona() {

    }

    public Persona(String nombre, String direccion, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean mayorEdad(int edad) {
        if (this.edad >= 18) {
            return true;
        } else {
            return false;

        }
    }
    @Override
    public String toString() {
        
        return "La Persona:\n" 
                + "\nNombre: " + nombre
                + "\nDirecciòn: " + direccion 
                + "\nEdad: " + edad
                + '.';
        
    }
}