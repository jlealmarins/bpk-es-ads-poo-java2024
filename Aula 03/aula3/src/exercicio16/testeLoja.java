package exercicio16;

public class testeLoja {
    public static void main(String[] args) {
        Loja loja = new Loja("VERSACE", "Rua britania, 20", "459999675");
        loja.toString();
        loja.fecharLoja();
        loja.abrirLoja();
    }
}
