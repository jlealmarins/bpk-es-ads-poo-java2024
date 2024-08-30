package exercicio12;
/** 12 - Implemente uma classe Filme com atributos titulo, diretor, e duracao. Adicione métodos para iniciar e parar o filme.

 */
public class Filme {
    private String titulo;
    private String diretor;
    private Double duracao;

    public Filme(String titulo, String diretor, Double duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", diretor='" + diretor + '\'' +
                ", duracao=" + duracao +
                '}';
    }

    public void iniciaFilme(){
        System.out.println("Iniciando Filme");
    }

    public void pararFilme(){
        System.out.println("Parando Filme");
    }
}
