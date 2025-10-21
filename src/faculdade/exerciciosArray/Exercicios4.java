package faculdade.exerciciosArray;
//CRIE UMA FUNCAO QUE RECEBA UM ARRAYLIST DE NUMEROS
//INTEIROS E RETORNE O INDICE DO MENOR NUMERO DA LISTA

import java.util.ArrayList;

public class Exercicios4 {



		public static int indiceDoMenor(ArrayList<Integer> lista) {
			int indiceMenor = 0;
			
			for (int i = 1; i < lista.size(); i++) { //RETORNA O TAMANHO DA LISTA, E O LOOP VAI ATE O U
				if (lista.get(i) < lista.get(indiceMenor)) {
					//LISTA.GET(I)- PEGA O NUMERO DA POSICAO ATUAL DO LOOP
					//SE O NUMERO ATUAL FOR MENOR QUE O NUMERO GUARDADO COMO MENOR ATE AGORA
					indiceMenor = i;
				}
			}
			return indiceMenor;
		}
		public static void main(String[] args) {
			ArrayList<Integer> numeros = new ArrayList<Integer>();
		      numeros.add(50);
		      numeros.add(10);
		      numeros.add(30);
		      numeros.add(5);
		      numeros.add(40);
		      
		      //CHAMANDO A FUNCAO
		      int indice = indiceDoMenor(numeros);
		      
		      System.out.println("O menor número está no índice: " + indice);
		      System.out.println("O menor número é: " + numeros.get(indice));
		}
	} 

