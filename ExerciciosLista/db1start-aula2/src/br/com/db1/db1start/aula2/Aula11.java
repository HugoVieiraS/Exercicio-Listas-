package br.com.db1.db1start.aula2;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aula11 {
	/// EXERCICIO 1
	public List<String> coresFavoritas(List<String> cores) {
		return cores;
	}

	/// EXERCICIO 2
	public int retornarQuantidade(List<String> texto) {
		return texto.size();

	}

	/// EXERCICIO 3
	public List<String> receberTextoERemoverUm(List<String> receberTexto) {
		return receberTexto;

	}

	/// EXERCICIO 5
	public List<String> retornarCoresOrdenadas(List<String> coresOrdenadas) {
		return coresOrdenadas;
	}

	/// EXERCICIO 6
	public List<String> receberUmAtributoRemovido(List<String> cores) {
		return cores;
	}

	/// EXERCICIO 7
	public List<String> ordemDecrescente(List<String> ordemDecrescente) {
		Collections.reverseOrder();
		return ordemDecrescente;

	}

/// EXERCICIO 8
	public List<List<Integer>> listasDeParesEImpares(List<Integer> numeros) {
		List<Integer> par = new ArrayList<>();
		List<Integer> impar = new ArrayList<>();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < numeros.size(); i++) {
			Integer aux = numeros.get(i);
			if (aux % 2 == 0) {
				par.add(aux);
			} else {
				impar.add(aux);
			}
		}
		list.add(0, par);
		list.add(1, impar);
		return list;
	}

/// EXERCICIO 9
	public Map<String, List<String>> dividirPalavrasMap(List<String> palavras) {
		Map<String, List<String>> retorno = new HashMap<>();
		Collections.sort(palavras);
		for (String value : palavras) {
			String letra = value.substring(0, 1);
			if (!retorno.containsKey(letra)) {
				retorno.put(letra, new ArrayList<>());
			}
			retorno.get(letra).add(value);
		}
		return retorno;
	}

	/// EXERCICIO 10
	public Integer somarInteger(List<Integer> somar) {
		return somar.get(0) + somar.get(1);
	}

	/// EXERCICIO 11
	public Double calcularMedia(List<Double> media) {
		return (media.get(0) + media.get(1) + media.get(2)) / 3;
	}

	/// EXERCICIO 12
	public Integer retornarMenorValor(List<Integer> valores) {
		if (valores.get(0) < valores.get(1)) {
			return valores.get(0);
		} else {
			return valores.get(1);
		}
	}

	/// EXERCICIO 13
	public Integer retornarMaiorValor(List<Integer> valores) {
		if (valores.get(0) > valores.get(1)) {
			return valores.get(0);
		} else {
			return valores.get(1);
		}
	}

	/// EXERCICIO 14
	public List<Integer> retirarImpares(List<Integer> numeros) {
		for (int i = 0; i < numeros.size(); i++)
			if (numeros.get(i) / 2 != 0) {
				numeros.remove(i);
			}
		return numeros;
	}

/// EXERCICIO 15 - Método que receba uma frase e retorne todas as vogais.
	public List<Character> retornarVogais(String frase) {
		List<Character> vogais = new ArrayList<>();
		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				vogais.add(letra);
			}
		}
		return vogais;
	}

}
