package poo.Interfaces;

public class VentaMain {

    // Clase principal para probar el ejercicio

        public static void main(String[] args) {
            String[] productos = {"Producto 1", "Producto 2", "Producto 3"};
            double[] preciosProductos = {10.0, 20.0, 30.0};

            String[] servicios = {"Servicio 1", "Servicio 2"};
            double[] preciosServicios = {50.0, 60.0};

            Venta ventaProductos = new VentaProductos(productos, preciosProductos);
            ventaProductos.calcularTotal();
            ventaProductos.generarFactura();

            Venta ventaServicios = new VentaServicios(servicios, preciosServicios);
            ventaServicios.calcularTotal();
            ventaServicios.generarFactura();
        }
    }


