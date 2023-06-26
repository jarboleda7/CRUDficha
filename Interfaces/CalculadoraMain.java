package poo.Interfaces;

public class CalculadoraMain {

    public static void main(String[] args) {

        CalculadoraBasica calculadora = new CalculadoraBasica();

        double resultadoSuma = calculadora.sumar(5.0, 3.0);
        System.out.println("Suma: " + resultadoSuma);

        double resultadoResta = calculadora.restar(5.0, 3.0);
        System.out.println("Resta: " + resultadoResta);

        double resultadoMultiplicacion = calculadora.multiplicar(5.0, 3.0);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);

        double resultadoDivision = calculadora.dividir(5.0, 3.0);
        System.out.println("División: " + resultadoDivision);


    }
}
