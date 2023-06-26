package poo.HerenciaAbstraccion;
public class EjemploHerenciaAbstracta {
    public static void main(String[] args) {
        EmpleadoPermanente empleado1 = new EmpleadoPermanente("Juan", 35, 2000, 500);
        EmpleadoTemporal empleado2 = new EmpleadoTemporal("María", 28, 15, 40);

        double salarioEmpleado1 = empleado1.calcularSalario();
        double salarioEmpleado2 = empleado2.calcularSalario();

        System.out.println("Salario de " + empleado1.getNombre() + ": $" + salarioEmpleado1);
        System.out.println("Salario de " + empleado2.getNombre() + ": $" + salarioEmpleado2);
    }
}




