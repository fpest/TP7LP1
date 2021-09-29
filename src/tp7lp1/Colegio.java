package tp7lp1;

public class Colegio {

    public static void main(String[] args) {

        Materia m1 = new Materia(1, "Ingles", 1);
        Materia m2 = new Materia(2, "Matematicas", 1);
        Materia m3 = new Materia(3, "Laboratorio 1", 1);
        
        Alumno a1 = new Alumno(1001,"Lopez", "Martin");
        Alumno a2 = new Alumno(1002,"Martinez", "Brenda");
        
        
        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        a1.agregarMateria(m3);
        
        System.out.println("Cantidad de materias en las que esta inscripto: " + a1.getApellido()+ " = " + a1.cantidadMaterias());
        
        a2.agregarMateria(m1);
        a2.agregarMateria(m2);
        a2.agregarMateria(m3);
        
        System.out.println("Cantidad de materias en las que esta inscripto: " + a2.getApellido()+ " = " + a2.cantidadMaterias());
        
        
        System.out.println("Ahora se intenta inscribirlo nuevamente en Lab 1");
        
        a2.agregarMateria(m3);
       
        System.out.println("Cantidad de materias en las que esta inscripto: " + a2.getApellido()+ " = " + a2.cantidadMaterias());
        
    }
    
}
