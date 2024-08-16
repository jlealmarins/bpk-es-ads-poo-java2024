import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        int numero;
        Scanner SC = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = SC.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O numero é par");
        }else{
            System.out.println("O numero é impar");
        }
    }
}
