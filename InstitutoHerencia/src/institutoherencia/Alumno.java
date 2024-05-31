
package institutoherencia;


public class Alumno extends Persona{
    

private int numAlumno;
private int nota;

    public Alumno(int numAlumno, int nota, String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.numAlumno = numAlumno;
        this.nota = nota;
    }

    public Alumno(String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
    }
    

    public int getNumAlumno() {
        return numAlumno;
    }

    public void setNumAlumno(int numAlumno) {
        this.numAlumno = numAlumno;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }





    }
    
    
    

