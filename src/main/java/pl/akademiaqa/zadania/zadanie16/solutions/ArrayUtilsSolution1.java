package pl.akademiaqa.zadania.zadanie16.solutions;

public class ArrayUtilsSolution1 {

    public static boolean isSumOfEveryThirdElementEqualToTen(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        int sum = 0;

        for (int i = 2; i < array.length; i += 3) {
            sum += array[i];
        }

        return sum == 10;
    }
}
