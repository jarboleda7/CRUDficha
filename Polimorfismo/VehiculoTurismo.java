package poo.Polimorfismo;

public class VehiculoTurismo extends Vehiculo{
    // Atributo extra del vehiculo
    private int nPuertas;
    // Se crea el constructor
    public VehiculoTurismo(int nPuertas, String matricula, String marca, String
            modelo) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }
    // Método getter para retornar el número de puertas
    public int getnPuertas() {
        return nPuertas;
    }
    /*Sobreescribimos el método de la clase padre. por que en la clase vehiculo
    a parte de tener heredados matricula, marca, modelo, también tenemos que
    agregar     nPuertas que es propia de esta clase*/

   // @Override
    public String mostrarDatos() {
        return "Matricula :"+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+
                "\nNumero de Puertas :"+nPuertas;
    }
}
