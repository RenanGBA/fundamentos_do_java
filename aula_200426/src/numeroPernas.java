import java.util.HashMap;
import java.util.Scanner;

public class numeroPernas {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int pernas;
        

        map.put(2, "bipede");
        map.put(4, "quadrupede");
        map.put(6, "inseto");
        map.put(8, "aracnideo");
        map.put(100, "centopeia");
        
        System.out.println("Quantas pernas tem o animal?");
        pernas = scanner.nextInt();

        if (map.containsKey(pernas)){
            System.out.println(map.get(pernas));
        } else {
            System.out.println("Animal desconhecido");
        }
        
        scanner.close();
    }
}
