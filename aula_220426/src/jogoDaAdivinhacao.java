import java.util.*;

public class jogoDaAdivinhacao {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int r, n = random.nextInt(0,100);
        
        do {
            System.out.println("Qual o número?");
            r = scanner.nextInt();
            if (r<n){
                System.out.println("Muito baixo.");
            } else if (r>n){
                System.out.println("Muito alto!");
            } else {
                System.out.println("Parabéns, o número era: " + n);
            }
        } while (r!=n);

        scanner.close();
    }
}
