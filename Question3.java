package task1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		int reversed = 0;
		while (num != 0) {

			int digit = num % 10;
			reversed = reversed * 10 + digit;

			num /= 10;
		}

		System.out.println(reversed);
	}
}
