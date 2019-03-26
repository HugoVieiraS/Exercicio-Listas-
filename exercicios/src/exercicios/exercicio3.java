package exercicios;

public class exercicio3 {
	public  exercicio3() {
		
	}
	int [] notas = new int [3];
	public void adicionarnotas(int nota1, int nota2, int nota3){
		if(valido(nota1, nota2, nota3)) {
			
			notas[0] = nota1;
			notas[1] = nota2;
			notas[2] = nota3;
		}else {
			System.out.println("Notas invalidas");
		}
		
	}
	public void calcular() {
		int resposta = notas[0] + notas[1] + notas[2];
		int calculo = resposta / notas.length;
		
		
		System.out.println("Media de notas" + calculo);
	}
	public boolean valido(int n1, int n2, int n3) {
		if(n1<0 || n2 < 0 || n3 < 0 || n1 > 100 || n2 > 100 || n3 > 100) {
			return false;
		} 
		return true;
	}
}
