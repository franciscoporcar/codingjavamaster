public class printFactors {
    public static void printFactors(int n) {
        if (n < 1) System.out.println("Invalid Value");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.println(i);
        }
    };
    public static int getGreatestCommonDivisor( int a, int b) {

        if (a < 10 || b < 10 )  System.out.println("Invalid Value");
        int first = (a < b) ? a : b;
        int second = (a < b) ? b : a;
        //int firstFactor=1;
        int greatestFactor=1;
        for (int i = 1; i <= first; i++)
            if ( (first % i == 0) && (second % i == 0) )
                greatestFactor = i;
        return greatestFactor;
    }
}
