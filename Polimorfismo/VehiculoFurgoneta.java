package poo.Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{
    private int carga;
    // Se crea el constructor
    public VehiculoFurgoneta(int carga, String matricula, String marca, String
            modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }
    public int getCarga() {
        return carga;
    }
    // Método para mostrar los datos de la clase y el dato adicional
   //@Override
    public String mostrarDatos() {
// ademas de mostrar los datos de la clase hija, hay que mostrar otro adicional que es cilindrada.
        return "Matricula :"+ matricula+"\nMarca :"+marca+"\nModelo:"+modelo+"\nCarga :"+carga;
    }
}