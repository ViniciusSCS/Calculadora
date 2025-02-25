public abstract class Calculadora {
    private double resultado;

    public double getResultado() {
        return resultado;
    }

    protected void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public abstract double calcular(double a, double b, String operacao);
}