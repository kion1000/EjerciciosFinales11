
package ejerciciosfinales11;



public class EjerciciosFinales11 {


    public static void main(String[] args) {
        
        String nombre1= "Jonay Armas Suarez";
        String direccion1= "Calle Luciana Diaz, Nº 42";
        int edad1= 37;
        String codigo1="116";
        EstudianteInt.Nacionalidad nacionalidad1 = EstudianteInt.Nacionalidad.FRANCES;
        boolean esErasmus1= true;
        
        EstudianteInt estudiante1 = new EstudianteInt (esErasmus1, nacionalidad1, codigo1, nombre1, direccion1, edad1);
        
        System.out.println("\n" + estudiante1.toString());
        
        
        
        
        
        
    }
    
}
