

// User function Template for Java

class PrimeNumber {
    static void isPrime(int n) {
       
         if(n<2){
            System.out.println("No");
            return;
        }
        for (int i = 2; i*i <=n; i++) {

            if(n%i==0){
                 System.out.println("No");
                 return;
            }
        }
        System.out.println("Yes");
    }

}
