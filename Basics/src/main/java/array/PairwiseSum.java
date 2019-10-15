package array;

public class PairwiseSum {

    public static int[] pairwiseSum(int[] values) {
        // TODO Implement the method
        int[]res = new int[0];
        if(values.length>=2){
            res = new int[values.length-1];
        }

        for(int i = 0; i<values.length-1; i++){
            if(values.length>=2){
                res[i] = values[i]+values[i+1];
            }
        }
        return res;
    }
}
