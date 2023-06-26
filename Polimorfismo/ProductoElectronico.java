package poo.Polimorfismo;

public class ProductoElectronico {
    private String marca;
    private double precio;

    public ProductoElectronico(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Precio: $" + precio);
    }
}
