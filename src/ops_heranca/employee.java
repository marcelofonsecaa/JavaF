package ops_heranca;

public class employee {

	String employeeName;	 int employeeNo;
	
	public employee()
	{
		System.out.println("Meu construtor sem parametros");
		employeeName = null;
		employeeNo = 0;
		System.out.println("Fim");
	}
	public employee(int employeeNo)
	{
		System.out.println("Construtor com 1 parametro");
		this.employeeNo = employeeNo;
		this.employeeName = "Unknown";
		System.out.println("Fim");
	}
	public employee(int employeeNo, String employeeName)
	{
		System.out.println("Construtor com 2 parametros");
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		System.out.println("Fim");	
	}
	public void display()
	{
		System.out.println("Employee Number: "+ employeeNo);	
		System.out.println("Employee Name: "+ employeeName);	
	}
}
