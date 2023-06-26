package poo.Polimorfismo;

public class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;

    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Método que va a cambiar de acuerdo a la clase, Retorna la matrícula, la marca y el modelo
    public String mostrarDatos() {
//Hcerlo visible al usuario
        return "Matricula :" + matricula + "\nMarca :" + marca + "\nModelo: " + modelo;
    }
}

