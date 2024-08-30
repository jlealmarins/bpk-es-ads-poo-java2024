package exercicio9;

public class testeProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Mouse",159.99,5);
        System.out.println(produto);
        produto.aumentaQuantidadeEstoque();
        produto.diminuirQuantidadeEstoque();
    }
}
