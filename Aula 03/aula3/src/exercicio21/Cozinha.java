package exercicio21;
/** 21 - Implemente uma classe Cozinha com atributos tipo, quantidadePessoas, e cor. Adicione métodos para cozinhar e limpar.

 */
public class Cozinha {
    private String tipo;
    private Integer quantidadePessoas;
    private String cor;

    public Cozinha(String tipo, Integer quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Cozinha{" +
                "tipo='" + tipo + '\'' +
                ", quantidadePessoas=" + quantidadePessoas +
                ", cor='" + cor + '\'' +
                '}';
    }

    public void cozinhar(){
        System.out.println("Cozinhar");
    }

    public void limpar(){
        System.out.println("Limpar");
    }
}
