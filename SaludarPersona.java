package poo;

public class SaludarPersona {
    private String nombre;
    private int edad;
    private double salario;
    private double bonificac;

    public SaludarPersona(String nombre, int edad, double salario, double bonificac) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.bonificac = bonificac;
    }

    public String getNombre() {
        return nombre;
    }

    private int getEdad() {
        return edad;
    }

    private double getSalario() {
        return salario;
    }

    private double getBonifica() {
        return bonificac;
    }


    public void saludar() {
        System.out.println("¡Hola! Mi nombre es " + nombre + " y tengo " + edad + " años." +
                "Mi salario es :" + salario + " " + "Mi bonificación es :" + bonificac);
    }
}

