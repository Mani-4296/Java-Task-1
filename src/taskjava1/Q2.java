package taskjava1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value for 'a': ");
        int a = scanner.nextInt();
if(a%2==0) {
	System.out.println(a + " is an even number");
}
else {
	System.out.println(a + " is an odd numebr");
}
	}

}
