// java program to reverse a word

import java.io.*;
import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {

        String str = "ISHAN", nstr = "";
        char ch;

        System.out.print("Original word: ");
        System.out.println("ISHAN"); // Example word

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); 
            nstr = ch + nstr; 
        }
        System.out.println("Reversed word: " + nstr);
    }
}
