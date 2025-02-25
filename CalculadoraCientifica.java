import java.lang.Math;
public class CalculadoraCientifica extends Calculadora {

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
            case "seno":
                setResultado(Math.sin(Math.toRadians(a)));
                break;
            case "cosseno":
                setResultado(Math.cos(Math.toRadians(a)));
                break;
            case "tangente":
                setResultado(Math.tan(Math.toRadians(a)));
                break;
            case "logaritmo":
                if (a > 0) {
                    setResultado(Math.log(a));
                } else {
                    throw new ArithmeticException("Logaritmo de número não positivo não é permitido.");
                }
                break;
            default:
                throw new IllegalArgumentException("Operação inválida");
        }
        return getResultado();
    }
}
