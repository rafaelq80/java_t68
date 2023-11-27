package aula_11;

import java.util.Scanner;

public class Calculadora {

	public static int calcular(OperacaoMatematica om, int num1, int num2) {
        return om.executar(num1, num2);
    }
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2 = 0;
		
		System.out.println("****************************************************");
		System.out.println("              Calculadora com Lambda                ");
		System.out.println("****************************************************");
		System.out.println("Digite o primeiro numero: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = leia.nextInt();
		
		System.out.println("Soma = " + calcular((a,b) -> a + b, n1, n2));
        System.out.println("Subtração = " + calcular((a,b) -> a - b, n1, n2));
        System.out.println("Multiplicação = " + calcular((a,b) -> a * b, n1, n2));
        System.out.println("Divisão = " + calcular((a,b) -> a / b, n1, n2));
		
        leia.close();

	}

}
