package exercicio7;

public class testeAluno {
    public static void main(String[] args) {
        Integer[] notas = {85,90,78,92};
        Aluno aluno = new Aluno("Marcos da Silva", 12345, "Engenharia", notas);
        System.out.println(aluno);
        Double media = aluno.calcMedia();
        System.out.println(media);
    }
}
