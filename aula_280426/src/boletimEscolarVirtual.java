import java.util.Scanner;

public class boletimEscolarVirtual {
    public static void main(String[] args) {
        String nome;
        double notaUm, notaDois;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do aluno?");
        nome = scanner.nextLine();

        System.out.println("Qual a primeira nota?");
        notaUm = scanner.nextDouble();

        System.out.println("Qual a segunda nota?");
        notaDois = scanner.nextDouble();

        exitirBoletim(nome, notaUm, notaDois);

        scanner.close();
    }

    public static void exitirBoletim(String nome, double notaUm, double notaDois){
        double media = (notaUm+notaDois)/2;

        if (media >= 7){
            System.out.printf("O aluno " + nome + "foi aprovado com a média de %.2f", media);
        } else {
            System.out.printf("O aluno " + nome + "foi reprovado com a média de %.2f", media);
        }
        
    }
}
