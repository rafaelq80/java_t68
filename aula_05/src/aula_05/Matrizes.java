package aula_05;

import java.util.Scanner;

public class Matrizes {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		double[][] matrizDouble = new double[3][3];

		// Matriz Irregular 2 x 3
		int[][] matrizIrregular23 = {{1, 2, 3}, {4,5,6}};

		// Matriz Irregular 3 x 2
		int[][] matrizIrregular = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		// Controlar a linha
		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {

			// Controlar a coluna
			for (int indiceJ = 0; indiceJ < matriz.length; indiceJ++) {
				System.out.println("Matriz[" + indiceI + "][" + indiceJ + "] = " + matriz[indiceI][indiceJ]);
			}
		}

		System.out.println("\n");
		
		// Inserir dados na Matriz Double
		for (int indiceI = 0; indiceI < matrizDouble.length; indiceI++) {
			for (int indiceJ = 0; indiceJ < matrizDouble.length; indiceJ++) {
				System.out.println("Matriz[" + indiceI + "][" + indiceJ + "] = ");
				matrizDouble[indiceI][indiceJ] = leia.nextDouble();
			}
		}

		System.out.println("\n");
		
		// Exibir os dados na Matriz Double
		for (int indiceI = 0; indiceI < matrizDouble.length; indiceI++) {
			for (int indiceJ = 0; indiceJ < matrizDouble.length; indiceJ++) {
				System.out.println("Matriz[" + indiceI + "][" + indiceJ + "] = " + matrizDouble[indiceI][indiceJ]);
			}
		}

		// Exibir os dados da Matriz Irregular 2x3
		for (int indiceI = 0; indiceI < matrizIrregular23.length; indiceI++) {
			for (int indiceJ = 0; indiceJ < matrizIrregular23[indiceI].length; indiceJ++) {
				System.out.println("Matriz[" + indiceI + "][" + indiceJ + "] = " + matrizIrregular23[indiceI][indiceJ]);
			}
		}
		
		// Exibir os dados da Matriz Irregular 3x2
		for (int indiceI = 0; indiceI < matrizIrregular.length; indiceI++) {
			for (int indiceJ = 0; indiceJ < matrizIrregular[indiceI].length; indiceJ++) {
				System.out.println("Matriz[" + indiceI + "][" + indiceJ + "] = " + matrizIrregular[indiceI][indiceJ]);
			}
		}

		System.out.println("\n");

		// Exibir os dados da Matriz Irregular 3x2 cujo valor seja par com o For..Each
		for (int[] vetor : matrizIrregular) {
			for (int elemento : vetor) {
				if (elemento % 2 == 0)
					System.out.println(elemento);
			}
		}

	}

}
