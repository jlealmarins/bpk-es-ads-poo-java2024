import java.util.Scanner;

public class exercicio10 {

    public static boolean ePrimo (int n) {
        if (n <= 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero para testar se é primo: ");
        int num = sc.nextInt();

        if(ePrimo(num)){
            System.out.println("O número é primo");
        }else{
            System.out.println("O número não é primo");
        }
    }
}
