import java.util.Scanner;

public class exercicio16 {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = sc.nextInt();
        if (opcao == 1) {
            double celsius = sc.nextDouble();
            System.out.println(celsiusToFahrenheit(celsius));
        }else if (opcao == 2) {
            double fahrenheit = sc.nextDouble();
            System.out.println(fahrenheitToCelsius(fahrenheit));
        } else {
            System.out.println("Opção inválida");
        }
    }
}
