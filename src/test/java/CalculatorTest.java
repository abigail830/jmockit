import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void test_sum() {
        //given
        final Calculator calculator = new Calculator();

        //when
        final int result = calculator.sum(1, 2);

        //then
        assertEquals(3, result);
    }
}