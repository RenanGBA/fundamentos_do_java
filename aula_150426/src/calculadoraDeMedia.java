import java.util.Scanner;

public class calculadoraDeMedia {
    public static void main(String[] args) throws Exception {
        double n1, n2, media;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a primeira nota?");
        n1 = scanner.nextDouble();
        System.out.println("Qual a segunda nota?");
        n2 = scanner.nextDouble();
        scanner.close();
        media = (n1+n2)/2;
        
        if (media >= 9){
            System.out.println("Parabéns pelo desempenho!");
        }
        System.out.println("Sua média foi: " + media);
        
    }
}
