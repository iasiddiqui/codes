import java.util.Scanner;

class BinaryAdditionDemo{
   // int bin1,bin2;
    int i,carry;
    int[] sum = new int[10];
    public void biAddition(){
        Scanner sc = new Scanner(System.in);
        int[] sum = new int[10];
        System.out.print("Enter two binary number : ");
        int bin1 = sc.nextInt();
        int bin2 = sc.nextInt();
        while(bin1!=0||bin2!=0){
            sum[i] = ((bin1%10+bin2%10+carry)%2);
            i++;
            carry =((bin1%10+bin2%10+carry)/2);
            bin1 = bin1/10;
            bin2 = bin2/10;
        }
        if(carry != 0){
            sum[i] = carry;
            i++;
        }
        System.out.println("Sum of two binary number is : ");
        i--;
        while(i>=0){
            System.out.println(sum[i]);
            i--;
        }
    }
}
public class BinaryAddition{
    public static void main(String[] args){
        BinaryAdditionDemo ob = new BinaryAdditionDemo();
    }
}
