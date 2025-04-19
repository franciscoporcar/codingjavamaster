public class hasSharedDigit {

    public static boolean hasSharedDigit(int a, int b) {

        class check {

            boolean hasNumber2(int num, int x) {
                do {
                    int digita = x % 10;
                    if (digita == num) return true;
                    x = x / 10;
                } while (x > 0);
                return false;
            }

            boolean hasAnyNumber(int y, int x) {
                while (y > 0 ) {
                    int digita = y % 10;
                    if ( hasNumber2(digita, x)) return true;
                    y = y / 10;
                };
                return false;
            }
        }




        /*interface check2 {
            abstract boolean hasNumber2(int x);
        }

        check2 check2a = new check2() {
            public boolean hasNumber2(int x) {
                do {
                    int digita = x % 10;
                    if (digita == 2) return true;
                    x = x / 10;
                } while (x > 0);
                return false;
            }
        };*/

        check valida = new check();

        //if (  (a<10 || a>99) || (b<10 || b>99) ) { //|| (!check2a.hasNumber2(a))  || (!check2a.hasNumber2(b)) ) {
        if ( ( (a<10 || a>99) || (b<10 || b>99) ) || ( !valida.hasAnyNumber(a,b))  ) {
            return false;
        } else {
            return true;
        }
    }


}
