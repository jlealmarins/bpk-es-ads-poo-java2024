package Exercicio2;

public class testeCelular {
    public static void main(String[] args) {
        Celular nokia = new Celular("Nokia","A5",3500);
        System.out.println(nokia);
        nokia.desliga();
        nokia.liga();
        nokia.liga();
        nokia.liga();
        nokia.liga();
        nokia.liga();
        nokia.liga();
        System.out.println(nokia);
    }
}
