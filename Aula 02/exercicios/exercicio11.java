import java.util.Scanner;

public class exercicio11 {
    public static boolean ePalindromo(String palavra){
        int n = palavra.length();

        for (int i = 0; i < n / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        if (ePalindromo(palavra)) {
            System.out.println("Palindromo");
        }else{
            System.out.println("Nao palindromo");
        }
    }
}
