package poo.Herecncia;

// Esta e la clase Hija
class Perro extends Animal {
    private String raza, color;

    public Perro(String nombre, String raza, String color) {
        super(nombre,color);
        this.raza = raza;

    }

    public void ladrar() {
        System.out.println("El perro " + nombre + " de raza " + raza + " está ladrando.");
    }
}