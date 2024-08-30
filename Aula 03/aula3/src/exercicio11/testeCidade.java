package exercicio11;

public class testeCidade {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("Paranaba", "Parana", 1500);

        System.out.println(cidade);
        cidade.aumentarPopulacao();
        cidade.diminuiPopulacao();
    }
}
