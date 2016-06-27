package Task12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = num.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 3 != 0 && i % 7 != 0) {
				System.out.println(i);
			}

		}

	}

}
