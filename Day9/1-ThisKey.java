
class Operation1{
	int num1;
	int num2;

	Operation1(int num1,int num2){
		this.num1=num1;
		this.num2=num2;		
	}
	void addition() {
		int ans=num1+num2;
		System.out.println("addition of "+num1+" and "+num2+ " = "+ans);
	}
	void subtraction() {
		int ans=num1-num2;
		System.out.println("subtraction of "+num1+" and "+num2+" = "+ans);
	}
	void multiplication() {
		int ans=num1*num2;
		System.out.println("multiplication of "+num1+" and "+num2+" = "+ans);
	}
	void division() {
		int ans=num1/num2;
		System.out.println("Division of "+num1+" and "+num2+" = "+ans);
	}
}

public class ThisKey{

	public static void main(String[] args) {
		Operation1 obj=new Operation1(10,5);
		obj.addition();
		obj.subtraction();
		obj.multiplication();
		obj.division();

	}

}
