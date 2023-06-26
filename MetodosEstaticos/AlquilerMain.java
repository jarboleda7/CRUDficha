package poo.MetodosEstaticos;

import javax.swing.*;

import static poo.MetodosEstaticos.Alquiler.calcularPrecioTotal;

public class AlquilerMain {

    public static void main(String[] args) {
        String direccion = JOptionPane.showInputDialog("Ingrese la dirección:");
        double precioMensual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio mensual:"));
        int duracionMeses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duración en meses:"));
        boolean amueblado = JOptionPane.showInputDialog("¿El apartamento está amueblado? (S/N)").equalsIgnoreCase("S");

        Alquiler alquiler = new Alquiler(direccion, precioMensual, duracionMeses, amueblado);

        double precioTotal = calcularPrecioTotal(alquiler);

        JOptionPane.showMessageDialog(null, "El precio total de " + duracionMeses + " meses es: $" + precioTotal);
    }


}

