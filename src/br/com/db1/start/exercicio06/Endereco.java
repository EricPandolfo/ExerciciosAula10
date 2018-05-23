package br.com.db1.start.exercicio06;

public class Endereco {
	private String logradouro;
	private Integer cep;
	private TipoLogradouro tipoLogradouro;

	public String exibirCepFormatado() {

		String exibirCepFormatado = cep.toString();

		exibirCepFormatado = exibirCepFormatado.substring(0, 5) + "-" + exibirCepFormatado.substring(5);

		return exibirCepFormatado;

	}

}
