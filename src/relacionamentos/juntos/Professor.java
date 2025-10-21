package relacionamentos.juntos;

//PROFESSOR: ENTIDADE QUE PODE SER AGREGADA AO DEPARTAMENTO
public class Professor {
 private String nome;
 private String area;

 public Professor(String nome, String area) {
     this.nome = nome;
     this.area = area;
 }

 public String getNome() { return nome; }
 public String getArea() { return area; }

 @Override
 public String toString() {
     return nome + " - " + area;
 }
}
