package pl.akademiaqa.zadania.zadanie9.solutions;

public class ArrayUtilsSolution1 {

    public static int[] removeElement(int[] array, int element) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        // Liczenie wystąpień elementu do usunięcia
        int count = 0;
        for (int num : array) {
            if (num == element) {
                count++;
            }
        }

        // Jeśli nie znaleziono elementu, zwróć oryginalną tablicę
        if (count == 0) {
            return array;
        }

        // Tworzenie nowej tablicy o odpowiednim rozmiarze
        int[] newArray = new int[array.length - count];
        int index = 0;
        for (int num : array) {
            if (num != element) {
                newArray[index++] = num;
            }
        }

        return newArray;
    }
}
