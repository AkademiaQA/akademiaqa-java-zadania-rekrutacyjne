package pl.akademiaqa.zadania.zadanie8.solutions;

public class ArraySumSolution2 {

    // Pętla for
    public static int sumArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
}
