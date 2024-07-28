package pl.akademiaqa.zadania.zadanie21.solutions;

public class ArrayUtilsSolution1 {

    public static void segregateZerosAndOnes(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            while (array[left] == 0 && left < right) {
                left++;
            }
            while (array[right] == 1 && left < right) {
                right--;
            }
            if (left < right) {
                array[left] = 0;
                array[right] = 1;
                left++;
                right--;
            }
        }
    }
}
