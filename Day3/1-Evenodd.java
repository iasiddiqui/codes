
import java.util.Scanner;

class Check {
	int number;

	public void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		number = sc.nextInt();
	}

	public void isOdd() {
		if (number % 2 == 0) {
			System.out.println("Given number is Even");
		} else {
			System.out.println("Given number is Odd");
		}
	}
}

public class IsEven {
	public static void main(String[] args) {
		Check ob = new Check();
		ob.getData();
		ob.isOdd();
	}
}
