package poo.MetodosEstaticos;

public class CalculadoraMain {
    public static void main(String[] args) {
        int resultadoSuma = Calculadora.sumar(5, 3);
        System.out.println("La suma es: " + resultadoSuma);

        int resultadoResta = Calculadora.restar(8, 4);
        System.out.println("La resta es: " + resultadoResta);
    }
}
