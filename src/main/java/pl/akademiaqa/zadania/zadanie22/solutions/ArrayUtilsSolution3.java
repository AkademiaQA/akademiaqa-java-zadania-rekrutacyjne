package pl.akademiaqa.zadania.zadanie22.solutions;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayUtilsSolution3 {

    //  Użycie klasy IntSummaryStatistics
    public static List<Integer> findNumbersGreaterThanAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być null lub pusta");
        }

        IntSummaryStatistics stats = IntStream.of(array).summaryStatistics();
        double average = stats.getAverage();

        List<Integer> result = new ArrayList<>();
        for (int num : array) {
            if (num > average) {
                result.add(num);
            }
        }

        return result;
    }
}
