package pl.akademiaqa.zadania.zadanie6.solutions;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayShifterSolution2 {

    public static void shiftLeft(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Tablica musi zawierać co najmniej dwa elementy");
        }

        int firstElement = array[0];
        ArrayUtils.shift(array, -1);
        array[array.length - 1] = firstElement;
    }
}
