package task1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = n; j >= 1; j--) {
				if ((i + j) > n)
					System.out.print(j);
				else
					System.out.print(n - i);
			}
			System.out.println();
		}
	}
}
