package exercicio8;
/**8 - Crie uma classe Professor com atributos nome, disciplina, e salario. Adicione métodos para dar aula e corrigir provas. */
public class Professor {
    private String nome;
    private String disciplina;
    private Double salario;
    public Professor(String nome, String disciplina, Double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "Disciplina: " + disciplina + "Salario: " + salario;
    }

    public void darAula(){
        System.out.println("A aula começou");
    }

    public void corrigirProva(){
        System.out.println("Corrige a prova");
    }
}
