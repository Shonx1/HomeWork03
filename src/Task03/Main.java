package Task03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("a:");
		int a = input.nextInt();
		System.out.print("b:");
		int b = input.nextInt();
		System.out.print("c:");
		int c = input.nextInt();
		if (a > b && a > c) {
			System.out.print("A is the biggest number");
		} else if (a < b && b > c) {
			System.out.print("B is the biggest number");
		} else if (a < c && b < c) {
			System.out.print("C is the biggest nubmer");
		}
		input.close();
	}

}
