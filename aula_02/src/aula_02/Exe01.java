package aula_02;

import java.util.Scanner;

public class Exe01 {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite a 1ª Nota: ");
		nota1 = leia.nextFloat();

		System.out.println("Digite a 2ª Nota: ");
		nota2 = leia.nextFloat();

		System.out.println("Digite a 3ª Nota: ");
		nota3 = leia.nextFloat();

		System.out.println("Digite a 4ª Nota: ");
		nota4 = leia.nextFloat();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("A Média do participante é: " + media);
		
	}

}