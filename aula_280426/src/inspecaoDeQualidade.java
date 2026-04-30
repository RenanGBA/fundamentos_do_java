import java.util.Scanner;

public class inspecaoDeQualidade {
    public static void main(String[] args) throws Exception {
        int vSim=0, vNao=0;
        String teste;
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            System.out.println("A peça foi aprovada?");
            teste = scanner.nextLine();

            if (teste.equals("sim")){
                vSim++;
            } else {
                vNao++;
            }
        }

        System.out.println("Número de peças aprovadas: " + vSim);
        System.out.println("Número de peças reprovadas: " + vNao);
        
        scanner.close();
    }
}
