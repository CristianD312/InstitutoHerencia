
package institutoherencia;


public class Profesor extends Persona {
    
    private int numProfesor;
    private String materia;

    public Profesor(int numProfesor, String materia, String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.numProfesor = numProfesor;
        this.materia = materia;
    }

    public int getNumProfesor() {
        return numProfesor;
    }

    public void setNumProfesor(int numProfesor) {
        this.numProfesor = numProfesor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    
    
}
