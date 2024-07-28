package pl.akademiaqa.zadania.zadanie8.solutions;

public class ArraySumSolution1 {

    // Pętla for-each
    public static int sumArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return sum;
    }
}
