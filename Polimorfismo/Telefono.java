package poo.Polimorfismo;

public class Telefono extends ProductoElectronico {
    private String modelo;

    public Telefono(String marca, double precio, String modelo) {
        super(marca, precio);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Modelo: " + modelo);
    }
}

