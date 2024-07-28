package pl.akademiaqa.zadania.zadanie29.solutions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzSolution2Test {

    @Test
    void test_generate_fizz_buzz_size() {
        List<String> result = FizzBuzzSolution2.generateFizzBuzz();
        assertThat(result).hasSize(100);
    }

    @Test
    void test_generate_fizz_buzz_first_element() {
        List<String> result = FizzBuzzSolution2.generateFizzBuzz();
        assertThat(result.get(0)).isEqualTo("1");
    }

    @Test
    void test_generate_fizz_buzz_third_element() {
        List<String> result = FizzBuzzSolution2.generateFizzBuzz();
        assertThat(result.get(2)).isEqualTo("Fizz");
    }

    @Test
    void test_generate_fizz_buzz_fifth_element() {
        List<String> result = FizzBuzzSolution2.generateFizzBuzz();
        assertThat(result.get(4)).isEqualTo("Buzz");
    }

    @Test
    void test_generate_fizz_buzz_fifteenth_element() {
        List<String> result = FizzBuzzSolution2.generateFizzBuzz();
        assertThat(result.get(14)).isEqualTo("FizzBuzz");
    }

    @Test
    void test_generate_fizz_buzz_fizz_elements() {
        List<String> result = FizzBuzzSolution2.generateFizzBuzz();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 15 != 0) {
                assertThat(result.get(i - 1)).isEqualTo("Fizz");
            }
        }
    }

    @Test
    void test_generate_fizz_buzz_buzz_elements() {
        List<String> result = FizzBuzzSolution2.generateFizzBuzz();
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 15 != 0) {
                assertThat(result.get(i - 1)).isEqualTo("Buzz");
            }
        }
    }

    @Test
    void test_generate_fizz_buzz_fizz_buzz_elements() {
        List<String> result = FizzBuzzSolution2.generateFizzBuzz();
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                assertThat(result.get(i - 1)).isEqualTo("FizzBuzz");
            }
        }
    }
}
