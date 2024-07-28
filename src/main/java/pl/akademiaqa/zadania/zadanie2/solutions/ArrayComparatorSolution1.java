package pl.akademiaqa.zadania.zadanie2.solutions;

public class ArrayComparatorSolution1 {

    public static boolean areFirstAndLastElementsEqual(int[] array1, int[] array2) {
        if (array1 == null || array1.length == 0 || array2 == null || array2.length == 0) {
            throw new IllegalArgumentException("Tablice nie mogą być puste");
        }

        return array1[0] == array2[0] && array1[array1.length - 1] == array2[array2.length - 1];
    }
}
