package poo.Polimorfismo;

public class PtoElectronicoMain {


    public static void main(String[] args) {
        // Crear objetos de diferentes tipos
        ProductoElectronico producto1 = new Telefono("Samsung", 499.99, "Galaxy S20");
        ProductoElectronico producto2 = new Computadora("HP", 899.99, "Portátil");
        ProductoElectronico producto3 = new Tableta("Apple", 699.99, "iOS");

        // Llamar al método mostrarInformacion() de manera polimórfica
        producto1.mostrarInformacion();
        System.out.println();
        producto2.mostrarInformacion();
        System.out.println();
        producto3.mostrarInformacion();
    }
}

