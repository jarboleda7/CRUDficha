package poo.Herencia1.Operaciones;
import java.util.Scanner;
public class ClasePadre {
    protected int valor1, valor2, resultado;
    Scanner entrada =new Scanner(System.in);
    public void PedirDatos() {
        System.out.print("Digite el primer valor: ");
        valor1=entrada.nextInt();
        System.out.print("Digite el segundo valor: " );
        valor2=entrada.nextInt();
    }
    public void mostrarResultado() {
        System.out.println("El resultado es :"+resultado);
    }
}