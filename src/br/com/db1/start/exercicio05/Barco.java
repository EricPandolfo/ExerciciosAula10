package br.com.db1.start.exercicio05;

public class Barco extends TransporteAquatico {

	private Boolean pesqueiro;

	public Boolean isPesqueiro() {
		Boolean isPesqueiro = pesqueiro;
		return isPesqueiro;
	}

	public Boolean getPesqueiro() {
		return pesqueiro;
	}

	public void setPesqueiro(Boolean pesqueiro) {
		this.pesqueiro = pesqueiro;
	}

}
