package exercicio11;
/** 11 - Crie uma classe Cidade com atributos nome, populacao, e estado. Adicione métodos para aumentar e diminuir a população.*/
public class Cidade {
    private String nome;
    private String estado;
    private Integer populacao;

    public Cidade(String nome, String estado, Integer populacao) {
        this.nome = nome;
        this.estado = estado;
        this.populacao = populacao;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", estado='" + estado + '\'' +
                ", populacao=" + populacao +
                '}';
    }

    public void aumentarPopulacao() {
        this.populacao += 1;
    }

    public void diminuiPopulacao(){
        this.populacao -= 1;
    }
}
