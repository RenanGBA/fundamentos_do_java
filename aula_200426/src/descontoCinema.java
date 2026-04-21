import java.util.Scanner;

public class descontoCinema {
    public static void main(String[] args) {
        int idade;
        String estudante;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        idade = scanner.nextInt();

        System.out.println("É estudante?");
        scanner.nextLine();
        estudante = scanner.nextLine();

        if (idade >= 60){
            System.out.println("Valor do ingresso: R$20,00");
        } else if (estudante.equals("Sim")){
            System.out.println("Valor do ingresso: R$20,00");
        } else {
            System.out.println("Valor do ingresso: R$40,00");
        }

        scanner.close();
    }
    
    
}
