package exercicio1;

/** 1 - Crie uma classe chamada Livro com atributos como titulo, autor, e numeroDePaginas. Adicione métodos para abrir o livro e ler uma página.*/

public class Livro{
    public String titulo;
    public String autor;
    public String numeroDePaginas;

    public Livro(String titulo, String autor, String numeroDePaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString(){
        return titulo + " - " + autor + " - " + numeroDePaginas;
    }

    public void abrirLivro (){
        System.out.println("\n*** ABRIR LIVRO ***");
    }

    public void fecharLivro (){
        System.out.println("\n*** FECHA LIVRO ***");
    }
}



