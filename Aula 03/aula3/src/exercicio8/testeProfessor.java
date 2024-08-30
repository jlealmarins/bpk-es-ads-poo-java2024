package exercicio8;

public class testeProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor("Claudia", "Matematica", 1500.5);
        System.out.println(professor);
        professor.corrigirProva();
        professor.darAula();
    }
}
