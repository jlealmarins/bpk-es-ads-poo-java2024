package exercicio7;
/** 7 - Implemente uma classe Aluno com atributos nome, matricula, e curso. Adicione um método para calcular a média de notas.*/
public class Aluno {
    private String nome;
    private Integer matricula;
    private String curso;
    private Integer notas[];

    public Aluno(String nome, Integer matricula, String curso, Integer[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Matricula: " + matricula + " Curso: " + curso;
    }

    public Double calcMedia(){
        Double media = 0.0;
        for(int i = 0; i < notas.length; i++){
            media += notas[i];
        }
        return media / notas.length;
    }
}
