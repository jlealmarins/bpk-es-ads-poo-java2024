package exercicio10;
/** 10 - Crie uma classe Veiculo com atributos tipo, placa, e cor. Adicione métodos para abastecer e lavar o veículo.*/
public class Veiculo {
    private String tipo;
    private String placa;
    private String cor;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Placa: " + placa + ", Cor: " + cor;
    }

    public void abastecer(){
        System.out.println("Abastecer");
    }

    public void lavar(){
        System.out.println("Lavar");
    }
}
