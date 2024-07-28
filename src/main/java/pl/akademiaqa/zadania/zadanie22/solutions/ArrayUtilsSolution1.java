package pl.akademiaqa.zadania.zadanie22.solutions;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtilsSolution1 {

    public static List<Integer> findNumbersGreaterThanAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być null lub pusta");
        }

        // Obliczanie sumy wszystkich liczb w tablicy
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // Obliczanie średniej
        double average = (double) sum / array.length;

        // Tworzenie listy do przechowywania liczb większych niż średnia
        List<Integer> result = new ArrayList<>();

        // Znajdowanie liczb większych niż średnia
        for (int num : array) {
            if (num > average) {
                result.add(num);
            }
        }

        return result;
    }
}
