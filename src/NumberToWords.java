public class NumberToWords {

    public  void numberToWords(int number){

        if(number <0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        int reverse = reverse(number);
        int numbers = getDigitCount( reverse );


        // Escribo los ceros que hubiera


        // Escfribo el resto de números
        int printNumber=0;
        for (int i = numbers; i > 0; i--) {
            printNumber = reverse% 10;
            reverse /= 10;
            switch ( printNumber ) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid number");
            }
        }

        int diff = getDigitCount(number) -  numbers;
        while (diff > 0) {
            System.out.println("Zero");
            diff--;
        }



    }

    public  int getDigitCount(int num){

        if (num == 0) return 1;
        if (num < 0) return -1;

        int i = 0;
        while (num != 0) {
            num = num / 10;
            i++;
        }
        return i;
    }

    public  int reverse(int num){
        int res = 0;
        int negative;
        negative = (num < 0 ? -1 : 1) ;
        while (num != 0) {
            res = res * 10 + num % 10;
            num /= 10;
        }
        return ( negative * res) ;
    }



}
