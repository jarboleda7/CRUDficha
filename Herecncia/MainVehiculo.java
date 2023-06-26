package poo.Herecncia;

public class MainVehiculo {
    public static void main(String[] args) {


        Automovil automovil = new Automovil("Ford", "Mustang", 2020, 2);
        double costoMantenimiento = automovil.calcularCostoMantenimiento();
        System.out.println("El costo de mantenimiento del automóvil es: $" + costoMantenimiento);
    }
}
