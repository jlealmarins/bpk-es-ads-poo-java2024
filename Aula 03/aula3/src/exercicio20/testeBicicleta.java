package exercicio20;

public class testeBicicleta {
    public static void main(String[] args) {
        Bicicleta bike = new Bicicleta("CALOI", "CALOI", 15.3);
        bike.toString();
        bike.pedalar();
        bike.pedalar();
        bike.frear();
    }
}
