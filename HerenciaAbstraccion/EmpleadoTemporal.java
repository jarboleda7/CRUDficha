package poo.HerenciaAbstraccion;
class EmpleadoTemporal extends Empleado {
    private double salarioHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, int edad, double salarioHora, int horasTrabajadas) {
        super(nombre, edad, 0); // El salario se calcula posteriormente
        this.salarioHora = salarioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return salarioHora * horasTrabajadas;
    }

    // Setters y Getters adicionales
    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
