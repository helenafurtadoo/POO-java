package faculdade.exerciciosArray;
import java.util.ArrayList;
import java.util.HashSet;
//CRIE UMA FUNCAO QUE RECEBA UM ARRAYLIST E RETORNE O 
//NUMERO DE ELEMENTOS UNICOS NA LISTA

public class Exercicios2 {

		public static void main(String[] args) {
			ArrayList<Integer> numeros = new ArrayList<Integer>();
			numeros.add(1);
	        numeros.add(2);
	        numeros.add(2);
	        numeros.add(3);
	        numeros.add(4);
	        numeros.add(4);
		
	        //USANDO HASHSET PARA GUARDAR SO OS UNICOS
	        HashSet<Integer> unicos = new HashSet<Integer>(numeros);
	        
			//IMPIRMINDO O NUMEROS DE ELEMENTOS UNICOS
	        System.out.println("Quantidade de elementos unicos:" + unicos.size());
			
		}
	}


