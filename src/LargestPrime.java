public class LargestPrime {

    /*
    public  boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    };
    */

    public  int getLargestPrime(int num) {




        boolean prime=true;

        if (num < 2) return -1;

        int result = -1;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {

                prime= true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) prime= false;
                }
                if (prime) result= i;

            }
        }

        return result;

    }

}
