import java.util.Scanner;

public class calculoCupomDesconto {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double valor, desconto;

        System.out.println("Qual o valor do produto?");
        valor = scanner.nextDouble();

        System.out.println("Qual o valor do desconto?");
        desconto = scanner.nextDouble();
        
        System.out.println("O valor do produto com desconto é: R$" + (valor - (valor*(desconto/100))));

        scanner.close();
    }
}
