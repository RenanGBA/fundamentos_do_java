import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int segundos, horas, minutos, segundosRestantes;

        System.out.println("Digite o tempo em segundos:");
        segundos = scanner.nextInt();
        horas = segundos / 3600;
        segundosRestantes = segundos%3600;
        minutos = segundosRestantes/60;
        segundosRestantes = segundosRestantes%60;
        scanner.close();
        System.out.print(horas + "h " + minutos + "min " + segundosRestantes + "s");
     }
}