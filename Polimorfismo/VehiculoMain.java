package poo.Polimorfismo;

public class VehiculoMain {
    public static void main(String[] args) {
// Crear un arreglo de vehiculos
        Vehiculo misVehiculos[] =new Vehiculo[4];
//Fijar un vehiculo en mi arreglo instanciado desde la clase padre vehiculo
        misVehiculos[0] = new Vehiculo("GH67", "Ferrari", "A89");
// Aqui aplicamos el POLIMORFISMO, estamos haciendo que un objeto de la         clase padre
//guarde una instanciación de una su clase hija
        misVehiculos[1] =new VehiculoTurismo(4,"78HJ","Audi","P14");
        misVehiculos[2] =new VehiculoDeportivo(500,"45GH","Toyota","KJ8");
        misVehiculos[3] =new VehiculoFurgoneta(2000,"JI8","Toyota","J9");
// Imprimimos todos los vehiculos con un ciclo for each
// Cada uno actua difrente de acuerdo a la clase instnaciada
        for(Vehiculo vehiculos:misVehiculos) {
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
    }
}