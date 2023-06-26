package poo.Interfaces;

// Clase que implementa la interfaz Venta para productos
public class VentaProductos implements Venta {
    private String[] productos;
    private double[] precios;

    public VentaProductos(String[] productos, double[] precios) {
        this.productos = productos;
        this.precios = precios;
    }

    @Override
    public void calcularTotal() {
        double total = 0;
        for (double precio : precios) {
            total += precio;
        }
        System.out.println("El total de la venta de productos es: " + total);
    }

    @Override
    public void generarFactura() {
        System.out.println("Generando factura para la venta de productos...");
        // Lógica para generar la factura
    }

}
