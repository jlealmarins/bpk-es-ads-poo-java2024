package exercicio5;
/** 5 - Defina uma classe Cachorro com atributos nome, raca, e idade. Adicione métodos para latir e correr.*/
public class Cachorro {
    public String nome;
    public Integer idade;
    public String raca;

    public Cachorro(String nome, Integer idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    @Override
    public String toString() {
        return nome + " " + idade + " " + raca;
    }

    private void latir(){
        System.out.println("Latir");
    }

    private void correr(){
        System.out.println("Correr");
    }
}
