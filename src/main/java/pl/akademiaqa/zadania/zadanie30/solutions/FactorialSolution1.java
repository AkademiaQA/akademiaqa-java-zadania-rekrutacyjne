package pl.akademiaqa.zadania.zadanie30.solutions;

public class FactorialSolution1 {

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Liczba nie może być ujemna");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
