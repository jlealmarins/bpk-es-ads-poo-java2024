package exercicio4;

public class testeContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1,100.1);
        System.out.println(conta);
        conta.sacar(100);
        System.out.println(conta);
        conta.depositar(100);
        System.out.println(conta);
    }
}
