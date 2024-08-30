package exercicio4;

/** 4 - Crie uma classe ContaBancaria com atributos como numeroConta e saldo. Adicione métodos para depositar e sacar dinheiro.  */

public class ContaBancaria {
    private Integer numeroConta;
    private Double saldo;


    public ContaBancaria(Integer numeroConta, Double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

@Override
    public String toString() {
        return "Os dados da conta são:" +
                "\n\tNumero da Conta:" + numeroConta + "\n\tSaldo:" + saldo;
}


    public void depositar(double valor) {
        this.saldo += valor;
        this.numeroConta++;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
        System.out.println("Saque de "+ valor + " realizado com sucesso!");
    }
}
