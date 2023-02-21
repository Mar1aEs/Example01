package all.strings.easy;
//endsLy
/*
Given a string, return true if it ends in "ly".
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
*/

public class EndsLy {
    public static boolean endsLy(String str) {
        boolean endsInLy = false;

        if (str.length() >= 2 ){
            String endOfStr = str.substring((str.length()-2),str.length());
            if (endOfStr.equals("ly")) {
                endsInLy = true;
            }
        }

        return endsInLy;
    }
}
