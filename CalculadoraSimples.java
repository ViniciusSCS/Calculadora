public class CalculadoraSimples extends Calculadora {

    @Override
    public double calcular(double a, double b, String operacao) {
        switch (operacao) {
            case "soma":
                setResultado(a + b);
                break;
            case "subtracao":
                setResultado(a - b);
                break;
            case "multiplicacao":
                setResultado(a * b);
                break;
            case "divisao":
                if (b != 0) {
                    setResultado(a / b);
                } else {
                    throw new ArithmeticException("Divisão por zero não é permitida.");
                }
                break;
            default:
                throw new IllegalArgumentException("Operação inválida");
        }
        return getResultado();
    }
}
