import java.util.Scanner;

public class calculadoraDesconto {
    public static void main(String[] args) {
        String produto;
        double valor;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do produto?");
        produto = scanner.nextLine();

        System.out.println("Qual o valor do produto?");
        valor = scanner.nextDouble();

        aplicarDesconto(produto, valor);

        scanner.close();
    }

    public static void aplicarDesconto(String produto, double valor){
        double desconto = valor - (valor*.30);
        System.out.println("PROMOÇÃO: O profuto " + produto + " caiu de " + valor + " para " + desconto);
    }
}
