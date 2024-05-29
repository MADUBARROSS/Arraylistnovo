package arrayList;

import java.util.ArrayList;

public class Exercicio1 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int soma = 0;
		numeros.add(2);
		numeros.add(22);
		numeros.add(12);
		numeros.add(13);
		numeros.add(16);
		for(int numero : numeros) {
		soma = soma + numero;
		}
		System.out.println(soma);

	}

}
