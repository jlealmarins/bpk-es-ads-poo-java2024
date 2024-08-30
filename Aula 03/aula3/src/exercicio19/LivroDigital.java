package exercicio19;
/** 19 - Defina uma classe LivroDigital com atributos como titulo, autor, e tamanhoArquivo. Adicione métodos para abrir e fechar o livro.

*/
 public class LivroDigital {
     private String titulo;
     private String autor;
     private Double tamanhoArquivo;

    public LivroDigital(String titulo, String autor, Double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public String toString() {
        return "LivroDigital{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", tamanhoArquivo=" + tamanhoArquivo +
                '}';
    }

    public void abrir(){
        System.out.println("Abrir Livro");
    }

    public void fechar(){
        System.out.println("Fechar Livro");
    }
}
