/*
Given an array Arr of N positive integers, find the missing elements (if any) in the range 0 to max of Arri.

Example 1:

Input:
N = 5
Arr[] = {62, 8, 34, 5, 332}
Output: 0-4 6-7 9-33 35-61 63-331
Explanation: Elements in the range 0-4, 6-7, 9-33, 35-61 and 63-331 are not present.
*/

class Solution {
    String findMissing(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        String str="";
        if(arr[0]==0 && n==1){
            return "-1";
        }
        if(arr[0]==1 && n==1){
            return"0";
        }
        if(arr[0]!=0){
            int x=arr[0]-1;
            if(x>0){
                str+="0"+"-"+x+" ";
            }
        }
        if(arr[0]==1){
            str+="0"+" ";
        }
        for(int i=0;i<n-1;i++){
            int start=arr[i]+1;
            int end=arr[i+1]-1;
            if(start<end){
                str+=start+"-"+end+" ";
            }
            if(end==start){
                str+=end+" ";
            }
        }
        if(str==""){
            return "0";
        }
        return str;
    }
}
