/*
Given a string S consisting of lowercase Latin Letters. Return the first non-repeating character in S. If there is no non-repeating character, return '$'.

Example 1:

Input:
S = hello
Output: h
Explanation: In the given string, the
first character which is non-repeating
is h, as it appears first and there is
no other 'h' in the string.
*/



//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        int maxChars = 256;
        
        //store each char count in a map
        char[] countArray = new char[maxChars];
        char[] d = S.toCharArray();
        
        for(int i=0; i< d.length; i++) {
            char c = S.charAt(i);
            countArray[c]++;
        }
        
        char valueToReturn = '$';
        
        //Traverse and check for count in count array
        for(int j = 0; j< d.length; j++) {
            if(countArray[S.charAt(j)] == 1) {
                valueToReturn = S.charAt(j);
                break;
            }
        }
        
        return valueToReturn;
        
    }
}
