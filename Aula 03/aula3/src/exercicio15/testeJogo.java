package exercicio15;

public class testeJogo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("LOL", "MOBA", 1.1);
        System.out.println(jogo);
        jogo.iniciar();
        jogo.pause();
    }
}
