package ejerciciosfinales11;

public class Estudiante extends Persona{

  
    
    private String codigo;

    public Estudiante(String codigo, String nombre, int edad, String direccion) {
        super(nombre, direccion, edad);
        this.codigo = codigo;
    }
    
    public Estudiante () {
        
    }
    
      public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    @Override
    public String toString() {
        
        return "La Persona:\n" 
                + "\nNombre: " + nombre
                + "\nDirecciòn: " + direccion 
                + "\nEdad: " + edad
                + "\nCodigo: " + codigo
                + '.';
        
    }
}
