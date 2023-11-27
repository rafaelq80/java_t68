package aula_11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<String> cidades = Arrays.asList("São Paulo", "Campinas", "São José dos Campos", "Atibaia", "Pereira Barreto", "Mongaguá", "Penedo");
		
		List<String> cidades2 = Arrays.asList("São Paulo", "Campinas", "São Paulo", "São José dos Campos", "São Paulo", "Atibaia", "Pereira Barreto", "Mongaguá");
		
		List<Integer> numerosAoCubo = numeros.stream()
				.map(n -> n*n*n)
				.collect(Collectors.toList());

		System.out.println(numerosAoCubo);
		
		List<Integer> numerosPares = numeros.stream()
				.filter(n -> n%2 == 0)
				.collect(Collectors.toList());
		
		System.out.println(numerosPares);
		
		long cidadesIniciandoP = cidades.stream()
				.filter(c -> c.toString().toUpperCase().startsWith("P"))
				.count();
		
		System.out.println("Quantas cidades começam com a letra P: " + cidadesIniciandoP);
		
		List<String> cidadesSemRepeticoes = cidades2.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(cidadesSemRepeticoes);
		
		
	}

}
