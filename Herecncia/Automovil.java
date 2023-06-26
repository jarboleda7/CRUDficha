package poo.Herecncia;

// Clase derivada
class Automovil extends Vehiculo {
    private int numeroPuertas;

    public Automovil(String marca, String modelo, int año, int numeroPuertas) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
    }
    // Implementación del método abstracto para calcular el costo de mantenimiento
    public double calcularCostoMantenimiento() {
        // Cálculo específico para automóviles
        double costoBase = 1000;
        double costoPuertas = numeroPuertas * 100;
        return costoBase + costoPuertas;
    }
}