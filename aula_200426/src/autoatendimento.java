import java.util.*;

public class autoatendimento {
    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Escolha uma opção:\n 1. Consultar saldo\n 2. Fazer pix\n 3. Falar com Atendente");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Seu saldo é: R$" + random.nextInt(0,10000) + ",00");
                break;
        
            case 2:
                System.out.println("Iniciando pix...");
                break;
            
            case 3:
                System.out.println("Chamando atendente");
                break;
            
            default:
                System.out.println("Opção invalida");
        }

        scanner.close();
    }
}
