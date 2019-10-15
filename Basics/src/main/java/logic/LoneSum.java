package logic;

public class LoneSum {

    public static int loneSum(int[] values) {
        // TODO Implement the method
        int sum =0;
        for(int i = 0; i< values.length; i++){
            boolean flag = false;
            for(int j=0;j<values.length; j++){
                if(i!=j){
                    if(values[i]==values[j]){
                        flag=true;
                    }
                }
            }
            if(!flag){
                sum+=values[i];
            }
        }
        return sum;
    }
}
