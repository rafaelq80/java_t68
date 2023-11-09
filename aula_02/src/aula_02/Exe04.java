package aula_02;

import java.util.Scanner;

public class Exe04 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float numero1, numero2, numero3, numero4, resultado;
		
		System.out.println("Digite o 1º número: ");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o 2º número: ");
		numero2 = leia.nextFloat();
		
		System.out.println("Digite o 3º número: ");
		numero3 = leia.nextFloat();
		
		System.out.println("Digite o 4º número: ");
		numero4 = leia.nextFloat();
		
		resultado = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.println("A diferença é: " + resultado);

	}

}
