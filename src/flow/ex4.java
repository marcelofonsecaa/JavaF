package flow;

import java.util.*;

public class ex4 {
	public static void main(String[] argument) {
		String[] args = new String[] { "Jo�o", "Maria", "Jos�", "Manuel" };
		Arrays.sort(args);

		for (int i = 0; i < args.length; i++) {
			if (i != args.length - 1) {
				System.out.print(args[i] + ", ");
			} else {
				System.out.print(args[i]);
			}

		}

	}
}
