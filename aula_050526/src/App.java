import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcao;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1 - Iniciar sistema\n2 - Sair do sistema");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    calcularBonus();
                    
                    break;
            
                case 2:
                    System.out.println("Saindo do sistema!");
                    break;
                
                default:
                    System.out.println("Operação inválida!");
                    break;
            }
        } while (opcao != 2);

        scanner.close();
    }


    public static void calcularBonus(){
        String nomeFuncionario;
        int anosDeEmpresa;
        Scanner scanner = new Scanner(System.in);
        double bonus;
        
        System.out.println("Digite o nome do funcionario: ");
        nomeFuncionario = scanner.nextLine();

        System.out.println("Quantos anos de empresa tem esse funcionario?");
        anosDeEmpresa = scanner.nextInt();

        bonus = calcularPremio(anosDeEmpresa);

        if (nomeFuncionario.equals("Gerente")){
            bonus+=1000;
        }

        System.out.println("Bonus de R$ " + bonus);

        scanner.close();
    }

    public static double calcularPremio(int anosTrabalhados) {
        return anosTrabalhados*200; 
    }
}
