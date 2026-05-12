import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
            int numeroAlunos;
            double soma = 0;
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Quantos alunos tem na sala?");
            numeroAlunos = scanner.nextInt();

            double[] notas = new double[numeroAlunos];

            for(int i = 0; i < notas.length; i++ ){
                System.out.println("Digite a nota do aluno " + i);
                notas[i] = scanner.nextDouble();
            }

            for(double nota: notas){
                soma+=nota;
            }

            double media = soma/numeroAlunos;

            System.out.println("A media da turma é: " + media);

            Arrays.sort(notas);
            System.out.println("Menor nota: " + notas[0]);
            System.out.println("Maior nota: " + notas[numeroAlunos-1]);

            scanner.close();
    }
}