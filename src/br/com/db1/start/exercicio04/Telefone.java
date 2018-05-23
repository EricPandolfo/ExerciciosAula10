package br.com.db1.start.exercicio04;

public class Telefone {

	private Integer ddd;
	private Integer numero;
	
	public String exibirTelefoneFormatado() {
		
		String exibirTelefoneFormatado = ddd.toString() + numero.toString();
		return exibirTelefoneFormatado;
	}
}
