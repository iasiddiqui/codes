abstract class Shape{
	public abstract void area();
	public abstract void perimeter();
	public abstract void display();
}
class Rectangle extends Shape{
	private double length;
	private double width;
	double area,peri;
	public Rectangle(double len,double wid) {
		length=len;
		width=wid;
	}

	@Override
	public void area() {
		area=length*width;		
	}

	@Override
	public void perimeter() {
		peri=2*(length+width);		
	}
	public void display() {
		System.out.println("Area of rectangle = "+area);
		System.out.println("Perimeter of Rectangle = "+peri);		
	}
	
}
class Circle extends Shape{
	double radius,area,peri;
	public Circle(double rad) {
		radius=rad;
	}

	@Override
	public void area() {
		area=3.14*radius*radius;		
	}

	@Override
	public void perimeter() {
		peri=2*3.14*radius;		
	}
	public void display() {
		System.out.println("Area of rectangle = "+area);
		System.out.println("Perimeter of Rectangle = "+peri);		
	}
	
}

public class AbstractCircleRectOperation {

	public static void main(String[] args) {
		Rectangle rec=new Rectangle(12.44,56.79);
		rec.area();
		rec.perimeter();
		rec.display();
		System.out.println("************");
		Circle cr=new Circle(15.25);
		cr.area();
		cr.perimeter();
		cr.display();

	}

}
