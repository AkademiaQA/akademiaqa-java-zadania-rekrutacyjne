package pl.akademiaqa.zadania.zadanie5.solutions;

public class ArraySwapperSolution1 {

    public static void swapFirstAndLast(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Tablica musi zawierać co najmniej dwa elementy");
        }

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }
}
