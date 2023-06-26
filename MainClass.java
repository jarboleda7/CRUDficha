package poo;
public class MainClass {
    public static void main(String[] args) {
        // Se crea un objeto de la clase Estudiante
        Estudiante estudiante = new Estudiante("Mathius Panda", 50, "Inteligencia Artificial");

        // se Imprimen los detalles del estudiante utilizando los métodos getter
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Carrera: " + estudiante.getCarrera());

        // Se actualiza la edad del estudiante utilizando el método setter
        estudiante.setEdad(71);

        // Aquí se imprime la nueva edad del estudiante utilizando el método getter
        System.out.println("Nueva Edad: " + estudiante.getEdad());
    }
}