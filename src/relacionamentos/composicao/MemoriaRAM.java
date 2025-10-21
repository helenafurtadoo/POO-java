package relacionamentos.composicao;
//COMPOSICAO
//MEMORIARAM: PARTE ESSENCIAL DO COMPUTADOR
public class MemoriaRAM {
 private int capacidadeGB;
 private String tipo;

 public MemoriaRAM(int capacidadeGB, String tipo) {
     this.capacidadeGB = capacidadeGB;
     this.tipo = tipo;
 }

 public int getCapacidadeGB() { return capacidadeGB; }
 public String getTipo() { return tipo; }

 @Override
 public String toString() {
     return capacidadeGB + "GB " + tipo;
 }
}
