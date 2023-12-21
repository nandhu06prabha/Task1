package task1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		if (num > 0) {
			System.out.println("The number is positive.");
		}

		else if (num < 0) {
			System.out.println("The number is negative.");
		}

		else {
			System.out.println("The number is zero.");
		}
	}
}
