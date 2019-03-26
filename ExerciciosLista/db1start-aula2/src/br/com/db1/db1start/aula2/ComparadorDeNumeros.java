package br.com.db1.db1start.aula2;

public class ComparadorDeNumeros {

	public double menor(double numero1, double numero2) { /// método instanciado
		if (numero1 < numero2) { /// boas praticas: sempre que fizer if, usar {}
			return numero1;
		}
		return numero2;

	}

}
