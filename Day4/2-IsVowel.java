import java.util.Scanner;

class Check01{
    public void find(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}

public class IsVowel {
    public static void main(String[] args) {
        Check01 ob = new Check01();
        ob.find();
    }
}
