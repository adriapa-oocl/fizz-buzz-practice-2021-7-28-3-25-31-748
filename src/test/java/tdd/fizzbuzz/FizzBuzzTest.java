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
}
