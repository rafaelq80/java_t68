package aula_06;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaBanco {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		int opcao;

		String nome;

		while (true) {

			System.out.println("****************************************");
			System.out.println("                                        ");
			System.out.println("     1 - Adicionar Cliente na fila      ");
			System.out.println("     2 - Listar todos os Clientes       ");
			System.out.println("     3 - Retirar Cliente na fila        ");
			System.out.println("     0 - Sair                           ");
			System.out.println("                                        ");
			System.out.println("****************************************");
			System.out.println("Digite a opção desejada:                ");
			System.out.println("                                        ");

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("\nPrograma Finalizado");
				System.exit(0);
			}

			switch (opcao) {
			case 1:
					System.out.println("\nAdicionar Cliente na Fila\n\n");
					
					System.out.println("Digite o nome do Cliente: ");
					leia.skip("\\R");
					nome = leia.nextLine();
					
					fila.add(nome);
					
					System.out.println("\nCliente foi adicionado na Fila!");
					
				break;
			case 2:
				System.out.println("\nListar todos os Clientes na Fila\n\n");
				
				Iterator<String> iFila = fila.iterator();
				
				while(iFila.hasNext())
					System.out.println(iFila.next());
				
				break;
			case 3:
				System.out.println("\nRetirar um Cliente da Fila\n\n");
				
				if(fila.isEmpty())
					System.out.println("\nA Fila está vazia!");
				else {
					fila.remove();
					System.out.println("\nCliente retirado da fila!");
				}
				
				break;
			default:
				System.out.println("\nOpção Inválida");
				break;
			}
		}

	}

}
