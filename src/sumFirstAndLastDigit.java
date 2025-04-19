public class sumFirstAndLastDigit {
    public static int sumFirstAndLastDigit(int number) {

        if (number < 0)
            return -1;
        else {

            int firstDigit = number % 10;
            int lastDigit;

            do {
                lastDigit = number % 10;
                number /= 10;
            } while (number != 0);

            return firstDigit + lastDigit;
        }
    }
    public static int getEvenDigitSum(int number){
        if (number < 0) return -1;
        int sum = 0;
        while (number != 0) {
             if (number % 2 == 0) sum += number%10 ;
             number /= 10;
        };
        return sum;
    }
}
