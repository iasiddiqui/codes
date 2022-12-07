import java.util.Scanner;

public class SwapNumberWithoutUsingVariable {
	public static void swap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("number before swap\nnum1="+num1+"\nnum2="+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("number after swap\nnum1="+num1+"\nnum2="+num2);
		sc.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap();

	}

}
