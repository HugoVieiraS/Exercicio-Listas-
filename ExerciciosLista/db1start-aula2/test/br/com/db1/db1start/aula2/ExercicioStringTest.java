package br.com.db1.db1start.aula2;

import org.junit.Assert;
import org.junit.Test;

public class ExercicioStringTest {

	@Test
	public void letrasMaiusculas() {
		ExerciciosString letrasMais = new ExerciciosString();
		String resultado = letrasMais.letrasMaiusculas("vitor hugo");
		Assert.assertEquals("VITOR HUGO", resultado);
	}

	@Test
	public void letrasMinusculas() {
		ExerciciosString letrasMais = new ExerciciosString();
		String resultado = letrasMais.letrasMinusculas("VITOR HUGO");
		Assert.assertEquals("vitor hugo", resultado);
	}

	@Test
	public void contaString() {
		ExerciciosString contar = new ExerciciosString();
		Integer resultado = contar.contaString("DB1START");
		Assert.assertEquals(8, resultado, 0);
	}

	@Test
	public void contaStringE() {
		ExerciciosString contar = new ExerciciosString();
		Integer resultado = contar.contaStringE(" DB1START ");
		Assert.assertEquals(10, resultado, 0);
	}

	@Test
	public void contaStringS() {
		ExerciciosString contar = new ExerciciosString();
		Integer resultado = contar.contaStringS(" DB1START ");
		Assert.assertEquals(8, resultado, 0);
	}

	@Test
	public void nomeComple() {
		ExerciciosString quatronome = new ExerciciosString();
		String resultado = quatronome.quatroPrimeiras("Vitor Hugo da Silva Vieira");
		Assert.assertEquals("Vito", resultado);
	}

	@Test
	public void apartirTerceira() {
		ExerciciosString tresmais = new ExerciciosString();
		String resultado = tresmais.apartirTerceira("Vitor Hugo da Silva Vieira");
		Assert.assertEquals("or Hugo da Silva Vieira", resultado);
	}

	@Test
	public void quatroUltimas() {
		ExerciciosString ultimas = new ExerciciosString();
		String resultado = ultimas.quatroUltimas("Vitor Hugo da Silva Vieira");
		Assert.assertEquals("eira", resultado);
	}

	@Test
	public void subistituicao() {
		ExerciciosString subistituicao = new ExerciciosString();
		String resultado = subistituicao.substituirNome("Vitor Hugo da Silva Vieira");
		Assert.assertEquals("Aluno", resultado);
	}

	@Test
	public void separarTexto() {
		ExerciciosString separacao = new ExerciciosString();
		String resultado = separacao.separarTexto("banana,maca,melancia");
		Assert.assertEquals("banana maca melancia", resultado);
	}

	@Test
	public void contar() {
		ExerciciosString separacao = new ExerciciosString();
		Integer resultado = separacao.contarVogais("vitor");
		Assert.assertEquals(2, resultado, 0);
	}

	@Test
	public void inverter() {
		ExerciciosString inverterTexto = new ExerciciosString();
		String resultado = inverterTexto.inverterTexto("vitor");
		Assert.assertEquals("rotiv", resultado);
	}

}
