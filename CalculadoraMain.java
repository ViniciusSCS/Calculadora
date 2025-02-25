public class CalculadoraMain {
    public static void main(String[] args) {
        CalculadoraSimples calcSimples = new CalculadoraSimples();
        System.out.println("Soma: " + calcSimples.calcular(10, 5, "soma"));
        System.out.println("Subtração: " + calcSimples.calcular(10, 5, "subtracao"));
        System.out.println("Multiplicação: " + calcSimples.calcular(10, 5, "multiplicacao"));
        System.out.println("Divisão: " + calcSimples.calcular(10, 5, "divisao"));

        CalculadoraCientifica calcCientifica = new CalculadoraCientifica();
        System.out.println("Seno de 30 graus: " + String.format("%.2f",calcCientifica.calcular(30, 0, "seno")));
        System.out.println("Cosseno de 45 graus: " + String.format("%.2f",calcCientifica.calcular(45, 0, "cosseno")));
        System.out.println("Tangente de 60 graus: " + String.format("%.2f",calcCientifica.calcular(60, 0, "tangente")));
        System.out.println("Logaritmo de 10: " + String.format("%.2f",calcCientifica.calcular(10, 0, "logaritmo")));
    }
}
