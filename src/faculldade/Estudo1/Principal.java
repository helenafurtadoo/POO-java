package faculldade.Estudo1;

import java.util.ArrayList;
import java.util.List;

//ONDE TUDO É COLOCADO PARA FUNCIONAR
//USADO PARA CRIAR OBJETOS, USAR O POLIMORFISMO E MOSTRAR RESULTADOS
public class Principal {
	public static void main(String[] args) { //TUDO O QUE ESTIVER AQUI DENTRO, SER EXECUTADO EM ORDEM
		
		//CRIA LISTA QUE ARMAZENARÁ OS OBJETOS DO TIPO Funcionario
		List<Funcionario> funcionarios = new ArrayList<>();
	
		//CRIA UM NOVO OBJETO DAS SUBCLASSES E ADD NA LISTA
        funcionarios.add(new FuncionarioCLT("Maria", "111.222.333-44", 3000.0));
        funcionarios.add(new FuncionarioPj("João", "555.666.777-88", 4000.0));
        funcionarios.add(new FuncionarioComissionado("Joana", "05981201142", 200.0, 100.0));
        
	
        for (Funcionario f : funcionarios) {
        	System.out.println("Nome:" + f.getnome() + " | Salário: R$" + f.calcularSalario());
        }
	}
	
}
