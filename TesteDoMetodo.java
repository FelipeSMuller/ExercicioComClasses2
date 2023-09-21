package aula11;

import javax.swing.JOptionPane;

public class TesteDoMetodo {

	public static void main(String[] args) {
		/*
		 * * Faça uma classe chamada Mes que possua um método chamado getMesPorExtenso
		 * que recebe um número inteiro, referente ao mês do ano, um código referente ao
		 * idioma (1 para português e 2 para inglês) e retorne o mês por extenso. A
		 * tabela a seguir ilustra alguns exemplos. Faça também outra classe para testar
		 * o método.
		 */

		int idioma = 0, mesDoAno = 0;

		do {

			try {
				mesDoAno = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Digite um número referente ao respectivo mês do ano, sendo 0 para janeiro e assim por diante.."));

				idioma = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Digite o idioma que deseja escolher, sendo : \n1-Português \n2-Inglês"));

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Você digitou algo que não corresponde a um número \nERRO");
			}

			switch (idioma) {

			case 1:
				JOptionPane.showMessageDialog(null, "Você selecionou o idioma Português");

				JOptionPane.showMessageDialog(null, getMesPorExtenso.MesesDoAnoPortugues(mesDoAno));
				break;

			case 2:

				JOptionPane.showMessageDialog(null, "Você selecionou o idioma Inglês");

				JOptionPane.showMessageDialog(null, getMesPorExtenso.MesesDoAno(mesDoAno));

				break;

			default:

				JOptionPane.showMessageDialog(null, "Você não selecionou nenhum número válido");
				break;

			}

		}

		while (idioma != 0 || mesDoAno != 0);

	}

}
