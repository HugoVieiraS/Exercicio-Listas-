package br.com.db1.db1start.aula2;

import org.junit.Assert;
import org.junit.Test;

public class ComparadorDeNumerosTest {

	@Test /// usado para importar o test///dizer que � um metodo de teste

	public void deveRetornarNumero1MenorQueNumero2() { //// chamando o m�todo
		ComparadorDeNumeros comparador = new ComparadorDeNumeros(); /// instanciando o para chamar m�todo
		double resultado = comparador.menor(1, 2); /// passando o parametro
		Assert.assertEquals(1, resultado, 0);/// 1 valor esperato, resultado = o que esta retornando de verdade
		/// o 0 � pra definir quantas casas vai ter depois da virgula e verificar a
		/// gordurinha se est� certo ou n�o
	}

	@Test
	public void deveRetornarNumero2MenorQueNumero1() { //// chamando o m�todo
		ComparadorDeNumeros comparador = new ComparadorDeNumeros(); /// instanciando o para chamar m�todo
		double resultado = comparador.menor(30, 20); /// passando o parametro
		Assert.assertEquals(20, resultado, 0);/// 1 valor esperato, resultado = o que esta retornando de verdade
		/// o 0 � pra definir quantas casas vai ter depois da virgula e verificar a
		/// gordurinha se est� certo ou n�o
	}
}
