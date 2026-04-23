import java.util.Scanner;

public class cofrinhoDigital {
    public static void main(String[] args) {
        double moeda,soma=0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite o valor da moeda: ");
            moeda = scanner.nextDouble();
            soma+=moeda;
            System.out.println("R$"+soma);
        } while (moeda!=0);
        

        System.out.println("Você guardou um total de R$:"+soma);
        scanner.close();
    }
}
