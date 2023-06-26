package poo.Interfaces;

// Clase que implementa el pago mediante PayPal
class PayPal implements MetodoPago {
    private String correoElectronico;
    private String contrasena;

    public PayPal(String correoElectronico, String contrasena) {
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Realizando pago mediante PayPal...");
        System.out.println("Correo electrónico: " + correoElectronico);
        System.out.println("Contraseña: " + contrasena);
        System.out.println("Monto a pagar: $" + monto);
        System.out.println("Pago exitoso.");
    }
}