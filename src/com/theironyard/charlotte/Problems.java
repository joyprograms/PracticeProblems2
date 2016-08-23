package com.theironyard.charlotte;

/**
 * Created by meekinsworks on 8/21/16.
 */
public class Problems {

    public static int oneSumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum = sum * 2;
        }
        return sum;

    }

    public static boolean twosleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public static boolean threeMonkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;


    }

    public static int fourDiff21(int n) {
        if (n <= 21) {
            return n - 21;
        } else {
            return (n - 21) * 2;
        }
    }

    public static boolean fiveInTrouble(boolean talking, int hour) {
        return (talking && (7 > hour || hour > 20));
    }


    public static String sixHelloName(String name) {
        String greeting = "Hello " + name + "!";

        return greeting;
    }

    public static String sevenMakeAbba(String a, String b) {
// separate hi from bye
// add string one to string two  to string one
// send return
        return a + b + b + a;
    }

    public static String eightMakeTags(String tag, String word) {
        return "<" + tag + ">" + word + "<" + "/" + tag + ">";
    }

    public static String nineMakeOutWord(String out, String word) {
        String a = out.substring(0, 2);
        String b = out.substring(2, 4);
        return a + word + b;

    }

    //
    public static boolean tenNearHundred(int n) {
        if (Math.abs((100 >= (n - 10) <= 200))) {
            return true;
        }

    }
}







