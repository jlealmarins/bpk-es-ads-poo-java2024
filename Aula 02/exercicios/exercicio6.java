import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor: ");
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
