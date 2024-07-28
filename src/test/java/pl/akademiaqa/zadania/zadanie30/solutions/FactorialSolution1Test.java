package pl.akademiaqa.zadania.zadanie30.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FactorialSolution1Test {

    @Test
    void test_calculate_factorial_of_zero() {
        long result = FactorialSolution1.calculateFactorial(0);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void test_calculate_factorial_of_one() {
        long result = FactorialSolution1.calculateFactorial(1);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void test_calculate_factorial_of_five() {
        long result = FactorialSolution1.calculateFactorial(5);
        assertThat(result).isEqualTo(120);
    }

    @Test
    void test_calculate_factorial_of_ten() {
        long result = FactorialSolution1.calculateFactorial(10);
        assertThat(result).isEqualTo(3628800);
    }

    @Test
    void test_calculate_factorial_with_negative_number() {
        assertThatThrownBy(() -> FactorialSolution1.calculateFactorial(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Liczba nie może być ujemna");
    }
}
