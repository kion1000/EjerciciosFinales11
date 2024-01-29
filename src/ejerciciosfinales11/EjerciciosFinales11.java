
package ejerciciosfinales11;



public class EjerciciosFinales11 {


    public static void main(String[] args) {
        
        String nombre1= "Jonay Armas Suarez";
        String direccion1= "Calle Luciana Diaz, Nº 42";
        int edad1= 24;
        String codigo1="116";
        EstudianteInt.Nacionalidad nacionalidad1 = EstudianteInt.Nacionalidad.FRANCES;
        boolean esErasmus1=true;
        
        EstudianteInt estudiante1 = new EstudianteInt (esErasmus1, nacionalidad1, codigo1, nombre1, direccion1, edad1);
        
        String nombre2 ="Omar Ramos Perez";
        String direccion2="Calle La Rosa, Nº 35";
        int edad2= 26;
        String codigo2 = " 117";
        EstudianteInt.Nacionalidad nacionalidad2 = EstudianteInt.Nacionalidad.AMERICANO;
        boolean esErasmus2=true;
        
        EstudianteInt estudiante2 = new EstudianteInt (esErasmus2, nacionalidad2, codigo2, nombre2, direccion2, edad2);
                
        String nombre3 = "Juan Dorta Gonzalez";
        String direccion3= "Calle Mendez Nuñez, Nº 40";
        int edad3= 56;
        String codigo3 = "118";
        EstudianteInt.Nacionalidad nacionalidad3 = EstudianteInt.Nacionalidad.INGLES;
        boolean esErasmus3=true;
        
        EstudianteInt estudiante3 = new EstudianteInt(esErasmus3, nacionalidad3, codigo3, nombre3, direccion3, edad3);
        
        String nombre4 = "Elena Ramos Alvarez";
        String direccion4 = "Calle Domingo Perez Minik, Nº 23";
        int edad = 37;
        String codigo4= "120";
        
        Estudiante estudiante4 = new Estudiante(codigo4, nombre4, edad, direccion4);
        
        String nombre5 = "Aitor Armas Ramos";
        String direccion5="Calle Carlote, Nº 25";
        int edad5 = 18;
        String codigo5 = "122";
        
        Estudiante estudiante5 = new Estudiante(codigo5, nombre5, edad, direccion5);
        
        
        System.out.println("\n" + estudiante4.toString());
        
        System.out.println("\n" + estudiante5.toString());
        
        System.out.println("\n" + estudiante1.toString());
        
        System.out.println("\n" + estudiante2.toString());
        
        System.out.println("\n" + estudiante3.toString());
