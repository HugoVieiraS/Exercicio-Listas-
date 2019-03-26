package br.com.db1.db1start.aula2;

public class ExerciciosDouble {

	public double retornarMenor(double numero1, double numero2) {
		if (numero1 < numero2) {
			return numero1;
		} else
			return numero2;

	}

	public double retornarMenor(double numero1, double numero2, double numero3) {
		double retornarMenor = retornarMenor(numero1, numero2);
		return retornarMenor = retornarMenor(retornarMenor, numero3);

	}

	public double media(double numero1, double numero2, double numero3) {
		return (numero1 + numero2 + numero3) / 3.0;
	}

	public double areaTriangulo(double altura, double base) {
		double calcularArea = base * altura / 2;
		return calcularArea;
	}

}
