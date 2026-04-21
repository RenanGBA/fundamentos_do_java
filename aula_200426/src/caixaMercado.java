import java.util.Scanner;

public class caixaMercado {
    public static void main(String[] args) {
        int quantidade;
        double valor,valorFinal;
        String produto;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o produto?");
        produto = scanner.nextLine();

        System.out.println("Qual o valor unitário do produto?");
        valor = scanner.nextDouble();

        System.out.println("Qual a quantidade comprada?");
        quantidade = scanner.nextInt();

        valorFinal = valor*quantidade;

        System.out.println("O produto " + produto + "custou um total de R$" + valorFinal);

        scanner.close();
    }
}
