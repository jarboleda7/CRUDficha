package poo.Polimorfismo;

public class Tableta extends ProductoElectronico {
    private String sistemaOperativo;

    public Tableta(String marca, double precio, String sistemaOperativo) {
        super(marca, precio);
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Sistema operativo: " + sistemaOperativo);
    }
}