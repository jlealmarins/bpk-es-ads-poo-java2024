import java.util.Scanner;
import java.util.Random;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numeroAleatorio = rand.nextInt(100) +1;
        int tentativas = 0;
        int palpite = 0;

        while (palpite != numeroAleatorio) {
            System.out.println("Digite o seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;

            if(palpite < numeroAleatorio) {
                System.out.println("Número a baixo");
            } else if(palpite > numeroAleatorio) {
                System.out.println("Numero mais alto");
            } else{
                System.out.println("Acertou em" + tentativas + " tentativas");
            }

        }
    }
}
