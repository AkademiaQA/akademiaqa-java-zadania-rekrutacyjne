package pl.akademiaqa.zadania.zadanie30.solutions;

public class FactorialSolution2 {

    // Rekurencyjne rozwiązanie zadania
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Liczba nie może być ujemna");
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * calculateFactorial(n - 1);
    }
}
