package pl.akademiaqa.zadania.zadanie17.solutions;

public class ArrayUtilsSolution1 {

    public static boolean containsTwoElements(int[] array, int element1, int element2) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null");
        }

        boolean foundElement1 = false;
        boolean foundElement2 = false;

        for (int num : array) {
            if (num == element1) {
                foundElement1 = true;
            }
            if (num == element2) {
                foundElement2 = true;
            }
            if (foundElement1 && foundElement2) {
                return true;
            }
        }

        return false;
    }
}
