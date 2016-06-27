package Task07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cards = new Scanner(System.in);
		System.out.println("Choose your card");
		String a = cards.nextLine();
		switch (a) {
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "10":
		case "J":
		case "Q":
		case "K":
		case "A":
			System.out.print("Valid card");
			break;
		}
		System.out.print("Invalid card");

	}

}
