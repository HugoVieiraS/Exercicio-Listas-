package br.com.db1.db1start.aula2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class Aula11Test {

/// EXERCICIO 1 - Método que retorne o nome das cores que você mais gosta
	@Test
	public void deveRetornarCoresFavoritas() {
		Aula11 aula11 = new Aula11();
		List<String> coresFavoritas = new ArrayList<>();

		coresFavoritas.add("Azul");
		coresFavoritas.add("Amarelo");
		coresFavoritas.add("Branco");

		List<String> cores = aula11.coresFavoritas(coresFavoritas);

		Assert.assertEquals("Azul", cores.get(0));
		Assert.assertEquals("Amarelo", cores.get(1));
		Assert.assertEquals("Branco", cores.get(2));
	}

/// EXERCICIO 2 - Método que passado  uma lista retorne a quantidade de itens. 
	@Test
	public void contarListeERetornar() {
		Aula11 aula11 = new Aula11();
		List<String> texto = new ArrayList<>();

		texto.add("Vermelho");
		texto.add("Preto");
		texto.add("Branco");
		texto.add("Amarelo");

		int retornarQuantidade = aula11.retornarQuantidade(texto);
		Assert.assertEquals(4, retornarQuantidade);
	}

/// EXERCICIO 3 - Método que receba 3 String, e adicione a uma lista e remova o valor da segunda posição
	@Test
	public void removerList() {
		Aula11 aula11 = new Aula11();
		List<String> texto = new ArrayList<>();

		texto.add("CARRO");
		texto.add("MOTO");
		texto.add("AVIAO");
		texto.add("BARCO");

		aula11.receberTextoERemoverUm(texto);

		Assert.assertEquals("CARRO", texto.get(0));
		Assert.assertEquals("MOTO", texto.get(1));
		Assert.assertEquals("BARCO", texto.get(2));

	}

//// EXERCICIO 5  -- Método que apresente o nomes cores do exercicio 1 ordenados
	@Test
	public void deveRetornarCoresFavoritasOrdenados() {
		Aula11 aula11 = new Aula11();

		List<String> coresFavoritas = new ArrayList<>();

		coresFavoritas = aula11.retornarCoresOrdenadas(coresFavoritas);

		coresFavoritas.add("Vermelho");
		coresFavoritas.add("Preto");
		coresFavoritas.add("Branco");
		coresFavoritas.add("Amarelo");

		Collections.sort(coresFavoritas);

		Assert.assertEquals("Amarelo", coresFavoritas.get(0));
		Assert.assertEquals("Branco", coresFavoritas.get(1));
		Assert.assertEquals("Preto", coresFavoritas.get(2));
		Assert.assertEquals("Vermelho", coresFavoritas.get(3));
	}

/// EXERCICIO 6 - Método que receba uma lista com as cores que você mais gosta e um atributo que receba uma cor a ser removida.
	@Test
	public void removerUmAtributo() {
		Aula11 aula11 = new Aula11();
		List<String> cores = new ArrayList<>();

		cores = aula11.receberUmAtributoRemovido(cores);
		cores.add("Vermelho");
		cores.add("Preto");
		cores.add("Branco");
		cores.add("Amarelo");

		cores.remove(2);

		Assert.assertEquals("Vermelho", cores.get(0));
		Assert.assertEquals("Preto", cores.get(1));
		Assert.assertEquals("Amarelo", cores.get(2));
	}

/// EXERCICIO 7 - Método que recebido uma lista de String, retorne ordenado de forma decrescente 
	@Test
	public void ordemDecrescente() {
		Aula11 aula11 = new Aula11();

		List<String> nomes = new ArrayList<>();

		nomes = aula11.ordemDecrescente(nomes);

		nomes.add("Amanda");
		nomes.add("Bruno");
		nomes.add("Carlos");

		Assert.assertEquals("Carlos", nomes.get(2));
		Assert.assertEquals("Bruno", nomes.get(1));
		Assert.assertEquals("Amanda", nomes.get(0));
	}

/// EXERCICIO 8 - Método que receba uma lista de números inteiros e retorne uma lista de lista, contendo em uma das listas os números pares e em outra lista o números ímpares.
	@Test
	public void deveRetornarImparesEPares() {
		Aula11 aula11 = new Aula11();
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		List<List<Integer>> retorno = aula11.listasDeParesEImpares(numeros);
		Assert.assertEquals(4, numeros.size());
		List<Integer> pares = retorno.get(0);
		List<Integer> impares = retorno.get(1);
		Assert.assertEquals(2, pares.size());
		Assert.assertEquals(2, impares.size());
		Assert.assertEquals(2, pares.get(0), 0);
		Assert.assertEquals(4, pares.get(1), 0);
		Assert.assertEquals(1, impares.get(0), 0);
		Assert.assertEquals(3, impares.get(1), 0);
	}

/// EXERCICIO 9 - Método que receba a seguinte quantidade de dados e exiba os nomes distintos pelo primeiro caracter e ordenados
	@Test
	public void deveRetornarListaSeparadaMap() {
		Aula11 aula11 = new Aula11();
		List<String> palavras = new ArrayList<>();

		palavras.add("Maiko");
		palavras.add("Ana");

		Map<String, List<String>> retorno = aula11.dividirPalavrasMap(palavras);

		Assert.assertEquals(2, retorno.size());
		Assert.assertEquals("Ana", retorno.get("A").get(0));
		Assert.assertEquals("Maiko", retorno.get("M").get(0));
	}

/// EXERCICIO 10 - Método que receba uma lista de Integer e retorna a soma.
	@Test
	public void somarInt() {
		Aula11 aula11 = new Aula11();
		List<Integer> somar = new ArrayList<>();
		somar.add(20);
		somar.add(30);

		Integer resultado = aula11.somarInteger(somar);

		Assert.assertEquals(50, resultado, 0);
	}

/// EXERCICIO 11 - Método que receba uma lista de double e retorne a média 
	@Test
	public void mediaDouble() {
		Aula11 aula11 = new Aula11();
		List<Double> media = new ArrayList<>();
		media.add(6.0);
		media.add(6.0);
		media.add(6.0);

		Double resultado = aula11.calcularMedia(media);

		Assert.assertEquals(6.0, resultado, 0);
	}

/// EXERCICIO 12 - Método que receba uma lista de Integer e deveolva o menor valor.
	@Test

	public void retornarMenorValor() {
		Aula11 aula11 = new Aula11();
		List<Integer> valores = new ArrayList<>();
		valores.add(50);
		valores.add(20);

		Integer menor = aula11.retornarMenorValor(valores);
		Assert.assertEquals(20, menor, 0);
	}

/// EXERCICIO 13 - Método que receba uma lista de Integer e devolva o maior valor
	@Test
	public void retornarMaiorValor() {
		Aula11 aula11 = new Aula11();
		List<Integer> valores = new ArrayList<>();
		valores.add(50);
		valores.add(20);

		Integer menor = aula11.retornarMaiorValor(valores);
		Assert.assertEquals(50, menor, 0);
	}

/// EXERCICIO 14 - Método que receba uma lista de Integer e remova todos os ímpares
	@Test
	public void retirarImpares() {
		Aula11 aula11 = new Aula11();
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);

		List<Integer> resultado = aula11.retirarImpares(numeros);

		Assert.assertEquals(1, resultado.get(0), 0);
		Assert.assertEquals(3, resultado.get(1), 0);
	}

/// EXERCICIO 15 - Método que receba uma frase e retorne todas as vogais.
	@Test
	public void deveRetornarAsVogais() {
		String frase = "Vitor Hugo Vieira";
		Aula11 aula11 = new Aula11();
		List<Character> result = aula11.retornarVogais(frase);

		Assert.assertEquals('i', result.get(0), 0);
		Assert.assertEquals('o', result.get(1), 0);
		Assert.assertEquals('u', result.get(2), 0);
		Assert.assertEquals('o', result.get(3), 0);
		Assert.assertEquals('i', result.get(4), 0);
		Assert.assertEquals('e', result.get(5), 0);
		Assert.assertEquals('i', result.get(6), 0);
		Assert.assertEquals('a', result.get(7), 0);

	}

}
