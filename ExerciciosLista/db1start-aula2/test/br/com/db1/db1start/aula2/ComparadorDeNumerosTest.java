package br.com.db1.db1start.aula2;

import org.junit.Assert;
import org.junit.Test;

public class ComparadorDeNumerosTest {

	@Test /// usado para importar o test///dizer que é um metodo de teste

	public void deveRetornarNumero1MenorQueNumero2() { //// chamando o método
		ComparadorDeNumeros comparador = new ComparadorDeNumeros(); /// instanciando o para chamar método
		double resultado = comparador.menor(1, 2); /// passando o parametro
		Assert.assertEquals(1, resultado, 0);/// 1 valor esperato, resultado = o que esta retornando de verdade
		/// o 0 é pra definir quantas casas vai ter depois da virgula e verificar a
		/// gordurinha se está certo ou não
	}

	@Test
	public void deveRetornarNumero2MenorQueNumero1() { //// chamando o método
		ComparadorDeNumeros comparador = new ComparadorDeNumeros(); /// instanciando o para chamar método
		double resultado = comparador.menor(30, 20); /// passando o parametro
		Assert.assertEquals(20, resultado, 0);/// 1 valor esperato, resultado = o que esta retornando de verdade
		/// o 0 é pra definir quantas casas vai ter depois da virgula e verificar a
		/// gordurinha se está certo ou não
	}
}
