package faculdade.exerciciosArray;

import java.util.ArrayList;
//CRIE UM ARRAYLIST E ADCIONE ALGUNS ELEMENTOS A ELE
//EM SEGUIDA, IMPRIMA O TAMANHO DA LISTA E VERIFIQUE SE UM
//ELEMENTO ESPECIFICO ESTA PRESENTE NA LISTA

public class exercicio1 {
	public static void main(String[] args) {
		//CRIANDO ARRAY LIST
		ArrayList<String> animais = new ArrayList<String>();
		animais.add("Baleia");
		animais.add("Cachorro");
		animais.add("Gato");
		
		//IMPRIMINDO TAMANHO DA LISTA 
		System.out.println(animais.size());
		
		//VERIFICANDO SE UM ITEM ESPECIFICO ESTA NA LISTA
			//CONTAINS
		animais.contains("Galinha");
		//VAI RETORNAR F, PQ N TEM GALINHA NA LISTA
		
	}
}

