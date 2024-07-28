package pl.akademiaqa.zadania.zadanie26.solutions;

public class StringUtilsSolution1 {

    public static String reverseString(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String nie może być null");
        }

        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }
}
