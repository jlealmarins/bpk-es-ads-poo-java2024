import java.util.Scanner;
import java.util.Arrays;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt();
        }
        Arrays.sort(numeros);

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

    }
}
