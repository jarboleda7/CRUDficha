package poo.Interfaces;

// Clase que implementa la interfaz Venta para servicios
public class VentaServicios implements Venta {
    private String[] servicios;
    private double[] precios;

    public VentaServicios(String[] servicios, double[] precios) {
        this.servicios = servicios;
        this.precios = precios;
    }

    @Override
    public void calcularTotal() {
        double total = 0;
        for (double precio : precios) {
            total += precio;
        }
        System.out.println("El total de la venta de servicios es: " + total);
    }

    @Override
    public void generarFactura() {
        System.out.println("Generando factura para la venta de servicios...");
        // Lógica para generar la factura
    }
}



