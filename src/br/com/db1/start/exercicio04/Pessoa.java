package br.com.db1.start.exercicio04;

import java.util.Date;

public class Pessoa {

	private String nome;
	private Date dataNascimento;
	private Sexo sexo;

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
}
