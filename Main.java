public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        estudiante.setNombre("Yaritza Chavez Chavez");
        estudiante.setMatricula("230110692");
        estudiante.setCalificacion(95);

        double promedio = estudiante.calcularPromedio();
        System.out.println("Promedio calculado: " + promedio);
        estudiante.mostrarInformacion();
    }
}
