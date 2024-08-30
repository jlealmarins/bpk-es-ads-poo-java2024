package Exercicio3;
/** 3 - Implemente uma classe Pessoa com atributos nome, idade, e altura. Adicione um método que imprime uma apresentação da pessoa.*/
public class Pessoa {
    private String nome;
    private Integer idade;
    private Double altura;

    public Pessoa(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "O nome da Pessoa é" + nome + "\nIdade: " + idade + "\nAltura: " + altura;
    }

    public String apresentação(){
        return "Olá meu nome é " + nome + " tenho " + idade + " e tenho " + altura + " de altura.";
    }

}
