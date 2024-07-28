package pl.akademiaqa.zadania.zadanie10.solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayUtilsSolution3 {

    // Collections.min(list) i Collections.max(list);
    public static int[] findMinAndMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być null ani pusta");
        }

        List<Integer> list = Arrays.asList(Arrays.stream(array).boxed().toArray(Integer[]::new));
        int min = Collections.min(list);
        int max = Collections.max(list);

        return new int[]{min, max};
    }
}
