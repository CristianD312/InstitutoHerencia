package institutoherencia;

public class InstitutoHerencia {

    public static void main(String[] args) {

        Alumno alu1 = new Alumno(1, 4, "Miguel", "Lopez", 20123456);
        Profesor prof1 = new Profesor(1, "Algoritmos", "Cristian", "Disanto", 30123456);
       Alumno alu2 = new Alumno();

        System.out.println("el nombre del alumno es: " + alu1.getNombre());
        alu1.setNombre("Juan");
        System.out.println("el nombre del alumno es: " + alu1.getNombre());
        System.out.println("el apellido del profesor es: " + prof1.getApellido());
        int notaAlumno=alu1.getNota();
        if (notaAlumno > 6) {
            System.out.println("Aprobo");

        } else {
            System.out.println("No aprobo");
        }

    }

}
