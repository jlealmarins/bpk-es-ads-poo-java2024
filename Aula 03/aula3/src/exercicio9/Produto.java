package exercicio9;
/** 9 - Defina uma classe Produto com atributos como nome, preco, e quantidadeEstoque. Adicione métodos para aumentar e diminuir o estoque.*/
public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidadeEstoque;

    public Produto(String nome, Double preco, Integer quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n Preço:" + preco + "\n Quantidade:" + quantidadeEstoque;
    }

    public void aumentaQuantidadeEstoque() {
        quantidadeEstoque++;
    }

    public void diminuirQuantidadeEstoque() {
        quantidadeEstoque--;
    }
}
