/* FuncionarioCLT - TEM UM ADCIONAL 
	 * DE 10% SOBRE O SALARIO BASE */
package faculldade.Estudo1;

public class FuncionarioCLT extends Funcionario {
		
		//CONSTRUTOR DA SUBLCASSE CHAMANDO O CONSTRUTOR DA CLASSE MAE
		public FuncionarioCLT(String nome, String cpf, double salarioBase) {
	        super(nome, cpf, salarioBase);
		}
		
		//IMPLEMENTACAO OBRIGATORIA PARA CHAMAR O METODO ABSTRATO
		@Override
		public double calcularSalario() {
			return getsalarioBase() * 1.10; //10% DE ADCIONAL
		}
	}

