/*FuncionarioComissionado - RECEBE UM SALARIO BASE MAIS
 * UMA COMISSAO (ATRIBUTO ADCIONAL DO TIPO DOUBLE)
 */
package faculldade.Estudo1;

public class FuncionarioComissionado extends Funcionario{
	//CRIANDO ATRIBUTO ADCIONAL 
	private double comissao; 
	
	//CHAMANDO O CONSTRUTOR
	 public FuncionarioComissionado(String nome, String cpf, double salarioBase, double comissao) {
	      //CHAMA O CONSTRUTOR DA CLASSE MAE
		 super(nome, cpf, salarioBase);
		 //INICIALIZA O ATRIBUTO ESPECIFICO DA SUBCLASSE
	        this.comissao = comissao;
//SE REFERE AO ATRIBUTO  || PARAMETRO RECEBIDO NO CONSTRUTOR
//"A COMISSAO DESTE FUNCIONARIO (THIS.COMISSAO) VAI SER IGUAL AO VALOR RECEBIDO NO CONTRUTOR (COMISSAO)"
	}

	 //RETORNAR O VALOR DA COMISSAO (ATRIBUTO ADCIONAL)
	 public double getcomissao() {
		 	return comissao;
	 }
	 //DEFININDO O ATRIBUTO ADCIONAL COMISSAO
	 public void setComissao(double comissao) {
		 this.comissao = comissao;
	 }
	 
	 //IMPLEMENTANDO O METODO CalcularSalario()
	 @Override
	 public double calcularSalario() {
		 return getsalarioBase() + comissao; //SALARIO BASE + COMISSAO
	 }

}