package poo.Herencia1.Operaciones;

import poo.Herencia1.Operaciones.ClaseHija_suma;
import poo.Herencia1.Operaciones.ClaseHija_Resta;
public class ClasePrincipal {
    public static void main(String[] args) {
        ClaseHija_suma mensajerosuma =new ClaseHija_suma();
        mensajerosuma.PedirDatos();
        mensajerosuma.sumar();
        System.out.println("El resultado de la suma es : ");
        mensajerosuma.mostrarResultado();
        ClaseHija_Resta mensajeresta =new ClaseHija_Resta();
        mensajeresta.PedirDatos();
        mensajeresta.restar();
        System.out.println("El resultado de la resta es :");
        mensajeresta.mostrarResultado();
    }
}