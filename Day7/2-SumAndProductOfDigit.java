package lab.com;
import java.util.Scanner;

public class SumAndProductOfDigit {
	public static int takeInput() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		//System.out.println("enter any string");
		//String str =sc.nextLine();
		//System.out.print(str);
		
		sc.close();
		return num;
		
	}
	public static void sumOfDigit(int num) {
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println("sum of given digit= "+sum);
	}
	public static void productOfDigit(int num) {
		int pro=1;
		while(num>0) {
			int rem=num%10;
			pro*=rem;
			num/=10;
		}
		System.out.println("product of given digit= "+pro);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =takeInput();
		//sumOfDigit(num);
		//productOfDigit(num);
		

	}

}

