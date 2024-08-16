import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        int opcao,n1,n2;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite o número referente a opcao: \n1. Soma\n2. Subtração\n3. Divisão\n4. Multiplicação\n0. Sair");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o primeiro número");
                    n1 = scanner.nextInt();
                    System.out.println("Digite o primeiro número");
                    n2 = scanner.nextInt();
                    System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Digite o primeiro número");
                    n1 = scanner.nextInt();
                    System.out.println("Digite o primeiro número");
                    n2 = scanner.nextInt();
                    System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Digite o primeiro número");
                    n1 = scanner.nextInt();
                    System.out.println("Digite o primeiro número");
                    n2 = scanner.nextInt();
                    System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("Digite o primeiro número");
                    n1 = scanner.nextInt();
                    System.out.println("Digite o primeiro número");
                    n2 = scanner.nextInt();
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                    break;
            }
        }while (opcao != 0);
    }
}
