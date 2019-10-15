package array;


public class SameNumbers {

    public static boolean sameNumbers(int[] values1, int[] values2) {
        // TODO Implement the
        if(values1.length == 0 && values2.length == 0){ return true;}
        if(values1.length < 0 || values2.length < 0){ return false;}


        if(values1.length<values2.length){
            int[]valuesTemp = values1;
            values1 = values2;
            values2 = valuesTemp;
        }

        boolean check = false;
        for(int i = 0; i<values1.length; i++){
            check = false;
            for (int j = 0; j<values2.length; j++){
                if(values1[i]==values2[j]){
                    check = true;
                    break;
                }
            }
            if(check == false){
                return false;
            }
        }
        return check;
    }
}




//        for (int n : values1) {
//            for (int i = 0; i < values2.length; i++) {
//                values2[i] = n == values2[i] ? -1 : values2[i];
//            }
//        }
//        for (int j : values2) {
//            if (j != -1) return false;
//        }