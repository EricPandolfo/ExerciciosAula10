package br.com.db1.start.exercicio08;

public class PessoaFisica extends Pessoa {

	private Integer cep;

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public Boolean validarCpf() {
		return null;
	}

	public String formatarCpf() {
		return "";
	}

	public Integer getCep() {
		return cep;
	}
}
