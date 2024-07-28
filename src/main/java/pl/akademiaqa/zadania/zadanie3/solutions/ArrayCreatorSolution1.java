package pl.akademiaqa.zadania.zadanie3.solutions;

public class ArrayCreatorSolution1 {

    public static int[] createArrayFromFirstAndLast(int[] array1, int[] array2) {
        if (array1 == null || array1.length == 0 || array2 == null || array2.length == 0) {
            throw new IllegalArgumentException("Tablice nie mogą być puste");
        }

        int[] resultArray = new int[2];
        resultArray[0] = array1[0];
        resultArray[1] = array2[array2.length - 1];

        return resultArray;
    }
}
