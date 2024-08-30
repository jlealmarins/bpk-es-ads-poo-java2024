package Exercicio2;
/** 2 - Defina uma classe Celular com atributos como marca, modelo, e capacidadeBateria. Adicione métodos para ligar e desligar o celular.*/
public class Celular {
    public String marca;
    public String modelo;
    public Integer capacidadeBateria;

    public Celular(String marca, String modelo, Integer capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

@Override
    public String toString() {
        return "O modelo é:" + modelo +
                "A marca é" + marca +
                "A capacidade de bateria é" + capacidadeBateria;
}

    public void liga(){
        System.out.println("Ligar celular");
        capacidadeBateria--;
    }

    public void desliga(){
        System.out.println("Desligar celular");
    }
}
