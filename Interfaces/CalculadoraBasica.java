package poo.Interfaces;

public class CalculadoraBasica implements Calculadora {
    @Override
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("No se puede dividir por cero");
        }
    }
}
