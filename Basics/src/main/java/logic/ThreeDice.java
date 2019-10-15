package logic;

public class ThreeDice {

    public static int getNbrOfCombinations(int sum) {
        // TODO Implement the method
        int count = 0;
        if(sum<3 || sum>18){
            count =0;
        }
        else {
            for (int i = 1; i < 7; i++) {
                for (int j = 1; j < 7; j++) {
                    for (int k = 1; k < 7; k++) {
                        if(sum ==i+j+k){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
