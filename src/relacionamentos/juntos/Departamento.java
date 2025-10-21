package relacionamentos.juntos;

//DEPARTAMENTO: POSSUI PROFESSORES (AGREGACAO)
import java.util.ArrayList;
import java.util.List;

public class Departamento {
 private String nome;
 private List<Professor> professores;

 public Departamento(String nome) {
     this.nome = nome;
     this.professores = new ArrayList<>();
 }

 public void adicionarProfessor(Professor p) {
     professores.add(p);
 }

 public void listarProfessores() {
     System.out.println("DEPARTAMENTO: " + nome);
     for (Professor p : professores) {
         System.out.println(p);
     }
 }
}

