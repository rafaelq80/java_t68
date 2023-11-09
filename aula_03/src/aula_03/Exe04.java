package aula_03;

import java.util.Scanner;

public class Exe04 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		String palavra1, palavra2, palavra3;

		System.out.println("Digite a primeira palavra: ");
		palavra1 = leia.nextLine();

		System.out.println("Digite a segunda palavra: ");
		palavra2 = leia.nextLine();

		System.out.println("Digite a terceira palavra: ");
		palavra3 = leia.nextLine();

		if (palavra1.equalsIgnoreCase("vertebrado")) {

			if (palavra2.equalsIgnoreCase("ave")) {
				
				if(palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("águia");
				}else {
					System.out.println("pomba");
				}
					
			} else {
				if(palavra3.equalsIgnoreCase("herbivoro")) {
					System.out.println("vaca");
				}else {
					System.out.println("homem");
				}
			}

		} else {

			if (palavra2.equalsIgnoreCase("inseto")) {
				
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
				}else {
					System.out.println("lagarta");
				}

			} else {
				
				if(palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("minhoca");
				}else {
					System.out.println("sanguessuga");
				}

			}
		}
	}

}
