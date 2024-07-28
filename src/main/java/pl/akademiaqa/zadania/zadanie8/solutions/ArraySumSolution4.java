package pl.akademiaqa.zadania.zadanie8.solutions;


public class ArraySumSolution4 {

    // Rekurencja
    public static int sumArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        return sumArrayRecursive(array, 0);
    }

    private static int sumArrayRecursive(int[] array, int index) {
        if (index == array.length) {
            return 0;
        }
        return array[index] + sumArrayRecursive(array, index + 1);
    }
}
