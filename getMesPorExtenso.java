package aula11;

public class getMesPorExtenso {

	/*
	 * * Faça uma classe chamada Mes que possua um método chamado getMesPorExtenso
	 * que recebe um número inteiro, referente ao mês do ano, um código referente ao
	 * idioma (1 para português e 2 para inglês) e retorne o mês por extenso. A
	 * tabela a seguir ilustra alguns exemplos. Faça também outra classe para testar
	 * o método.
	 */

	public static String MesesDoAno(int MesesDoAno) {

		String[] mesesDoAno = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October	", "November", "December" };
		return mesesDoAno[MesesDoAno];

	}

	public static String MesesDoAnoPortugues(int MesesDoAno) {

		String[] mesesDoAno = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
				"Setembro", "Outubro", "Novembro", "Dezembro" };
		return mesesDoAno[MesesDoAno];

	}
}
