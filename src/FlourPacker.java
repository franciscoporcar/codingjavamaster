public class FlourPacker {
    public  boolean canPack (int bigCount, int smallCount, int goal) {

        if ((bigCount < 0 || smallCount < 0 || goal < 0) ||
                ( bigCount*5+smallCount < goal ) )
            return false;
        if ( (bigCount == 0 && smallCount == 0 && goal == 0) ||
                (bigCount*5+smallCount == goal ) )
            return true;
        if (bigCount*5+smallCount > goal ) {

            int aux_smallCount= smallCount;
            int aux_bigCount= bigCount;

            while ( ( aux_bigCount*5 + aux_smallCount > goal ) && aux_bigCount >= 0 ) {
                while (( ( aux_bigCount*5 + aux_smallCount ) > goal ) && aux_smallCount > 0 ){
                    aux_smallCount--;
                }
                if ( aux_bigCount*5+aux_smallCount == goal ) return true;
                aux_bigCount--;
                aux_smallCount= smallCount;
            }
            if ( aux_bigCount*5+aux_smallCount == goal ) return true;

        }

        return false;

    }
}
