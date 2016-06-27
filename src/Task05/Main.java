package Task05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;
		System.out.println("Vuvedete tri chisla");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		if ((a + b) > c && (a + c) > b && (b + c) > a) {
			System.out.print("Triangle can be built");
		} else {
			System.out.print("It`s impossible to built a triangle");
		}

		input.close();
	}

}
