import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoClassTest {

    private DemoClass demoClass = new DemoClass();

    @Test
    public void test_calculatorResponse_without_mockit() {
        //when
        final String result = demoClass.calculatorResponse(10, 2);
        //then
        assertEquals("outside range", result);

    }


}