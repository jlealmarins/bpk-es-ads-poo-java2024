package exercicio22;
/** 22 -Defina uma classe Empresa com atributos como nome, CNPJ, e numeroFuncionarios. Adicione métodos para contratar e demitir funcionários.

*/
 public class Empresa {
     private String nome;
     private String CNPJ;
     private Integer numeroFuncionarios;

    public Empresa(String nome, String CNPJ, Integer numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", numeroFuncionarios=" + numeroFuncionarios +
                '}';
    }

    public void contratar(){
        numeroFuncionarios++;
    }

    public void demitir(){
        numeroFuncionarios--;
    }
}
