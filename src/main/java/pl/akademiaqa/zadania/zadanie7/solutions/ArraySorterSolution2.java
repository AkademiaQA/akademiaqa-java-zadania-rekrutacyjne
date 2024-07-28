package pl.akademiaqa.zadania.zadanie7.solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySorterSolution2 {

    // Rozwiązanie z Collections.sort()
    public static void sortArray(Integer[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        List<Integer> list = Arrays.asList(array);
        Collections.sort(list);
        array = list.toArray(new Integer[0]);
    }
}
