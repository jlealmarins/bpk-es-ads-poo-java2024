package exercicio6;
/** Crie uma classe Computador com atributos como processador, memoriaRAM, e armazenamento. Adicione métodos para ligar e desligar o computador.*/
public class Computador {
    private String processador;
    private Integer memoriaRAM;
    private Double armazenamento;

    public Computador(String processador, Integer memoriaRAM, Double armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }
    @Override
    public String toString() {
        return "Processador: " + processador + ", Memoria RAM: " + memoriaRAM + ", Armazenamento: " + armazenamento;
    }

    private void ligar(){
        System.out.println("O computador ligou");
    }

    private void desligar(){
        System.out.println("O computador desligou");
    }
}

