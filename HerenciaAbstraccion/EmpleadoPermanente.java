package poo.HerenciaAbstraccion;

    class EmpleadoPermanente extends Empleado {
        private double bono;

        public EmpleadoPermanente(String nombre, int edad, double salario, double bono) {
            super(nombre, edad, salario);
            this.bono = bono;
        }

        @Override
        public double calcularSalario() {
            return getSalario() + bono;
        }

        // Setter y Getter adicional
        public double getBono() {
            return bono;
        }

        public void setBono(double bono) {
            this.bono = bono;
        }
    }



