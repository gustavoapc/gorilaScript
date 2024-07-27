
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        float valorInicial = scanner.nextFloat();

        System.out.print("Digite a taxa de juros (em %): ");
        float taxaJuros = scanner.nextFloat();

        System.out.print("Digite o número de anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite o valor do aporte mensal: ");
        float aporteMensal = scanner.nextFloat();

        float valorFinal = GeneratedCode.calcularInvestimento(valorInicial, taxaJuros, anos, aporteMensal);

        System.out.println("O valor final do investimento é: " + valorFinal + " R$");

        scanner.close();
    }
}
