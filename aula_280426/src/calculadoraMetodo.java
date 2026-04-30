public class calculadoraMetodo {
    public static void main(String[] args) {
        somarValores(10,15);
        
        somarValores(50, 20);
    }

    public static void somarValores(int valUm, int valDois){
        int soma = valUm + valDois;

        System.out.println("O resultado da soma de " + valUm + " e " + valDois + " é: " + soma);
    }
}
