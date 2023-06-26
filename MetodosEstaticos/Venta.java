package poo.MetodosEstaticos;
import java.util.ArrayList;
import java.util.List;

class Venta {
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private double total;

    public Venta(String producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.total = cantidad * precioUnitario;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.total = cantidad * precioUnitario;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
        this.total = cantidad * precioUnitario;
    }

    public double getTotal() {
        return total;
    }

    public static double calcularTotalVentas(List<Venta> ventas) {
        double totalVentas = 0;
        for (Venta venta : ventas) {
            totalVentas += venta.getTotal();
        }
        return totalVentas;
    }

    public static Venta encontrarVentaMasCara(List<Venta> ventas) {
        Venta ventaMasCara = null;
        double precioMasAlto = 0;
        for (Venta venta : ventas) {
            if (venta.getPrecioUnitario() > precioMasAlto) {
                precioMasAlto = venta.getPrecioUnitario();
                ventaMasCara = venta;
            }
        }
        return ventaMasCara;
    }
}

