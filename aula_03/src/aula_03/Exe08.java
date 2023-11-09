package aula_03;

import java.util.Scanner;

public class Exe08 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		float valor, saldo = 1000.00f;
		int operacao;

		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		operacao = leia.nextInt();

		switch (operacao) {
			case 1:
				System.out.println("Saldo da conta é: " + saldo);
				break;
			case 2:
				System.out.println("Informe o valor do Saque: ");
				valor = leia.nextFloat();
				
				if(saldo >= valor)
					System.out.println("O novo Saldo da conta é " + (saldo - valor));
				else
					System.out.println("Saldo Insuficiente!");
				break;
			case 3:
				System.out.println("Informe o valor do Depósito: ");
				valor = leia.nextFloat();
				
				System.out.println("O novo Saldo da conta é " + (saldo + valor));
				break;
			default:
		}
	}

}
