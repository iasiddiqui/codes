import java.util.Scanner;
class PerimeterOfRectangle
{
   public static void main(String args[]) 
    {   
       
      	 Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the length of the Rectangle:");
         
	 double l= s.nextDouble();
	 
	 System.out.println("Enter the width of the Rectangle:");
         
	 double b= s.nextDouble();
          
         double  perimeter=2*(l+b);
      
	 System.out.println("perimeter of Rectangle is: " + perimeter);      
   }
}
