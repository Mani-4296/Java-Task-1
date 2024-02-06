package taskjava1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value1: ");
        int a = scanner.nextInt();
		System.out.print("Enter value2: ");
        int b = scanner.nextInt();
scanner.close();
System.out.println("\nThe original number are:");
System.out.println("First value is- " + a);
System.out.println("Second value is- " + b);
int c = a;
a = b;
b = c;
System.out.println("\nSwapped numbers:");
System.out.println("First number: " + a);
System.out.println("Second number: " + b);

	}

}
