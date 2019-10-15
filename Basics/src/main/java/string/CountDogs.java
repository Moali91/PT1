package string;

public class CountDogs {

    public static int countDogs(String input) {
        // TODO Implement the method
        String[] dogs = {"dog", "dag", "dug","deg","dig"};
        int count = 0;
        for(int i = 0; i<input.length()-2;i++){
            String str = input.substring(i,i+3);
            for(int j=0; j<dogs.length;j++){
                if (dogs[j].equals(str)) {
                    count++;
                }
            }
        }
        return count;
    }
}
