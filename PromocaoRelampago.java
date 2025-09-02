import java.math.BigDecimal;
import java.util.Scanner;

public class PromocaoRelampago {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valorCompra = scanner.nextLine();
        System.out.println(calcularDesconto(valorCompra));
        scanner.close();
    }

    public static String calcularDesconto(String valorCompra) {
        BigDecimal valor = new BigDecimal(valorCompra);
        BigDecimal valor1 = new BigDecimal("50");
        BigDecimal valor2 = new BigDecimal("100");
        BigDecimal descontoPercentual;

        if (valor.compareTo(valor1) < 0) {
            descontoPercentual = BigDecimal.ZERO;
        } else if (valor.compareTo(valor1) >= 0 && valor.compareTo(valor2) <= 0) {
            descontoPercentual = new BigDecimal("0.10");
        } else {
            descontoPercentual = new BigDecimal("0.20");
        }

        int percentual = (int) Math.round(descontoPercentual.doubleValue() * 100);
        return "Desconto de " + percentual + "%";
    }
}