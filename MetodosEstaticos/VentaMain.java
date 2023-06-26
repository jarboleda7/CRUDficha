package poo.MetodosEstaticos;

import java.util.ArrayList;
import java.util.List;

public class VentaMain {

           public static void main(String[] args) {
            Venta venta1 = new Venta("Producto1", 5, 10.0);
            Venta venta2 = new Venta("Producto2", 3, 8.0);
            Venta venta3 = new Venta("Producto3", 2, 15.0);

            List<Venta> ventas = new ArrayList<>();
            ventas.add(venta1);
            ventas.add(venta2);
            ventas.add(venta3);

            System.out.println("Total de ventas: " + Venta.calcularTotalVentas(ventas));

            Venta ventaMasCara = Venta.encontrarVentaMasCara(ventas);
            if (ventaMasCara != null) {
                System.out.println("La venta más cara es la del producto: " + ventaMasCara.getProducto());
            } else {
                System.out.println("No se encontraron ventas.");
            }
        }
    }


