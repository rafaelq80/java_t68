package aula_02;

import java.util.Scanner;

public class Operadores {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero1 = 10, numero2 = 20;
		String valor1 = "2", valor2 = "3";

		String nome = "Aline";
		int idade = 18;

		float media = 2.456789f;

		int tamanho;

		System.out.println("A soma das variáveis numero1 e número2 é igual a: " + (numero1 + numero2));

		System.out.println("A soma das variáveis valor1 e valor2 é igual a: " + (valor1 + valor2));

		System.out.println("Meu nome é " + nome + " e eu tenho " + idade + " anos.");

		System.out.printf("A Média final da %s é %.2f", nome, media);

		System.out.println("\nDigite o tamanho: ");
		tamanho = leia.nextInt();

		System.out.println("O valor digitado foi: " + tamanho);

	}

}
