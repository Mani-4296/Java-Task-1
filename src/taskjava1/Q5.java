package taskjava1;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to check if it is prime: ");
        int a = scanner.nextInt();
        scanner.close();
        boolean isPrime = true;
        if(a<=1) {
        	isPrime = false;
        }else
        {
        	for(int i=2; i<=Math.sqrt(a); i++) {
        		if(a % i ==0) {
        			isPrime = false;
        			break;
        		}
        	}
        }
        if (isPrime) {
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " is not a prime number.");
        
	}
	}
	}
