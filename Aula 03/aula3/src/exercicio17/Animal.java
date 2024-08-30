package exercicio17;
/** 17 -Implemente uma classe Animal com atributos especie, idade, e peso. Adicione métodos para alimentar e dormir.*/
public class Animal {
    private String especie;
    private Integer idade;
    private Double peso;

    public Animal(String especie, Integer idade, Double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                '}';
    }

    public void alimentar(){
        this.peso = this.peso + 0.1;
        System.out.println("Alimentando peso: " + this.peso);
    }

    public void dormir(){
        System.out.println("Dormindo");
    }
}
