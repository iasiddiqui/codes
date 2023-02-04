/*
Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other.

Note :- If the strings are anagrams you have to return True or else return False

Example 1:

Input:a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have same characters with
        same frequency. So, both are anagrams.
*/

class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        if(a.length()!=b.length()){
            return false;
        }else{
            char[] A=a.toCharArray();
            char[] B=b.toCharArray();
            Arrays.sort(A);
            Arrays.sort(B);
            boolean result=Arrays.equals(A,B);
            if(result){
                return true;
            }
        }
        return false;
        
    }
}
