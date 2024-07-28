package pl.akademiaqa.zadania.zadanie7.solutions;

public class ArraySorterSolution6 {

    // Sortowania przez wstawienie
    public static void sortArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = key;
        }
    }
}
