package projetos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		//Variáveis para receber os dados do empregado
		String employeeID = null;
		String employeeName = null;
		int employeeAge = 0;
		int employeeSalary = 0;
		//variável para o menu
		char menuOption;
		
		int cont =0;

		//Cria ou le o arquivo caso já exista
		File inputFile = new File("Projeto3.txt");
		FileWriter out = new FileWriter(inputFile, true);

		//Le o arquivo txt
		FileReader arq;
		//Le os dados da console
		BufferedReader console;
		//Le cada linha do arquivo
		BufferedReader lerArq;
		//Usada para receber cada linha
		String linha;

		do {
			//receber o dado do menu
			System.out
			.println("\nMenu - Insira o número de uma das opções:"
					+ " \n1- Adicionar um empregado "
					+ "\n2- Listar empregados "
					+ "\n3- Sair da aplicação");
			console = new BufferedReader(new InputStreamReader(System.in));
			menuOption = (char) console.read();

			//Opção para armazenar um empregado
			if (menuOption == '1') {
				//recebe o arquivo
				out = new FileWriter(inputFile, true);
				//Get ID
				System.out.print("\nDigite o ID do empregado");
				console = new BufferedReader(new InputStreamReader(System.in));				
				employeeID = console.readLine();
				
				//Get Nome
				System.out.print("\nDigite o nome do empregado");
				console = new BufferedReader(new InputStreamReader(System.in));				
				employeeName = console.readLine();
				
				//Get Idade
				System.out.print("\nDigite a idade do empregado");
				console = new BufferedReader(new InputStreamReader(System.in));				
				employeeAge = Integer.parseInt(console.readLine());
				
				//GetSalário
				System.out.print("\nDigite o salário do empregado");
				console = new BufferedReader(new InputStreamReader(System.in));				
				employeeSalary = Integer.parseInt(console.readLine());

				//Escreve as informações
				out.write(employeeID + " " + employeeName + " " + employeeAge
						+ " " + employeeSalary + "\n");
				
				//Armazena as informações
				out.close();
				System.out.println("\nCadastrado com sucesso");
				//Opção para listar o arquivo
			} else if (menuOption == '2') {
				//Get arquivo
				arq = new FileReader(inputFile);
				//Get Dados
				lerArq = new BufferedReader(arq);
				
				//Enquanto houver linhas para ler
				while (lerArq.ready()) {
					//Get linha
					linha = lerArq.readLine();
					//Imprime
					System.out.println(linha);
					//conta a quantidade empregados cadastrados
					cont++;
				}
				//Fecha a leitura
				arq.close();
				//imprime a quantidade de empregados cadastrados
				System.out.println("Quantidade de empregados cadastrados: "+ cont);

				//Opção inválida
			} else if (menuOption != '3') {
				System.out.println("Opção inválida!");
			}
			//COndição while
		} while (menuOption != '3');
	}
}
