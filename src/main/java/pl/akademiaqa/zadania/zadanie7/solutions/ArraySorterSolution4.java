package pl.akademiaqa.zadania.zadanie7.solutions;

import java.util.stream.IntStream;

public class ArraySorterSolution4 {

    // Rozwiązanie z Stream.sorted()
    public static int[] sortArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        return IntStream.of(array).sorted().toArray();
    }
}
