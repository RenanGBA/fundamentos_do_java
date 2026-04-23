import java.util.Scanner;

public class menuInfinito {
    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Por favor escolha a opção:\n1-Saldo\n2-Saque\n3-Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Exibindo saldo...");
                    break;
            
                case 2:
                    System.out.println("Iniciando saque...");
                    break;

                case 3:
                    System.out.println("Encerrando sistema...");
                    break;
                
                default:
                    System.out.println("Opção invalida!");
            }
        } while(opcao!=3);

        scanner.close();
    }
}
