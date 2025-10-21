package abstracao;

//CARRO HERDA VEICULO E IMPLEMENTA LAVAVEL
public class Carro extends Veiculo implements Lavavel {

 private int numPortas;

 public Carro(String marca, String cor, int numPortas) {
     super(marca, cor);
     this.numPortas = numPortas;
 }

 @Override
 public void mover() {
     System.out.println("CARRO ANDANDO: " + marca);
 }

 @Override
 public void lavar() {
     System.out.println("LAVANDO O CARRO: " + marca);
 }

 public int getNumPortas() {
     return numPortas;
 }
}
