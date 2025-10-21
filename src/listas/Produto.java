package listas;

//CLASSE SIMPLES DE PRODUTO PARA USOS NA LISTA

public class Produto implements Comparable<Produto> {
 private String nome;
 private double preco;

 public Produto(String nome, double preco) {
     this.nome = nome;
     this.preco = preco;
 }

 public String getNome() { return nome; }
 public double getPreco() { return preco; }

 @Override
 public String toString() {
     return nome + " - " + preco;
 }

 // IMPLEMENTA COMPARAÇÃO PARA ORDENAÇÃO POR PREÇO
 @Override
 public int compareTo(Produto outro) {
     return Double.compare(this.preco, outro.preco);
 }
}
