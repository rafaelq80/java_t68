package aula_05;

import java.util.Scanner;

public class Exe04 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float[][] notas = new float[10][4];
		float[] medias = new float[10];
		float soma = 0.0f;
		
		for(int indiceI = 0; indiceI < notas.length; indiceI ++) {
			for(int indiceJ = 0; indiceJ < notas[indiceI].length; indiceJ ++) {
				System.out.println("Digite a " + (indiceJ + 1) + "º nota do participante " + (indiceI + 1) + ": ");
				notas[indiceI][indiceJ] = leia.nextFloat();
			}
		}
		
		for(int indiceI = 0; indiceI < notas.length; indiceI ++) {
			for(int indiceJ = 0; indiceJ < notas[indiceI].length; indiceJ ++) {
				soma += notas[indiceI][indiceJ];
			}
			
			medias[indiceI] = soma / notas[indiceI].length;
			soma = 0.0f;
		}
		
		for(int indice = 0; indice < medias.length; indice ++)
			System.out.println("\nMédia do participante " + (indice + 1) +  ": " + medias[indice]);

	}

}
