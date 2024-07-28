package pl.akademiaqa.zadania.zadanie10.solutions;

public class ArrayUtilsSolution1 {

    public static int[] findMinAndMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być null ani pusta");
        }

        int min = array[0];
        int max = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[]{min, max};
    }
}
