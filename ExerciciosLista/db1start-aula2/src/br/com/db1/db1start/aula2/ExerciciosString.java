package br.com.db1.db1start.aula2;

public class ExerciciosString {

	public String letrasMaiusculas(String letrasMaiusculas) {

		return letrasMaiusculas.toUpperCase();
	}

	public String letrasMinusculas(String letrasMinusculas) {

		return letrasMinusculas.toLowerCase();
	}

	public Integer contaString(String texto) {
		Integer contas;
		contas = texto.length();

		return contas;
	}

	public Integer contaStringE(String texto) {
		Integer contaStringS = texto.length();

		return contaStringS;
	}

	public Integer contaStringS(String texto) {
		Integer contaStringS = texto.trim().length();

		return contaStringS;
	}

	public String quatroPrimeiras(String nome) {
		return nome.substring(0, 4);
	}

	public String apartirTerceira(String nome) {
		return nome.substring(3, 26);
	}

	public String quatroUltimas(String nome) {
		return nome.substring(22, 26);
	}

	public String substituirNome(String nome) {
		return nome.replace(nome, "Aluno").substring(0, 5);

	}

	public String separarTexto(String nomes) {
		String[] frutas = nomes.split(",");
		return nomes = frutas[0] + " " + frutas[1] + " " + frutas[2];
	}

	public Integer contarVogais(String texto) {
		int contarVogais = 0;
		texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				contarVogais++;
		}
		return contarVogais;
	}

	public String inverterTexto(String texto) {
		String invertida = new StringBuilder(texto).reverse().toString();
		return invertida;
	}

}