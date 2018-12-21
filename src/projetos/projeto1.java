package projetos;

import java.util.Scanner;

public class projeto1 {
	public static void main(String[] args) {

		// instanciar o scanner
		Scanner console = new Scanner(System.in);
		// imprime a mensagem para o usuário saber quando digitar
		System.out.print("Digite o número do employee: ");
		// recupera a msg do usuário
		String cod_employee = console.nextLine();

		// pula linha
		System.out.print("\n");
		int salario = 0;
		int basic = 0;
		int hra = 0;
		int it = 0;
		int da = 0;
		String employeId = "";
		String employeName = "";
		String employeDep = "";
		String employeDes = "";

		String id_desig = "";

		String[][] dep_desig_salary = {
				{ "1001", "Ashish", "01/04/2009", "e", "R&B", "20000", "8000",
						"3000" },
				{ "1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000",
						"9000" },
				{ "1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000",
						"1000" },
				{ "1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000",
						"6000", "2000" },
				{ "1005", "Ranjan", "16/07/2005", "m", "Engg", "50000",
						"20000", "20000" },
				{ "1006", "Suman", "01/01/2000", "e", "Manufactoring", "23000",
						"9000", "4400" },
				{ "1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000",
						"10000" } };

		String[][] desig_details = { { "e", "Enginner", "20000" },
				{ "c", "Consultant", "32000" }, { "k", "Clark", "12000" },
				{ "r", "Receptionist", "15000" }, { "m", "Manager", "40000" } };

		switch (cod_employee) {
		case "1001":
			// Número do Empregado, nome, departamento
			employeId = dep_desig_salary[0][0];
			employeName = dep_desig_salary[0][1];
			employeDep = dep_desig_salary[0][4];
			basic = Integer.parseInt(dep_desig_salary[0][5]);
			hra = Integer.parseInt(dep_desig_salary[0][6]);
			it = Integer.parseInt(dep_desig_salary[0][7]);
			id_desig = dep_desig_salary[0][3];
			break;
		case "1002":
			employeId = dep_desig_salary[1][0];
			employeName = dep_desig_salary[1][1];
			employeDep = dep_desig_salary[1][4];
			basic = Integer.parseInt(dep_desig_salary[1][5]);
			hra = Integer.parseInt(dep_desig_salary[1][6]);
			it = Integer.parseInt(dep_desig_salary[1][7]);
			id_desig = dep_desig_salary[1][3];
			break;
		case "1003":
			employeId = dep_desig_salary[2][0];
			employeName = dep_desig_salary[2][1];
			employeDep = dep_desig_salary[2][4];
			basic = Integer.parseInt(dep_desig_salary[2][5]);
			hra = Integer.parseInt(dep_desig_salary[2][6]);
			it = Integer.parseInt(dep_desig_salary[2][7]);
			id_desig = dep_desig_salary[2][3];
			break;
		case "1004":
			employeId = dep_desig_salary[3][0];
			employeName = dep_desig_salary[3][1];
			employeDep = dep_desig_salary[3][4];
			basic = Integer.parseInt(dep_desig_salary[3][5]);
			hra = Integer.parseInt(dep_desig_salary[3][6]);
			it = Integer.parseInt(dep_desig_salary[3][7]);
			id_desig = dep_desig_salary[3][3];
			break;
		case "1005":
			employeId = dep_desig_salary[4][0];
			employeName = dep_desig_salary[4][1];
			employeDep = dep_desig_salary[4][4];
			basic = Integer.parseInt(dep_desig_salary[4][5]);
			hra = Integer.parseInt(dep_desig_salary[4][6]);
			it = Integer.parseInt(dep_desig_salary[4][7]);
			id_desig = dep_desig_salary[4][3];
			break;
		case "1006":
			employeId = dep_desig_salary[5][0];
			employeName = dep_desig_salary[5][1];
			employeDep = dep_desig_salary[5][4];
			basic = Integer.parseInt(dep_desig_salary[5][5]);
			hra = Integer.parseInt(dep_desig_salary[5][6]);
			it = Integer.parseInt(dep_desig_salary[5][7]);
			id_desig = dep_desig_salary[5][3];
			break;
		case "1007":
			employeId = dep_desig_salary[6][0];
			employeName = dep_desig_salary[6][1];
			employeDep = dep_desig_salary[6][4];
			basic = Integer.parseInt(dep_desig_salary[6][5]);
			hra = Integer.parseInt(dep_desig_salary[6][6]);
			it = Integer.parseInt(dep_desig_salary[6][7]);
			id_desig = dep_desig_salary[6][3];
			break;
		default:
			System.out.println("Empregado não cadastrado");
			break;
		}
		switch (id_desig) {
		case "e":
			employeDes = desig_details[0][1];
			da = Integer.parseInt(desig_details[0][2]);
			break;
		case "c":
			employeDes = desig_details[1][1];
			da = Integer.parseInt(desig_details[1][2]);
			break;
		case "k":
			employeDes = desig_details[2][1];
			da = Integer.parseInt(desig_details[2][2]);
			break;
		case "r":
			employeDes = desig_details[3][1];
			da = Integer.parseInt(desig_details[3][2]);
			break;
		case "m":
			employeDes = desig_details[4][1];
			da = Integer.parseInt(desig_details[4][2]);
			break;
		default:
			System.out.println("Designation Code não cadastrado");
			break;
		}

		salario = basic + hra + da - it;

		if (salario != 0) {
			System.out
					.println("Emp No\t Emp Name\t Department\t Designation\t Salary");
			System.out.println(employeId + "\t" + employeName + "\t\t"
					+ employeDep + "\t\t" + employeDes + "\t\t" + salario);
		}
	}
}
