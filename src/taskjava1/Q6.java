package taskjava1;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to check factorial: ");
        int a = scanner.nextInt();
        scanner.close();
        long factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + a + " = " + factorial);
	}

}
