package string;

public class Arrow {


    public static String arrow(int length, boolean doubleEnded, boolean doubleLine) {
        // TODO Implement the method

        String arrow = "";

        if (length == 0) {

            return arrow;
        }

        String thickness = (doubleLine) ? "=" : "-";

        if (length > 0) {

            //<< >> < >
            //>> >
            String arrowHead = (doubleEnded) ? ">>" : ">";

            for (int i = 0; i < length; i++) {
                arrow += thickness; // arrow = arrow + thickness
            }
            arrow += arrowHead;
        }
        //<< <
        else {
            String leftHead = (doubleEnded) ? "<<" : "<";
            arrow += leftHead;
            for (int i = 0; i > length; i--) {
                arrow += thickness;
            }
        }
        return arrow;
    }
}