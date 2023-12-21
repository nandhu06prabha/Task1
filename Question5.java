package task1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the amount :");
		int amount = obj.nextInt();
		double discount = 0;
		if (amount <= 500) {
			System.out.println("No discount" + "final amount is :" + amount);
		} else if (amount > 500 && amount < 1000) {
			discount = amount * 0.1;
			System.out.println("10% discount" + "final amount is :" + (amount - discount));
		} else {
			discount = amount * 0.2;
			System.out.println("20% discount" + "final amount is :" + (amount - discount));
		}
	}
}
