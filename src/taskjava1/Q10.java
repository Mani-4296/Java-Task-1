package taskjava1;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int num= scanner.nextInt();
scanner.close();
int count = 0;
int tempnum = num;
while(tempnum !=0) {
	tempnum /= 10;
    count++;
}
System.out.println("Number of digits in " + num + " is: " + count);
}
	}

