package poo.Interfaces;
public class EmpleadoPermanente implements Empleado {
    private String nombre;
    private double salario;

    public EmpleadoPermanente(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: Empleado Permanente");
        System.out.println("Salario: " + salario);
    }
}
