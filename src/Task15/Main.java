package Task15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Kolko chisla shte vuvedetee");
		int number = sc.nextInt();
		int max = 0;
		int min = 0;

		for (int i = 0; i < number; i++) {
			System.out.print("Vuvedete chisla");
			int a = sc.nextInt();
			if (a > max) {
				max = a;
			}
			if (a < min) {
				min = a;
			}

		}
		System.out.print("Minimum:" + min);
		System.out.print("Maximum: " + max);
	}

}
