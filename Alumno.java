public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        if (nombre.length()<3) {
            System.out.println("error la palabra debe tener mas de 3 caracteres");
        }

        if (numeroMatricula.length()<4){
            System.out.println("error la matricula debe tener mas de 4 numeros");
        }
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    public String getNumeroMatriculaAlumno() {
        return numeroMatricula;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        String resultado = "";
        String resultado1 = "";
        String resultado2 = "";
        if (nombre.length()<=3){
            resultado1 = nombre;
        }
        else{
            resultado1 = nombre.substring(0,3);
        }

        if (numeroMatricula.length()<=4){
            resultado2 = numeroMatricula;
        }
        else{
            resultado2 = numeroMatricula.substring(0,4);
        }
        resultado = resultado1 + resultado2;
        return resultado;
    }
}

