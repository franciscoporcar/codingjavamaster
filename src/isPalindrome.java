public class isPalindrome {

     /*
    private int palindrome;
    private int palindromeUnsgined;
    private int reverse;


    public isPalindrome() {
        palindrome = 0;
    }

    public isPalindrome(int x) {
        palindrome = x;
    }

    void setPalindrome(int x) {
        palindrome = x;
        //return palindrome;
    }

    int getPalindrome() {
        return palindrome;
    }


    public boolean isPalindrome(int x) {

        palindrome = x;

        if (x < 0)
            palindromeUnsgined = x * -1;
        else
            palindromeUnsgined = x;

        if (x%10 == 0) {
            System.out.println(x + " is NOT a palindrome");
            return false;
        }
        else {
            reverse = 0;

            while ( Math.abs(x) > 0) {
                reverse = reverse * 10 + x % 10;
                x /= 10; // if x finish in zero it is number a palindrome

            }

            if (reverse == palindrome) {
                System.out.printf("The number %d  is a palindrome, his reverse is %d \n" , palindrome, reverse);
                return true;
            } else {
                System.out.printf("The number %d is NOT a palindrome, his reverse is %d \n" , palindrome, reverse);
                return false;
            }

        }
    }
    */

    public static boolean isPalindrome(int x) {

        int localpalindrome = x;
        int reverse;

        if (x%10 == 0) {
            System.out.println(x + " is NOT a palindrome");
            return false;
        }
        else {
            reverse = 0;

            while ( Math.abs(x) > 0) {
                reverse = reverse * 10 + x % 10;
                x /= 10; // if x finish in zero it is number a palindrome

            }

            if (reverse == localpalindrome) {
                System.out.printf("The number %d  is a palindrome, his reverse is %d \n" , localpalindrome, reverse);
                return true;
            } else {
                System.out.printf("The number %d is NOT a palindrome, his reverse is %d \n" , localpalindrome, reverse);
                return false;
            }

        }
    }



}
