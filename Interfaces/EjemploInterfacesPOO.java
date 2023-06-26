package poo.Interfaces;
public class EjemploInterfacesPOO {
    public static void main(String[] args) {
        double monto = 100.0;

        MetodoPago metodoPago1 = new TarjetaCredito("1234 5678 9012 3456", "12/25");
        MetodoPago metodoPago2 = new PayPal("ejemplo@gmail.com", "contrasena123");

        metodoPago1.realizarPago(monto);
        System.out.println("--------------------------");
        metodoPago2.realizarPago(monto);
    }
}
