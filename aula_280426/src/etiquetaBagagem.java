import java.util.Scanner;

public class etiquetaBagagem {
    public static void main(String[] args) {
        String nome, destino;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o nome do passageiro?");
        nome = scanner.nextLine();
        System.out.println("Qual o destino do passageiro?");
        destino = scanner.nextLine();
        geradorEtiqueta(nome, destino);
        scanner.close();
    }

    public static void geradorEtiqueta(String nome, String destino){
        System.out.println("BAGAGEM DE: " + nome + " DESTINO: " + destino);
    }
}
