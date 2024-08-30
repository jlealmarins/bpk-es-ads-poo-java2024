package exercicio17;

public class testeAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Cachorro", 6,15.4);
        animal.toString();
        animal.alimentar();
        animal.dormir();
    }
}
