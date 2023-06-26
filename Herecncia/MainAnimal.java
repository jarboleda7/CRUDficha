package poo.Herecncia;

public class MainAnimal {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Scooby", "Labrador", "Gris");
        // Se Llama al método de la clase padre
        miPerro.comer();
        // Llamada al método de la clase hija
        miPerro.ladrar();
    }
}

