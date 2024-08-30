package exercicio20;
/** 20 - Crie uma classe Bicicleta com atributos marca, modelo, e tamanhoRoda. Adicione métodos para pedalar e frear.*/
public class Bicicleta {
    private String marca;
    private String modelo;
    private Double tamanhoRoda;

    public Bicicleta(String marca, String modelo, Double tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamanhoRoda=" + tamanhoRoda +
                '}';
    }

    public void pedalar(){
        System.out.println("Pedalando");
    }

    public void frear(){
        System.out.println("Freando");
    }
}
