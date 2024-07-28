package pl.akademiaqa.zadania.zadanie13.solutions;

public class ArrayUtilsSolution1 {

    public static int findSecondLargest(int[] array) {

        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Tablica nie może być null i musi zawierać co najmniej dwa elementy");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Tablica musi zawierać co najmniej dwa unikalne elementy");
        }

        return secondLargest;
    }
}
