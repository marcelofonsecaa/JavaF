package projetos;

import java.util.ArrayList;


public class Loja {
	

	private ArrayList <Video> videos = new ArrayList<Video>();
	
	
	public void addVideo(String titulo) {
		//Inicia um objeto do tipo video na loja
		Video video = new Video(titulo, false, 0.0);
		videos.add(video);
	}

	public void alugar(String titulo) {
		//busca videos pelo nome para alugar
		for (Video video : videos) {
			if (video.titulo.equals(titulo)) {
				video.sendoAlugado();
				break;
			}
		}
	}
	public void devolver(String titulo) {
		
		//busca videos pelo nome para devolver
		for (Video video : videos) {
			if (video.titulo.equals(titulo)) {
				video.sendoDevolvido();
				break;
			}
		}
	}
	public void receberNota(String titulo, Double nota) {
		//busca video pelo nome para alterar nota
		for (Video video : videos) {
			if (video.titulo.equals(titulo)) {
				video.recebendoAvaliacao(nota);
				break;
			}
		}
	}
	public ArrayList<Video> listarInventario() {
		return this.videos;
	}

}
