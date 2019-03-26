package br.com.db1.db1start.aula2;

import org.junit.Test;
import org.junit.Assert;

public class ExerciciosIntegerTest {

	@Test
	public void somaDosNumero1eNumero2() {
		ExerciciosInteger somadosvalores = new ExerciciosInteger();
		Integer resultado = somadosvalores.somar(2, 4);
		Assert.assertEquals(6, resultado, 0);
	}

	@Test
	public void subtracaoDosNumero1eNumero2() {
		ExerciciosInteger subtracaodosvalores = new ExerciciosInteger();
		Integer resultado = subtracaodosvalores.subtrair(4, 4);
		Assert.assertEquals(0, resultado, 0);
	}

	@Test
	public void multiplicacaoDosNumero1eNumero2() {
		ExerciciosInteger multiplicacaodosvalores = new ExerciciosInteger();
		Integer resultado = multiplicacaodosvalores.multiplicar(4, 2);
		Assert.assertEquals(8, resultado, 0);
	}

	@Test
	public void divisaoDosNumero1eNumero2() {
		ExerciciosInteger divisaodosvalores = new ExerciciosInteger();
		Integer resultado = divisaodosvalores.div(4, 2);
		Assert.assertEquals(2, resultado, 0);
	}

	@Test
	public void numeroPar() {
		ExerciciosInteger numerosPares = new ExerciciosInteger();
		boolean resultado = numerosPares.par1(4);
		Assert.assertTrue(resultado);
	}

	@Test
	public void numeroImpar() {
		ExerciciosInteger numerosImpares = new ExerciciosInteger();
		boolean resultado = numerosImpares.par1(3);
		Assert.assertFalse(resultado);
	}

	@Test
	public void numeroMaior() {
		ExerciciosInteger numeroMaior = new ExerciciosInteger();
		Integer resultado = numeroMaior.maior(6, 5);
		Assert.assertEquals(6, resultado, 0);
	}

	@Test
	public void deveRetornarQuantidadeDeImpares() {
		ExerciciosInteger exercicios = new ExerciciosInteger();
		Integer resultado = exercicios.numeroDeImpares(1);
		Assert.assertEquals(50, resultado, 0);
	}

}
