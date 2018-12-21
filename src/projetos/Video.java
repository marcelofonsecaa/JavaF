package projetos;

public class Video  {

	String titulo;
	boolean flagAlugado;
	Double mediaAvaliacao;

	public void sendoAlugado() {
		flagAlugado = true;
	}

	public void sendoDevolvido() {
		flagAlugado = false;
	}

	public void recebendoAvaliacao(Double mediaAvaliacao) {
		this.mediaAvaliacao = mediaAvaliacao;
	}

	public Video(String titulo, boolean flagAlugado, Double mediaAvaliacao) {
		this.titulo = titulo;
		this.flagAlugado = flagAlugado;
		this.mediaAvaliacao = mediaAvaliacao;
	}

}
