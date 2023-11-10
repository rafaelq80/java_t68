package aula_04;

import java.util.Scanner;

public class Exe04 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int idade, genero, dev, back = 0, front = 0, mobile = 0, full = 0, total = 0, somaIdade = 0;
		float media = 0.0f;
		String continua = "S";

		while(continua.equalsIgnoreCase("S")) {
			
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			do {
				System.out.println("Digite o Genero (1-MC / 2-HC / 3-NB / 4-MT / 5-HT / 6-Outros: ");
				genero = leia.nextInt();
				
				if (genero < 1 || genero > 6)
					System.out.println("Digite um valor entre 1 e 6");
				
			}while(genero < 1 || genero > 6);
			
			do {
				System.out.println("Digite a categoria da Pessoa Desenvolvedora (1-BACK / 2-FRONT / 3-MOB / 4-FULL: ");
				dev = leia.nextInt();
				
				if (dev < 1 || dev > 4)
					System.out.println("Digite um valor entre 1 e 4");
				
			}while(dev < 1 || dev > 4);
			
			if(dev == 1)
				back ++;
			
			if(dev == 2 && (genero == 1 || genero == 4))
				front ++;
			
			if(dev == 3 && (genero == 2 || genero == 5) && idade > 40)
				mobile ++;
			
			if(dev == 4 && genero == 3 && idade < 30)
				full ++;
			
			total ++;
			
			somaIdade += idade;
			
			media = (float)somaIdade / total;
			
			System.out.println("Deseja continuar (S/N)? ");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
			
		}
		
		System.out.println("Total de pessoas desenvolvedoras Backend: " + back);
		System.out.println("Total de pessoas desenvolvedoras Frontend Mulheres Cis e Trans: " + front);
		System.out.println("Total de pessoas desenvolvedoras Mobile Homens Cis e Trans maiores de 40 anos: " 
				+ mobile);
		System.out.println("Total de pessoas desenvolvedoras Fullstack Não Binários menores de 30 anos: " + full);
		System.out.println("Total de pessoas desenvolvedoras que responderam a pesquisa: " + total);
		System.out.printf("Média de idade das pessoas desenvolvedoras: %.2f", media);
		
	}

}
