package Task06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter points");
		int number = input.nextInt();
		if (number >= 1 && number <= 9) {
			if (number >= 1 && number <= 3) {
				System.out.print(number * 5);
			}
			if (number >= 4 && number <= 6) {
				System.out.print(number * 10);
			}
			if (number >= 7 && number <= 9) {
				System.out.print(number * 50);
			}

		} else {
			System.out.print("Points must be between 1 and 9");
		}

	}

}
