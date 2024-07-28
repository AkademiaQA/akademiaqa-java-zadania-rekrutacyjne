package pl.akademiaqa.zadania.zadanie21.solutions;

public class ArrayUtilsSolution2 {

    // Użycie licznika zer
    public static void segregateZerosAndOnes(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        int zeroCount = 0;

        // Liczymy liczbę zer w tablicy
        for (int num : array) {
            if (num == 0) {
                zeroCount++;
            }
        }

        // Ustawiamy odpowiednią liczbę zer na początku tablicy
        for (int i = 0; i < zeroCount; i++) {
            array[i] = 0;
        }

        // Ustawiamy jedynki w pozostałej części tablicy
        for (int i = zeroCount; i < array.length; i++) {
            array[i] = 1;
        }
    }
}
