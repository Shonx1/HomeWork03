package Task14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vuvedete N: ");
		int n = sc.nextInt();
		System.out.print("Vuvedete K: ");
		int k = sc.nextInt();
		int nfact = 1, kfact = 1;
		for (int i = 2; i <= n; i++) {
			nfact *= i;
		}
		for (int i = 2; i <= k; i++) {
			kfact *= i;
		}
		if (n > k && k > 1) {
			System.out.print(nfact / kfact);
		} else {
			System.out.print("Error");
		}

	}

}
