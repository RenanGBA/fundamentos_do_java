import java.util.Scanner;

public class radarVelocidade {
    public static void main(String[] args) {
        int velocidade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a velocidade");
        velocidade = scanner.nextInt();

        if (velocidade>80){
            System.out.println("Multado! Você excedeu o limite.");
        } else {
            System.out.println("Velocidade dentro do limite. Boa viagem!");
        }

        scanner.close();
    }
}
