/* FncionarioPj - RECEBE O SALARIO SEM ADCIONAIS */
package faculldade.Estudo1;

public class FuncionarioPj extends Funcionario{

	//CONSTRUTOR DA SUPERCLASSE SENDO CHAMADO E IMPLMENTADO NA SUBCLASSE
	 public FuncionarioPj(String nome, String cpf, double salarioBase) {
		 super(nome, cpf, salarioBase);
	}
	 
	 //IMPLEMETANDO O METODO CalcularSalario()
	 @Override
	 public double calcularSalario() {
		 	return getsalarioBase(); //SEM ADCIONAIS 
}

}

