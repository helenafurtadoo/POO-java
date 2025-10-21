package relacionamentos.composicao;

//COMPOSICAO
//COMPUTADOR: EXEMPLO DE COMPOSIÇÃO - CRIA SEUS COMPONENTES NO CONSTRUTOR
public class Computador {
 private Processador processador;
 private MemoriaRAM memoria;
 private String modelo;

 public Computador(String modelo, String marcaProcessador, double freqGHz, int ramGB, String tipoRam) {
     this.modelo = modelo;
     // INSTANCIA OS COMPONENTES DENTRO DO CONSTRUTOR -> COMPOSIÇÃO
     this.processador = new Processador(marcaProcessador, freqGHz);
     this.memoria = new MemoriaRAM(ramGB, tipoRam);
 }

 public void exibirDetalhes() {
     System.out.println("MODELO: " + modelo);
     System.out.println("PROCESSADOR: " + processador);
     System.out.println("MEMORIA: " + memoria);
 }
}

