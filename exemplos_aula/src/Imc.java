import java.util.Scanner;

public class Imc {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double peso, altura;

        System.out.println("Qual o peso?");
        peso = scanner.nextDouble();
        System.out.println("Qual a altura?");
        altura = scanner.nextDouble();
        scanner.close();
        System.out.println("O seu IMC é " + (peso/(Math.pow(altura, 2))));
        
       
    }
}
