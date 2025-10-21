package relacionamentos.composicao;
//COMPOSICAO

//PROCESSADOR: PARTE DO COMPUTADOR
public class Processador {
 private String marca;
 private double frequenciaGHz;

 public Processador(String marca, double frequenciaGHz) {
     this.marca = marca;
     this.frequenciaGHz = frequenciaGHz;
 }

 public String getMarca() { return marca; }
 public double getFrequenciaGHz() { return frequenciaGHz; }

 @Override
 public String toString() {
     return marca + " - " + frequenciaGHz + "GHz";
 }
}

