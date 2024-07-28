package pl.akademiaqa.zadania.zadanie30;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class FactorialTest {

    @Test
    void test_calculate_factorial_of_zero() {
        long result = Factorial.calculateFactorial(0);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void test_calculate_factorial_of_one() {
        long result = Factorial.calculateFactorial(1);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void test_calculate_factorial_of_five() {
        long result = Factorial.calculateFactorial(5);
        assertThat(result).isEqualTo(120);
    }

    @Test
    void test_calculate_factorial_of_ten() {
        long result = Factorial.calculateFactorial(10);
        assertThat(result).isEqualTo(3628800);
    }

    @Test
    void test_calculate_factorial_with_negative_number() {
        assertThatThrownBy(() -> Factorial.calculateFactorial(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Liczba nie może być ujemna");
    }
}
