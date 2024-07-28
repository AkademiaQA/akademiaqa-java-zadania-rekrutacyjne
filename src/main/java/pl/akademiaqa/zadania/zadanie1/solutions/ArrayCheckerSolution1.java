package pl.akademiaqa.zadania.zadanie1.solutions;

public class ArrayCheckerSolution1 {

    public static boolean isFirstAndLastElementSame(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być pusta");
        }

        return array[0] == array[array.length - 1];
    }
}
