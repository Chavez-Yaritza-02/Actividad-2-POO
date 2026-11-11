public class Estudiante {
    private String nombre;
    private String matricula;
    private double calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio.");
        }
        this.nombre = nombre.trim();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || !matricula.matches("[0-9]+")) {
            throw new IllegalArgumentException("La matricula debe contener solo numeros.");
        }
        this.matricula = matricula;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (Double.isNaN(calificacion) || calificacion < 0 || calificacion > 100) {
            throw new IllegalArgumentException("La calificacion debe estar entre 0 y 100.");
        }
        this.calificacion = calificacion;
    }

    public double calcularPromedio() {
        return calificacion;
    }

    public void mostrarInformacion() {
        System.out.println("--- INFORMACION DEL ESTUDIANTE ---");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Calificacion: " + getCalificacion());
        System.out.println("Promedio: " + calcularPromedio());
    }
}
