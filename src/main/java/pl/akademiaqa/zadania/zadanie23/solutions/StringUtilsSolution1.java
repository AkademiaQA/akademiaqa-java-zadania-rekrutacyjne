package pl.akademiaqa.zadania.zadanie23.solutions;

public class StringUtilsSolution1 {

    public static char getCharacterAtIndex(String str, int index) {
        if (str == null) {
            throw new IllegalArgumentException("String nie może być null");
        }
        if (index < 0 || index >= str.length()) {
            throw new IndexOutOfBoundsException("Index jest poza zakresem");
        }

        return str.charAt(index);
    }
}
