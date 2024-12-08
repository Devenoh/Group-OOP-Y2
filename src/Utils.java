/*
*Utils.java
@author Aaron Tracey
*16/11/2024
*/

import java.text.NumberFormat;
import java.text.ParsePosition;

public class Utils {
    public static boolean isNumeric(String str) {  /* This uses parsing to check if a string is numeric */
        ParsePosition pos = new ParsePosition(0);
        NumberFormat.getInstance().parse(str, pos);
        return str.length() == pos.getIndex();
    }
}
