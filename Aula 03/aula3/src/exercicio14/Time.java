package exercicio14;
/** 14 - Defina uma classe Time com atributos como nome, tecnico, e numeroDeJogadores. Adicione métodos para adicionar e remover jogadores.

*/
 public class Time {
     private String nome;
     private String tecnico;
     private Integer numeroDeJogadores;

    public Time(String nome, String tecnico, Integer numeroDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                ", tecnico='" + tecnico + '\'' +
                ", numeroDeJogadores=" + numeroDeJogadores +
                '}';
    }

    public void adcionarJogador(){
        this.numeroDeJogadores++;
    }

    public void removerJogador(){
        this.numeroDeJogadores--;
    }
}
