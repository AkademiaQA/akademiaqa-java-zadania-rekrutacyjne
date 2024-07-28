package pl.akademiaqa.zadania.zadanie29.solutions;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzSolution2 {

    public static List<String> generateFizzBuzz() {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
}
