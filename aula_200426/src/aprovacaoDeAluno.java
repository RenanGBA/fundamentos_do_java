import java.util.Scanner;

public class aprovacaoDeAluno {
    public static void main(String[] args) throws Exception {
        double n1,n2, media;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a primeira nota?");
        n1 = scanner.nextDouble();

        System.out.println("Qual a segunda nota?");
        n2 = scanner.nextDouble();
        
        media = (n1+n2)/2;

        if (media >= 7){
            System.out.println("Aluno aprovado!");
        } else if (media>=5) {
            System.out.println("Aluno em recuperação!");
        } else {
            System.out.println("Aluno reprovado!");
        }
        scanner.close();
    }
}
