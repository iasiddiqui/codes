
class Operation{
	int num1;
	int num2;
	Operation(int num1,int num2){
		this.num1=num1;
		this.num2=num2;		
	}
	void addition() {
		int ans=num1+num2;
		System.out.println("addition of "+num1+" and "+" = "+ans);
	}
	void subtraction() {
		int ans=num1-num2;
		System.out.println("subtraction of "+num1+" and "+" = "+ans);
	}
	void multiplication() {
		int ans=num1*num2;
		System.out.println("multiplication of "+num1+" and "+" = "+ans);
	}
	void division() {
		int ans=num1/num2;
		System.out.println("Division of "+num1+" and "+" = "+ans);
	}
}

public class ThisKeyWord{

	public static void main(String[] args) {
		Operation obj=new Operation(10,5);
		obj.addition();
		obj.subtraction();
		obj.multiplication();
		obj.division();

	}

}
