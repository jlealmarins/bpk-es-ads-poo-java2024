package exercicio19;

public class testeLivroDigital {
    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital("Morcegos", "Morcegao", 156.5);
        livro.toString();
        livro.abrir();
        livro.fechar();
    }
}
