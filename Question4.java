package task1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();
		
		if(a<=b && a<=c)
            System.out.println("a is smallest");
        if(b<=a && b<=c)
            System.out.println("b is smallest");
        if(c<=a && c<=b)
            System.out.println("c is smallest");
}
}
