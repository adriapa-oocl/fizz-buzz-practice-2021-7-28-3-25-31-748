package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void should_return_order_number_when_count_off_given_normal_case() {
        //given
        String orderNumber = "1";
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.countOff(orderNumber);
        //then
        assertThat(result).isEqualTo("1");
    }

    @Test
    void should_return_order_number_when_count_off_given_count_off_is_divisible_by_3() {
        //given
        String orderNumber = "3";
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.countOff(orderNumber);
        //then
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void should_return_order_number_when_count_off_given_count_off_is_divisible_by_5() {
        //given
        String orderNumber = "5";
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.countOff(orderNumber);
        //then
        assertThat(result).isEqualTo("Buzz");
    }
}
