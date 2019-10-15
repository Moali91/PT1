package logic;

public class LeapYear {

    public static boolean leapYear(int year) {
        // TODO Implement the method

        boolean itsLeap = year%4!=0||(year%100==0&&year%400!=0) ? false : true;


//        if(year % 4 != 0){
//            itsLeap = false;
//        }else if(year%100==0 && year%400!=0){
//            itsLeap=false;
//        }else{
//            itsLeap=true;
//        }

        return itsLeap;
    }
}
