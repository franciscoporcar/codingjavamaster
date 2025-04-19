public class hasSameLastDigit {


    public static boolean isValid(int a) {
        return (a>=10 && a<=1000);
    }

    public static boolean hasSameLastDigit (int a, int b, int c){

        class isValidAll{
            /*boolean isValid(int a){
                return (a>=10 && a<=1000);
            }*/
            boolean sameRightDigit(int a, int b){
                return (a%10 == b%10);
            }
            boolean sameDigit(int a, int b, int c){
                return sameRightDigit(a,b) || sameRightDigit(b,c) || sameRightDigit(a,c);
            }
        }


        isValidAll isValidAll = new isValidAll();
        return  ( isValid(a) &&
                  isValid(b) &&
                  isValid(c) ) &&
                isValidAll.sameDigit(a,b,c);
    }
}
