package exercicio14;

public class testeTime {
    public static void main(String[] args) {
        Time time = new Time("Flamengo", "Luiz", 15);
        System.out.println(time);

        time.adcionarJogador();
        time.removerJogador();
    }
}
