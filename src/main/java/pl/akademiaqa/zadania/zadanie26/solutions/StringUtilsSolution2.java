package pl.akademiaqa.zadania.zadanie26.solutions;

public class StringUtilsSolution2 {

    public static String reverseString(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String nie może być null");
        }
        if (str.length() <= 1) {
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
