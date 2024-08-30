package exercicio21;

public class testeCozinha {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Industrial", 15, "Cinza");
        cozinha.toString();
        cozinha.cozinhar();
        cozinha.limpar();
    }
}
