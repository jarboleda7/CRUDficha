package poo.Interfaces;
public class EmpleadoTemporal implements Empleado {
    private String nombre;
    private int duracionContrato;
    private double salario;
    public EmpleadoTemporal(String nombre, int duracionContrato, double salario) {
        this.nombre = nombre;
        this.duracionContrato = duracionContrato;
        this.salario = salario;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public double calcularSalario() {
        return salario * duracionContrato;
    }
    @Override
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: Empleado Temporal");
        System.out.println("Duración del contrato: " + duracionContrato + " meses");
        System.out.println("Salario mensual: " + salario);
        System.out.println("Salario total: " + calcularSalario());
    }
}
