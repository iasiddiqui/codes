
import java.util.Scanner;

class Check {
    public void find() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a', 'A':
                System.out.println("Vowel");
                break;
            case 'e', 'E':
                System.out.println("Vowel");
                break;
            case 'i', 'I':
                System.out.println("Vowel");
                break;
            case 'o', 'O':
                System.out.println("Vowel");
                break;
            case 'u', 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}

public class IsVowel {
    public static void main(String[] args) {
        Check ob = new Check();
        ob.find();
    }
}
