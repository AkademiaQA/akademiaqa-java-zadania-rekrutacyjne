package pl.akademiaqa.zadania.zadanie4.solutions;

import java.util.stream.IntStream;

public class ArrayMultiplierSolution2 {

    public static int[] multiplyCorrespondingElements(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            throw new IllegalArgumentException("Tablice nie mogą być null");
        }

        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Tablice muszą mieć taką samą długość");
        }

        return IntStream.range(0, array1.length)
                .map(i -> array1[i] * array2[i])
                .toArray();
    }
}
