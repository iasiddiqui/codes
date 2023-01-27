//Given a string str containing only lowercase letters, generate a string with the same letters, but in uppercase.



class Solution{
    String to_upper(String str) { 
        // code here
        StringBuilder S = new StringBuilder() ;
        for ( int i = 0 ; i < str.length() ; i++ ){
            int ch = str.charAt( i );
            ch -= 97 ;
            char c = ( char ) ( ch + 65 ) ; 
            S.append( c ) ;
        }
        return S.toString() ;
    }
} 
