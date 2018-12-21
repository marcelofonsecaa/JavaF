package ops_heranca;

class Employee1 extends Object {
}

class Manager1 extends Employee1 {
}

class Director extends Manager1 {
}

public class heranca_multinivel {
	public static void salary(Object obj)
	{
		if(obj instanceof Director)
		{
			System.out.println("Salário de diretor: 3000");
		}
		else if(obj instanceof Manager1)
		{
			System.out.println("Salário de manager: 2000");
		}
		else if(obj instanceof Employee1)
		{
			System.out.println("Salário de employee: 1000");
		}
		else{
			System.out.println("Inválido");
		}
	}
	
	public static void main(String [] args)
	{
		System.out.println("Employee");
		Employee1 e = new Employee1();
		salary(e);
		
		System.out.println("Manager");
		Manager1 m = new Manager1();
		salary(m);
		
		System.out.println("Director");
		Director d = new Director();
		salary(d);
		
		
		
		
		
		
	}
}
