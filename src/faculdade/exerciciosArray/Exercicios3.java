package faculdade.exerciciosArray;

import java.util.ArrayList;

//CRIE UMA FUNCAO QUE RECEBA DOIS ARRAYLISTS E
//RETORNE UM NOVO ARRAYLIST QUE JUNTE TODOS OS 
//ELEMENTOS DAS DUAS LISTAS
public class Exercicios3 {
	
		//FUNCAO QUE JUNTA DUAS LISTAS E RETORNA UMA NOVA
	    public static ArrayList<String> juntarListas(ArrayList<String> lista1, ArrayList<String> lista2) {
	        ArrayList<String> novaLista = new ArrayList<String>();
	        
	        //ADCIONA TODOS OS ELEMENTOS DA LISTA1
	        novaLista.addAll(lista1);
	        
	        //ADICIONA TODOS OS ELEMNTOS DA LISTA2
	        novaLista.addAll(lista2);
	        
	        return novaLista;
	    }

		public static void main(String[] args) {
			ArrayList<String> lista1 = new ArrayList<String>();
			lista1.add("Gato");
			lista1.add("Vaca");
			
			ArrayList<String> lista2 = new ArrayList<String>();
			lista2.add("Miau");
			lista2.add("Muu");
			
			//CHAMANDO A FUNCAO
			ArrayList<String> listaFinal = juntarListas(lista1, lista2);
			
			System.out.println("Lista final:" + listaFinal);
		}


	}

