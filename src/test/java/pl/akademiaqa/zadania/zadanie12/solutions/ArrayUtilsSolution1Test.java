package pl.akademiaqa.zadania.zadanie12.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.Set;

class ArrayUtilsSolution1Test {

    @Test
    void test_find_common_elements_with_common_chars() {
        char[] array1 = {'a', 'b', 'c', 'd'};
        char[] array2 = {'c', 'd', 'e', 'f'};
        Set<Character> result = ArrayUtilsSolution1.findCommonElements(array1, array2);
        assertThat(result).containsExactlyInAnyOrder('c', 'd');
    }

    @Test
    void test_find_common_elements_with_no_common_chars() {
        char[] array1 = {'a', 'b', 'c'};
        char[] array2 = {'d', 'e', 'f'};
        Set<Character> result = ArrayUtilsSolution1.findCommonElements(array1, array2);
        assertThat(result).isEmpty();
    }

    @Test
    void test_find_common_elements_with_empty_array1() {
        char[] array1 = {};
        char[] array2 = {'a', 'b', 'c'};
        Set<Character> result = ArrayUtilsSolution1.findCommonElements(array1, array2);
        assertThat(result).isEmpty();
    }

    @Test
    void test_find_common_elements_with_empty_array2() {
        char[] array1 = {'a', 'b', 'c'};
        char[] array2 = {};
        Set<Character> result = ArrayUtilsSolution1.findCommonElements(array1, array2);
        assertThat(result).isEmpty();
    }

    @Test
    void test_find_common_elements_with_both_arrays_empty() {
        char[] array1 = {};
        char[] array2 = {};
        Set<Character> result = ArrayUtilsSolution1.findCommonElements(array1, array2);
        assertThat(result).isEmpty();
    }

    @Test
    void test_find_common_elements_with_null_array1() {
        char[] array1 = null;
        char[] array2 = {'a', 'b', 'c'};
        assertThatThrownBy(() -> ArrayUtilsSolution1.findCommonElements(array1, array2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablice nie mogą być null");
    }

    @Test
    void test_find_common_elements_with_null_array2() {
        char[] array1 = {'a', 'b', 'c'};
        char[] array2 = null;
        assertThatThrownBy(() -> ArrayUtilsSolution1.findCommonElements(array1, array2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablice nie mogą być null");
    }

    @Test
    void test_find_common_elements_with_null_both_arrays() {
        char[] array1 = null;
        char[] array2 = null;
        assertThatThrownBy(() -> ArrayUtilsSolution1.findCommonElements(array1, array2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Tablice nie mogą być null");
    }

    @Test
    void test_find_common_elements_with_identical_chars() {
        char[] array1 = {'a', 'b', 'c'};
        char[] array2 = {'a', 'b', 'c'};
        Set<Character> result = ArrayUtilsSolution1.findCommonElements(array1, array2);
        assertThat(result).containsExactlyInAnyOrder('a', 'b', 'c');
    }
}
