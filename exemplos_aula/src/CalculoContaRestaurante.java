import java.util.Scanner;

public class CalculoContaRestaurante {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int pagantes;
        double valor, porcentagemServico, valorComPorcentagem;

        System.out.println("Qual o valor da conta?");
        valor = scanner.nextDouble();
        System.out.println("Qual a porcentagem da taxa de serviço?");
        porcentagemServico = scanner.nextDouble();
        System.out.println("Qual o número de pessoas pagantes?");
        pagantes = scanner.nextInt();
        valorComPorcentagem = valor+valor*(porcentagemServico/100);
        scanner.close();
        System.out.println("Cada pessoa precisa pagar: R$" + valorComPorcentagem/pagantes);
     }
}
