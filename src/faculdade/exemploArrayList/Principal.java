package faculdade.exemploArrayList;

import java.util.ArrayList;

	public class Principal {
		
		public static void main(String[] args) {
				ArrayList<String> disciplinas = new ArrayList<String>();
				disciplinas.add("Banco de dadosc 2");
				disciplinas.add("POO");
				disciplinas.add("Desenvolvimento de interfaces");
				disciplinas.add("Algebra");
				
				System.out.println(disciplinas);
				
				
				//PEDIR UM INDICE DA LISTA
				System.out.println(disciplinas.get(2));
				
				
				//MUDAR UM VALOR DA LISTA
				disciplinas.set(0,  "Banco de dados");
				//LEVOU BANCO DE DADOS PARA A POSIÇÃO 0
				System.out.println(disciplinas);
				
				
				//REMOVER UM ITEM DA LISTA
				disciplinas.remove(3);
				System.out.println(disciplinas);
				
				
				//TAMANHO DA LISTA
				System.out.println(disciplinas.size());
				
				
				//LACOS DE REPETICAO, PARA ACESSAR TODOS OS ELEMENTOS DE FORMA MAIS FACIL
				for(int i = 0; i < disciplinas.size(); i++) {
					System.out.println(disciplinas);
					//PARA I Q COMEÇA EM 0, PRINT, E ADD +1, PARA PASSAR P PROXIMO
				}
				
				
				//CONTAINS:
					//RETORNA V OU F (GERALEMTNE USADO DENTRO DO IF)
				disciplinas.contains("POO1");
				//RETORNA F, PQ N TEM POO1 NA LISTA
				
				
	}
}
