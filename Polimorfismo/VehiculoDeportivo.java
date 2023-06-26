package poo.Polimorfismo;


    public class VehiculoDeportivo extends Vehiculo {
        private int cilindrada;
        // Se crea el constructor
        public VehiculoDeportivo(int cilindrada, String matricula, String marca, String
                modelo) {
            super(matricula, marca, modelo);
            this.cilindrada = cilindrada;
        }
        public int getCilindrada() {
            return cilindrada;
        }
        // Método para mostrar los datos de la clase y el dato adicional
        //@Override
        public String mostrarDatos() {
// ademas de mostrar los datos de la clase hija, hay que mostrar otro adicional que es cilindrada.
            return "Matricula :"+ matricula+"\nMarca :"+marca+"\nModelo: "+
                    modelo+"\nCilindrada :"+cilindrada;
        }
    }

