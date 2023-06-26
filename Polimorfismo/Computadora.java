package poo.Polimorfismo;
public class Computadora extends ProductoElectronico {
    private String tipo;

    public Computadora(String marca, double precio, String tipo) {
        super(marca, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: " + tipo);
    }
}