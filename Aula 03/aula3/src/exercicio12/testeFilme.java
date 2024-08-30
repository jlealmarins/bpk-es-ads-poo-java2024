package exercicio12;

public class testeFilme {
    public static void main(String[] args) {
        Filme filme = new Filme("Arco de espinhos","JK", 90.20);

        System.out.println(filme);
        filme.pararFilme();
        filme.iniciaFilme();
    }
}
