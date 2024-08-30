package exercicio22;

public class testeEmrpesa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("PRATI", "1505952000132", 20);
        empresa.toString();
        empresa.contratar();
        empresa.contratar();
        empresa.demitir();
    }
}
