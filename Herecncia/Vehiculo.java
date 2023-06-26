package poo.Herecncia;
//Clase abstracta
abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    // Método abstracto para calcular el costo de mantenimiento
    public abstract double calcularCostoMantenimiento();
}
