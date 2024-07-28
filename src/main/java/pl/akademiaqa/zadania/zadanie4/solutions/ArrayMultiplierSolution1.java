package pl.akademiaqa.zadania.zadanie4.solutions;

public class ArrayMultiplierSolution1 {

    public static int[] multiplyCorrespondingElements(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            throw new IllegalArgumentException("Tablice nie mogą być null");
        }

        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Tablice muszą mieć taką samą długość");
        }

        int[] resultArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            resultArray[i] = array1[i] * array2[i];
        }

        return resultArray;
    }
}
