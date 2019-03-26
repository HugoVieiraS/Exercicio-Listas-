package br.com.db1.db1start.aula2;

public class ExerciciosInteger {

	public Integer somar(Integer numero1, Integer numero2) {

		Integer somar = numero1 + numero2;

		return somar;
	}

	public Integer subtrair(Integer numero1, Integer numero2) {

		Integer subtrair = numero1 - numero2;

		return subtrair;
	}

	public Integer multiplicar(Integer numero1, Integer numero2) {

		Integer multiplicar = numero1 * numero2;

		return multiplicar;
	}

	public Integer div(Integer numero1, Integer numero2) {

		return numero1 / numero2;

	}

	public boolean par1(Integer numero1) {
		boolean par1;
		if (numero1 % 2 == 0) {
			par1 = true;
		} else {
			par1 = false;
		}
		return par1;
	}

	Integer maior(Integer numero1, Integer numero2) {
		Integer maior;
		if (numero1 > numero2) {
			maior = numero1;
		} else {
			maior = numero2;
		}
		return maior;
	}

	public Integer numeroDeImpares(Integer numero1) {
		Integer contador = 0;
		for (int i = numero1; i <= 100; i++) {
			if (i % 2 != 0) {
				contador++;
			}
		}

		return contador;

	}
}
