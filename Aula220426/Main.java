
import java.util.ArrayList;

class Biblioteca{
    private ArrayList <Livro> bibliotecas = new ArrayList<>();
    private Livro livros;
    public void adicionarLivro(Livro livros){
        bibliotecas.add(livros);
    }
    public void ListarLivros(){
        System.out.println("=======Livros=======");
        for(Livro l : bibliotecas){
            System.out.println(l.getLivro() + " - " + l.getQuantidadePaginas());
        }
    }
    public void CalcularQuantidadePaginas(){
        double total = 0;

        for(Livro l : bibliotecas){
            total += l.getQuantidadePaginas();
        }
        System.out.println("Total:" + total);
    }
}

class Aluno{
    private String nome;

    public Aluno(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
class Livro{
    private String nome;
    private int quantidadePaginas;

    public Livro(String nome, int quantidadePaginas){
        this.nome = nome;
        if(quantidadePaginas < 0){
            System.out.println("Quantidade de páginas inválida");
        }else{
        this.quantidadePaginas = quantidadePaginas;
        }
    }
    public String getLivro() {
        return nome;
    }
    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }    
}

public class Main{
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Nicolas");

        Biblioteca bibliotecas = new Biblioteca();
        Livro hp = new Livro("Harry Potter", 300);
        Livro as = new Livro("Assassin Screed", 400);

        bibliotecas.adicionarLivro(hp);
        bibliotecas.adicionarLivro(as);

        bibliotecas.ListarLivros();
        bibliotecas.CalcularQuantidadePaginas();
    
    }
}