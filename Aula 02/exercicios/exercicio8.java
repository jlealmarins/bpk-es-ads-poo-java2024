import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();

        System.out.println("O nome é " + nome + " com " + idade + " anos");
    }
}
