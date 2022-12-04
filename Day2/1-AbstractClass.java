abstract class Area{
	
	abstract void area(int side);
	//Method OverLoading
	void area(int length,int width) {
		int ans=length*width;
		System.out.println("Area of rectangle is "+ans);
	}
	//Method OverLoading
	void area(double base,double height) {
	    double ans=(base*height)/2;
		System.out.println("Area of trangle is "+ans);
	}
	//Method OverLoading
	void area(double radius) {
		double ans=3.14*radius*radius;
		System.out.println("area of circle is "+ans);
	}
}
class AreaDemo extends Area{
	//Method Overriding
	void area(int side) {
		double ans=side*side;
		System.out.println("area of a Square "+ans);
		
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {

		AreaDemo obj=new AreaDemo();
		obj.area(10,20);
		obj.area(12.35,10.25);
		obj.area(10.45);
		obj.area(20);

	}

}
