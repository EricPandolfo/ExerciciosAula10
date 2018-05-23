package br.com.db1.start.exercicio08;

public class Conta {

	private Integer numero;
	private Integer digitoVerificador;
	private Agencia agencia;
	private Pessoa pessoa;

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(Integer digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	public Conta(Pessoa pessoa, Agencia agencia) {
		this.pessoa = pessoa;
		this.agencia = agencia;
	}

}
