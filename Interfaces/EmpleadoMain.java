package poo.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoMain {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        // Agregar empleados a la lista
        empleados.add(new EmpleadoPermanente("Juan", 3000.0));
        empleados.add(new EmpleadoTemporal("María", 6, 2000.0));

        // Imprimir información de los empleados
        for (Empleado empleado : empleados) {
            empleado.imprimirInformacion();
            System.out.println("------------------------");
        }
    }
}
