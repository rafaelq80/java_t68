package aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String[] pessoas = {"Luiza", "Aline", "Vinicius", "Antônio", "Vitor", "Samara"};
		
		float[] notas = new float[5];
		
		String nome = "Kendal";
		
		for(int indice = 0; indice < 6; indice ++)
			System.out.println("Posição " + (indice + 1) +  " = " + pessoas[indice]);

		System.out.println("\n");
		
		for(int indice = 0; indice < 5; indice ++) {
			System.out.println("Digite uma valor para a posição [" + indice +  "] = ");
			notas[indice] = leia.nextFloat();
		}
		
		for(int indice = 0; indice < notas.length; indice ++) 
			System.out.println("Posição " + indice +  " = " + notas[indice]);
		
		Arrays.sort(pessoas);
		
		System.out.println("\n");
		
		for(int indice = 0; indice < pessoas.length; indice ++)
			System.out.println("Posição [" + indice +  "] = " + pessoas[indice]);
	
		System.out.println("\n");
		
		for(int indice = pessoas.length - 1 ; indice >= 0 ; indice --)
			System.out.println("Posição [" + indice +  "] = " + pessoas[indice]);
		
		System.out.println("\n");
		
		// Busca Binária
		System.out.println("A posição do elemento " + nome + " é: " + Arrays.binarySearch(pessoas, nome));
				
		// Localizar o indice de um elemento
		for(int indice = 0; indice < pessoas.length; indice ++) {
			if (pessoas[indice].equalsIgnoreCase("Aline")) 
				System.out.println("\nA Aline está na posição : " + indice);
		}
		
		// Exibir os nomes com as letras maiúsculas utilizando o for...each
		for(String pessoa : pessoas) {
			System.out.println(pessoa.toUpperCase());
		}
		
	}
	
}
