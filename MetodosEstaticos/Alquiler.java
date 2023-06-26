package poo.MetodosEstaticos;

import javax.swing.JOptionPane;

public class Alquiler {

    private String direccion;
    private double precioMensual;
    private int duracionMeses;
    private boolean amueblado;

    public Alquiler(String direccion, double precioMensual, int duracionMeses, boolean amueblado) {
        this.direccion = direccion;
        this.precioMensual = precioMensual;
        this.duracionMeses = duracionMeses;
        this.amueblado = amueblado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecioMensual() {
        return precioMensual;
    }

    public void setPrecioMensual(double precioMensual) {
        this.precioMensual = precioMensual;
    }

    public int getDuracionMeses() {
        return duracionMeses;
    }

    public void setDuracionMeses(int duracionMeses) {
        this.duracionMeses = duracionMeses;
    }

    public boolean isAmueblado() {
        return amueblado;
    }

    public void setAmueblado(boolean amueblado) {
        this.amueblado = amueblado;
    }

    public static double calcularPrecioTotal(Alquiler alquiler) {
        return alquiler.getPrecioMensual() * alquiler.getDuracionMeses();
    }

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
