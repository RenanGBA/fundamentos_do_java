import java.util.Scanner;

public class verificadorSenha {
    public static void main(String[] args) throws Exception {
        String senha;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Insira a senha:");
            senha = scanner.nextLine();
            
            if (!senha.equals("java123")){
                System.out.println("Senha incorreta!");
            }
        } while (!senha.equals("java123"));
        
        System.out.println("Acesso liberado.");
        
        scanner.close();
    }
}
