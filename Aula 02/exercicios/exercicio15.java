import java.util.Scanner;

public class exercicio15 {
    public static int fatorialIterativo(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static int fatorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else{
            return n * fatorialRecursivo(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(fatorialIterativo(n));
        System.out.println(fatorialRecursivo(n));

        System.out.println("Fatorial recursivo" + fatorialRecursivo(n));
        System.out.println("Fatorial Iterativo" + fatorialIterativo(n));
    }
}
