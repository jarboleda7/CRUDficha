package poo.Interfaces;

      // Clase que implementa la interfaz Ensamblaje para un tipo específico de automóvil
    class EnsamblajeAutomovil implements Ensamblaje {
        private String modelo;
        private int cantidadPiezas;
        private int tiempoEnsamblaje;

        public EnsamblajeAutomovil(String modelo, int cantidadPiezas, int tiempoEnsamblaje) {
            this.modelo = modelo;
            this.cantidadPiezas = cantidadPiezas;
            this.tiempoEnsamblaje = tiempoEnsamblaje;
        }

        @Override
        public double calcularCosto() {
            // Cálculo del costo basado en la cantidad de piezas
            return cantidadPiezas * 1500;
        }

        @Override
        public int calcularTiempo() {
            // Cálculo del tiempo de ensamblaje
            return tiempoEnsamblaje * cantidadPiezas;
        }

        public String getModelo() {
            return modelo;
        }
    }


