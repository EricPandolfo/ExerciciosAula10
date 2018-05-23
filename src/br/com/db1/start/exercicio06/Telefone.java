package br.com.db1.start.exercicio06;

public class Telefone {

	private Integer ddd;
	private Integer numero;

	public String exibirTelefoneFormatado() {

		String exibirTelefoneFormatado = ddd.toString() + numero.toString();

		exibirTelefoneFormatado = "(" + ddd + ")" + exibirTelefoneFormatado.substring(2, 7) + "-"
				+ exibirTelefoneFormatado.substring(7);

		return exibirTelefoneFormatado;
	}
}
