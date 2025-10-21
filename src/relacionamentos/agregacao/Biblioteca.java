package relacionamentos.agregacao;

//BIBLIOTECA: POSSUI LIVROS (AGREGACAO), LIVROS PODEM EXISTIR FORA DA BIBLIOTECA
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
 private String nome;
 private List<Livro> livros;

 public Biblioteca(String nome) {
     this.nome = nome;
     this.livros = new ArrayList<>();
 }

 public void adicionarLivro(Livro livro) {
     livros.add(livro);
 }

 public void listarLivros() {
     System.out.println("BIBLIOTECA: " + nome);
     for (Livro l : livros) {
         System.out.println(l);
     }
 }
}

