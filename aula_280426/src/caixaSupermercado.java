import java.util.Scanner;

public class caixaSupermercado {
    public static void main(String[] args) {
        double valor = 0, somaTotal = 0;
        Scanner scanner = new Scanner(System.in);

        while (valor != -1) {
            System.out.println("Qual o valor do produto: ");
            valor = scanner.nextDouble();
            if (valor < 0 && valor != -1){
                valor = 0;
            }
            somaTotal+=valor;
        }

        somaTotal+=1;

        if (somaTotal > 200){
            somaTotal = somaTotal-(somaTotal*.10);
        } else if (somaTotal < 0){
            somaTotal = 0;
        }

        System.out.printf("Valor total a ser pago %.2f: ", somaTotal);
        
        scanner.close();
    }
}
