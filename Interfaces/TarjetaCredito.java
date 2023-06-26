package poo.Interfaces;
// Interfaz para métodos de pago
interface MetodoPago {
    void realizarPago(double monto);
}

// Clase que implementa el pago con tarjeta de crédito
class TarjetaCredito implements MetodoPago {
    private String numeroTarjeta;
    private String fechaExpiracion;

    public TarjetaCredito(String numeroTarjeta, String fechaExpiracion) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Realizando pago con tarjeta de crédito...");
        System.out.println("Número de tarjeta: " + numeroTarjeta);
        System.out.println("Fecha de expiración: " + fechaExpiracion);
        System.out.println("Monto a pagar: $" + monto);
        System.out.println("Pago exitoso.");
    }
}