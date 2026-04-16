import java.util.Scanner;

public class filaPrioritaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        String gestante, pcd;

        System.out.println("Qual a sua idade?");
        idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("É gestante? s/n");
        gestante = scanner.nextLine();
        System.out.println("É PCD? s/n");
        pcd = scanner.nextLine();
        scanner.close();

        if (idade >= 65 || gestante.equals("s") || pcd.equals("s")){
            System.out.println("Fila prioritária.");
        } else {
            System.out.println("Fila padrão.");
        }
    }
}
