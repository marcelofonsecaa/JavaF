package flow;

public class ex3 {
	public static void main(String[] argument) {
		String[] args = new String[] { "Jo�o", "Maria", "Jos�", "Manuel" };

		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				if (i != args.length - 1) {
					System.out.print(args[i] + ", ");
				}
				else
				{
					System.out.print(args[i]);
				}

			}
		} else if (args.length == 0) {
			System.out.println("No values");
		}
		// Arrays.sort(args);
	}
}
