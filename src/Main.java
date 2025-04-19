public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //prueba = new isPalindrome();
        //prueba.setPalindrome(15);
        isPalindrome.isPalindrome(151);
        isPalindrome.isPalindrome(0);
        isPalindrome.isPalindrome(100);
        isPalindrome.isPalindrome(-110011);
        isPalindrome.isPalindrome(122221);
        isPalindrome.isPalindrome(-1223221);
        System.out.println( "sumFirstAndLastDigit(-3) =  " + sumFirstAndLastDigit.sumFirstAndLastDigit(-3) ) ;
        System.out.println( "sumFirstAndLastDigit(0) =  " + sumFirstAndLastDigit.sumFirstAndLastDigit(0) ) ;
        System.out.println( "sumFirstAndLastDigit(5) =  " + sumFirstAndLastDigit.sumFirstAndLastDigit(5) ) ;
        System.out.println( "sumFirstAndLastDigit(15) =  " + sumFirstAndLastDigit.sumFirstAndLastDigit(15) ) ;
        System.out.println( "sumFirstAndLastDigit(151) =  " + sumFirstAndLastDigit.sumFirstAndLastDigit(151) ) ;
        System.out.println( "sumFirstAndLastDigit(253) =  " + sumFirstAndLastDigit.sumFirstAndLastDigit(253) ) ;
        System.out.println( "sumFirstAndLastDigit(112157) =  " + sumFirstAndLastDigit.sumFirstAndLastDigit(112157) ) ;


        System.out.println( "getEvenDigitSum(-3) =  " + sumFirstAndLastDigit.getEvenDigitSum(-3) ) ;
        System.out.println( "getEvenDigitSum(0) =  " + sumFirstAndLastDigit.getEvenDigitSum(0) ) ;
        System.out.println( "getEvenDigitSum(5) =  " + sumFirstAndLastDigit.getEvenDigitSum(5) ) ;
        System.out.println( "getEvenDigitSum(15) =  " + sumFirstAndLastDigit.getEvenDigitSum(15) ) ;
        System.out.println( "getEvenDigitSum(12541) =  " + sumFirstAndLastDigit.getEvenDigitSum(12541) ) ;
        System.out.println( "getEvenDigitSum(253) =  " + sumFirstAndLastDigit.getEvenDigitSum(253) ) ;
        System.out.println( "getEvenDigitSum(112157) =  " + sumFirstAndLastDigit.getEvenDigitSum(112157) ) ;

        System.out.println( "asSharedDigit(2,42)=  " + hasSharedDigit.hasSharedDigit(2,42) ) ;
        System.out.println( "asSharedDigit(33,42)=  " + hasSharedDigit.hasSharedDigit(33,42) ) ;
        System.out.println( "asSharedDigit(112,43)=  " + hasSharedDigit.hasSharedDigit(112,43) ) ;

        System.out.println( "asSharedDigit(112,43)=  " + hasSharedDigit.hasSharedDigit(112,423) ) ;
        System.out.println( "asSharedDigit(20,82 )=  " + hasSharedDigit.hasSharedDigit(20,82 ) ) ;
        System.out.println( "asSharedDigit(12,82 )=  " + hasSharedDigit.hasSharedDigit(12,82 ) ) ;

        System.out.println( "hasSameLastDigit.hasSameLastDigit(12,82, 13) =  " + hasSameLastDigit.hasSameLastDigit(12,82, 13) ) ;
        System.out.println( "hasSameLastDigit.hasSameLastDigit(13, 12,83 ) =  " + hasSameLastDigit.hasSameLastDigit(13, 12,83 ) ) ;
        System.out.println( "hasSameLastDigit.hasSameLastDigit(9,82,999 ) =  " + hasSameLastDigit.hasSameLastDigit(9,82,999 ) ) ;
        System.out.println( "hasSameLastDigit.hasSameLastDigit(1000,10,999 ) =  " + hasSameLastDigit.hasSameLastDigit(1000,10,999 ) ) ;
        System.out.println( "hasSameLastDigit.hasSameLastDigit(1001,82,999 )  =  " + hasSameLastDigit.hasSameLastDigit(1001,82,999 ) ) ;

        System.out.println( "printFactors(6)");
        printFactors.printFactors(6);
        System.out.println( "printFactors.getGreatestCommonDivisor(60, 90)=" + printFactors.getGreatestCommonDivisor(60, 90));
        System.out.println( "printFactors.getGreatestCommonDivisor(25, 15)=" + printFactors.getGreatestCommonDivisor(25, 15));
        System.out.println( "printFactors.getGreatestCommonDivisor(12, 30)=" + printFactors.getGreatestCommonDivisor(12, 30));
        System.out.println( "printFactors.getGreatestCommonDivisor(81, 153)=" + printFactors.getGreatestCommonDivisor(81, 153));

        PerfectNumber pefectNumber = new PerfectNumber();
        System.out.println("PefectNumber(0)" + pefectNumber.isPerfectNumber(0) );
        System.out.println("PefectNumber(1)" + pefectNumber.isPerfectNumber(1 ) );
        System.out.println("PefectNumber(6)" + pefectNumber.isPerfectNumber(6) );
        System.out.println("PefectNumber(9)" + pefectNumber.isPerfectNumber(9) );
        System.out.println("PefectNumber(100)" + pefectNumber.isPerfectNumber(100) );
        System.out.println("PefectNumber(28)" + pefectNumber.isPerfectNumber(28) );

        NumberToWords numberToWords = new NumberToWords();
        numberToWords.numberToWords(-1);
        numberToWords.numberToWords(0);
        numberToWords.numberToWords(1);
        numberToWords.numberToWords(7);
        numberToWords.numberToWords(102);
        numberToWords.numberToWords(900);
        numberToWords.numberToWords(-123);
        numberToWords.numberToWords(123);
        numberToWords.numberToWords(987000);
        numberToWords.numberToWords(80000);

        FlourPacker flourPacker = new FlourPacker();
        System.out.println( "camParck(0,0,0)" + flourPacker.canPack(0,0,0) );
        System.out.println( "camParck(0,-9,0)" + flourPacker.canPack(0,-9,0) );
        System.out.println( "camParck(1,0,4)" + flourPacker.canPack(1,0,4) );
        System.out.println( "camParck(1,0,5)" + flourPacker.canPack(1,0,5) );
        System.out.println( "camParck(0,5,4)" + flourPacker.canPack(0,5,4) );
        System.out.println( "camParck(2,2,11)" + flourPacker.canPack(2,2,11) );

        LargestPrime largestPrime = new LargestPrime();
        System.out.println( "LargestPrime(-3)" + largestPrime.getLargestPrime(-3) );
        System.out.println( "LargestPrime(0)" + largestPrime.getLargestPrime(0) );
        System.out.println( "LargestPrime(1)" + largestPrime.getLargestPrime(1) );
        System.out.println( "LargestPrime(21)" + largestPrime.getLargestPrime(21) );
        System.out.println( "LargestPrime(217)" + largestPrime.getLargestPrime(217) );
        System.out.println( "LargestPrime(45)" + largestPrime.getLargestPrime(45) );

        DiagonalStar diagonalStar = new DiagonalStar();
        diagonalStar.printSquareStar(4);
        diagonalStar.printSquareStar(5);
        diagonalStar.printSquareStar(8);
        diagonalStar.printSquareStar(20);

        /*
        InputCalculator inputCalculator = new InputCalculator();
        inputCalculator.inputThenPrintSumAndAverage();
        */
        /*
            getBucketCount(-3.4, 2.1, 1.5); → should return -1 since the width parameter is invalid

    getBucketCount(3.4, 2.1, 1.5); → should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.

    getBucketCount(7.25, 4.3, 2.35); → should return 14 since the wall area is 31.175, and a single bucket can cover an area of 2.35.
         */
        System.out.println("PaintJob.getBucketCount(3.4, 2.1, 1.5, 2)= " + PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println("PaintJob.getBucketCount(2.75, 3.25, 2.5, 1)= " + PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println("PaintJob.getBucketCount(3.4, 2.1, 1.5)= " + PaintJob.getBucketCount(3.4, 2.1, 1.5));
        System.out.println("PaintJob.getBucketCount(7.25, 4.3, 2.35)= " + PaintJob.getBucketCount(7.25, 4.3, 2.35));
        System.out.println("PaintJob.getBucketCount(3.4, 1.5)= " + PaintJob.getBucketCount(3.4, 1.5));
        System.out.println("PaintJob.getBucketCount(6.26, 2.26)= " + PaintJob.getBucketCount(6.26, 2.26));
        System.out.println("PaintJob.getBucketCount(3.26, 0.75)= " + PaintJob.getBucketCount(3.26, 0.75));
        System.out.println("Hello I am here and I am going to do itrrrrrrrrrrrrrrrrraaaaaaaaadddddaaaqaaaaaaaaaaaaaaaaaaaa");
        // 3.4, 1.5
        // 6.26, 2.26
        // 3.26, 0.75

    }
}