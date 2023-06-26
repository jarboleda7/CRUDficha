package poo.Interfaces;

public class EnsamblajeMain {
    public static void main(String[] args) {
        EnsamblajeAutomovil automovil = new EnsamblajeAutomovil("Sedan", 100, 2);
        double costo = automovil.calcularCosto();
        int tiempo = automovil.calcularTiempo();
        String modelo = automovil.getModelo();

        System.out.println("Información del automóvil:");
        System.out.println("Modelo: " + modelo);
        System.out.println("Costo de ensamblaje: $" + costo);
        System.out.println("Tiempo de ensamblaje: " + tiempo + " horas");
    }
}