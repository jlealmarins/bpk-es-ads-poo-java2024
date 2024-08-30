package exercicio15;
/** 15 - Crie uma classe Jogo com atributos nome, genero, e preco. Adicione métodos para iniciar e pausar o jogo.*/
public class Jogo {
    private String nome;
    private String genero;
    private Double preco;

    public Jogo(String nome, String genero, Double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", preco=" + preco +
                '}';
    }

    public void iniciar(){
        System.out.println("Iniciando Jogo");
    }

    public void pause(){
        System.out.println("Pausando Jogo");
    }
}
