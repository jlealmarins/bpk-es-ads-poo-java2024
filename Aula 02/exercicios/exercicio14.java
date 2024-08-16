import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma string: ");
        String str = sc.nextLine();

        int contador = 0;
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (vogais.indexOf(c) != -1) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
