package aula_03;

import java.util.Scanner;

public class PlanoSaude {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		System.out.print("Digite o seu nome: ");
		nome = leia.nextLine();
		
		System.out.print("\nDigite a sua idade: ");
		idade = leia.nextInt();

		if(idade > 0 && idade <= 10) {
			System.out.printf("\n%s o seu Plano de Saúde custará R$ 100,00 por mês.", nome);
		}else if(idade >= 11 && idade <= 29) {
			System.out.printf("\n%s o seu Plano de Saúde custará R$ 200,00 por mês.", nome);
		}else if(idade >= 30 && idade <= 45) {
			System.out.printf("\n%s o seu Plano de Saúde custará R$ 300,00 por mês.", nome);
		}else if(idade >= 46 && idade <= 59) {
			System.out.printf("\n%s o seu Plano de Saúde custará R$ 500,00 por mês.", nome);
		}else if(idade >= 60 && idade <= 65) {
			System.out.printf("\n%s o seu Plano de Saúde custará R$ 600,00 por mês.", nome);
		}else {
			System.out.printf("\n%s o seu Plano de Saúde custará R$ 1000,00 por mês.", nome);
		}
	}

}
