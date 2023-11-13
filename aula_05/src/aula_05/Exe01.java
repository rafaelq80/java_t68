package aula_05;

import java.util.Scanner;

public class Exe01 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] vetor = {2, 5, 7, 6, 3, 1, 10, 4, 9, 8};
		int numero, resultado = -1;
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
		for(int indice = 0; indice < vetor.length; indice ++) {
			if(vetor[indice] == numero)
				resultado = indice;
		}
		
		if(resultado == -1)
			System.out.printf("\n O numero %d não foi localizado.", numero);
		else
			System.out.printf("\n O numero %d foi localizado na posição %d.", numero, resultado);
	
	}

}
