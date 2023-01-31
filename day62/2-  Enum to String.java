 //Enum to String
import java.io.*;

// Enum
enum Fruits {
	Orange,
	Apple,
	Banana,
	Mango;
}


class Enumm {
  
	public static void main(String[] args) {
    
		System.out.println(Fruits.Orange.name());
		System.out.println(Fruits.Apple.name());
		System.out.println(Fruits.Banana.name());
		System.out.println(Fruits.Mango.name());
	}
}
