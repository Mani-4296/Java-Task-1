package taskjava1;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
        String word = scanner.nextLine();
        scanner.close();
        int b = word.length();
        System.out.println("Lenght of the given string is: " + b);
        
        
	}

}
