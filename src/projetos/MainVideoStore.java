package projetos;

import java.io.IOException;
import java.util.ArrayList;

public class MainVideoStore {

	public static void main(String[] args) {

		// Declarar array para receber os objetos
		ArrayList<Video> videos;

		// Inicia a loja
		Loja loja = new Loja();

		// Adicionar os videos
		loja.addVideo("");
		loja.addVideo("Poderoso Chefão");
		loja.addVideo("Star Wars");
		loja.addVideo("Nova esperança");

		// Receber a avaliação dos videos
		loja.receberNota("The Matrix", 10.0);
		loja.receberNota("Poderoso Chefão", 6.5);
		loja.receberNota("Star Wars", 5.9);
		loja.receberNota("Nova esperança", 9.0);

		// Alugar
		loja.alugar("The Matrix");
		loja.alugar("Poderoso Chefão");
		loja.alugar("Star Wars");
		loja.alugar("Nova esperança");

		// Devolver
		loja.devolver("The Matrix");
		loja.devolver("Poderoso Chefão");

		// Listar o inventário
		videos = loja.listarInventario();

		for (Video video : videos) {

			System.out.println("Nome do filme: " + video.titulo + "\nAlugado: "
					+ video.flagAlugado + "\nNota: " + video.mediaAvaliacao);

			System.out.println("\n");

		}
		loja.devolver("Star Wars");
		loja.devolver("Nova esperança");

	}

}
