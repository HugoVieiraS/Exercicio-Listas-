package br.com.db1.db1start.aula2;

import org.junit.Assert;
import org.junit.Test;

public class ExerciciosDoubleTest {
	@Test
	public void numeroMenor() {
		ExerciciosDouble numMenor = new ExerciciosDouble();
		double resultado = numMenor.retornarMenor(150.50, 20.50);
		Assert.assertEquals(20.50, resultado, 0.0);
	}

	@Test
	public void numeroMenor2() {
		ExerciciosDouble numMenor = new ExerciciosDouble();
		double resultado = numMenor.retornarMenor(150.50, 20.50, 30.50);
		Assert.assertEquals(20.50, resultado, 0.0);
	}

	@Test
	public void media() {
		ExerciciosDouble media = new ExerciciosDouble();
		double resultado = media.media(6.0, 6.0, 6.0);
		Assert.assertEquals(6.0, resultado, 0.0);
	}

	@Test
	public void calcularArea() {
		ExerciciosDouble area = new ExerciciosDouble();
		double resultado = area.areaTriangulo(12, 15);
		Assert.assertEquals(90, resultado, 0.0);
	}

}
