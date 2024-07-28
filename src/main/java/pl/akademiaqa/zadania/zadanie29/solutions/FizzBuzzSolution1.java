package pl.akademiaqa.zadania.zadanie29.solutions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzSolution1 {

    public static List<String> generateFizzBuzz() {
        return IntStream.rangeClosed(1, 100)
                .mapToObj(i -> {
                    if (i % 15 == 0) {
                        return "FizzBuzz";
                    } else if (i % 3 == 0) {
                        return "Fizz";
                    } else if (i % 5 == 0) {
                        return "Buzz";
                    } else {
                        return String.valueOf(i);
                    }
                })
                .collect(Collectors.toList());
    }
}
