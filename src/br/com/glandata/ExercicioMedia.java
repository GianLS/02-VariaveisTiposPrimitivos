package br.com.glandata;

public class ExercicioMedia {

	public static void main(String[] args) {
		Integer nota1 = 7;
		Integer nota2 = 8;
		Integer nota3 = 8;

		boolean Resultado = (nota1 + nota2 + nota3) / 3 > 6;
		
		System.out.println(Resultado ? "Aluno Aprovado" : "Aluno Reprovado");
	}

}
