package exercicio10;

public class testeVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Moto", "ABC2153", "Branco");

        System.out.println(veiculo);
        veiculo.abastecer();
        veiculo.lavar();
    }
}
