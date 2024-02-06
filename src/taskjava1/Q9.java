package taskjava1;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Name: ");
        String Name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.close();
        if(age>60) {
        	
        System.out.println(Name + "is a senior citizen");
        }else {
        	System.out.println(Name + " is not a senior citizen");
        }

	}

}
