import java.util.Scanner;

public class verificadorDeSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaInput, senha;
        senha = "admin123";
        
        System.out.println("Digite a senha:");
        senhaInput = scanner.nextLine();

        if (senhaInput.equals(senha)){
            System.out.println("Acesso aprovado!");
        } else {
            System.out.println("Senha incorreta! \nAcesso negado!");
        }
        
        scanner.close();
    }
}
