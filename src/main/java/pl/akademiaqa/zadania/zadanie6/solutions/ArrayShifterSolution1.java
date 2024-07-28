package pl.akademiaqa.zadania.zadanie6.solutions;

public class ArrayShifterSolution1 {

    public static void shiftLeft(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Tablica musi zawierać co najmniej dwa elementy");
        }

        int firstElement = array[0];

        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }

        array[array.length - 1] = firstElement;
    }
}
