package relacionamentos.juntos;

//UNIVERSIDADE: COMPÕE DEPARTAMENTO (COMPOSIÇÃO)
public class Universidade {
 private String nome;
 private Departamento departamento;

 public Universidade(String nome, String nomeDepartamento) {
     this.nome = nome;
     // CRIA O DEPARTAMENTO DENTRO DA UNIVERSIDADE -> COMPOSIÇÃO
     this.departamento = new Departamento(nomeDepartamento);
 }

 public Departamento getDepartamento() {
     return departamento;
 }

 public void info() {
     System.out.println("UNIVERSIDADE: " + nome);
     departamento.listarProfessores();
 }
}
