	/* CRIE UMA CLASSE ABSTRATA CHAMA FUNCIONARIO QUE TENHA
	 * OS SEGUINTES ATRIBUTOS: 
	 * NOME (STRING)
	 * CPF (STRING)
	 * SALARIOBASE (DOUBLE) - private
	 *   INCLUA GETTER E SETTERS P ESSES ATRIBUTOS
	 */

	/*OBS: *COMO FUNCIONARIO É UMA CLASSE ABSTRATA,
		   NAO SE PODE CRIAR UM OBJETO DIRETO DELA

		   *MAS PODE ARMAZENAR NELA OBJETOS DAS SUBCLASSES. POIS 
		   TODAS HERDAM DE Funcionarios
	--> ISSO É POLIMORFISMO: USAR UMA REFERENCIA DE CLASSE
	ABSTRATA PARA APONTAR P OBJETOS DE DIFERENTES TIPO CONCRETOS
	*/
package faculldade.Estudo1;

abstract class Funcionario {

		//PARAMETROS NORMAIS DA CLASSE
		public String nome;
		public String cpf;
		private double salarioBase;

		//CRIANDO O CONSTRUTOR DA SUPERCLASSE
		/*(REPETIR EM TODAS AS OUTRAS SUBCLASSES)*/
		public Funcionario(String nome, String cpf, double salarioBase) {
		this.nome = nome;
			this.cpf = cpf;
			this.salarioBase = salarioBase;
		}


	//IMPLEMNETANDO METODO GETTER
	public String getnome() {
		return nome;
	}

	public String getcpf() {
		return cpf;
	}

	public double getsalarioBase() {
		return salarioBase;
	}

	//IMPLEMENTANDO METODO SETTER
	public void setnome(String nome) {
		this.nome = "Ana julia";
	}

	public void setcpf(String cpf) {
		this.cpf = "05981201142";
	}

	public void setsalarioBase(double salarioBase) {
		this.salarioBase = 1200;
	}


	//METODO ABSTRATO QUE SERA IMPLEMENTADO NAS SUBCLASSES
	public abstract double calcularSalario();

	}

