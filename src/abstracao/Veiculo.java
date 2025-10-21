package abstracao;

//EXEMPLO DE CLASSE ABSTRATA (NÃO PODE SER INSTANCIADA DIRETAMENTE)

public abstract class Veiculo {
 // ATRIBUTOS PROTEGIDOS PARA PERMITIR ACESSO POR SUBCLASSES
 protected String marca;
 protected String cor;

 public Veiculo(String marca, String cor) {
     this.marca = marca;
     this.cor = cor;
 }

 // METODO ABSTRATO: OBRIGA SUBCLASSES A IMPLEMENTAR
 public abstract void mover();

 // METODO CONCRETO
 public void mostrarInfo() {
     System.out.println("MARCA: " + marca + " | COR: " + cor);
 }
}

