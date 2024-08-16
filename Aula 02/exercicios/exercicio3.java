import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;

        System.out.println("A soma dos dois é " + soma);
        System.out.println("A subtração dos dois é " + subtracao);
        System.out.println("A multiplicação dos dois é "+multiplicacao);
        System.out.println("A divisao dos dois é " + divisao);
    }
}
