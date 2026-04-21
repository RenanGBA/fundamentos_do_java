import java.util.Scanner;

public class verificadorParOuImpar {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        System.out.println("Por favor, digite um número inteito.");
        numero = scanner.nextInt();
        
        if (numero%2==0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        scanner.close();
    }
}