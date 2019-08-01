import mockit.*;
import org.junit.Test;

import static org.junit.Assert.*;

//**
// @Injectable 也是告诉 JMockit生成一个Mocked对象，但@Injectable只是针对其修饰的实例，而@Mocked是针对其修饰类的所有实例。
// 此外，@Injectable对类的静态方法，构造函数没有影响。因为它只影响某一个实例嘛！
//
public class DemoClassWithMockTest {

    @Mocked
    Calculator mockCalculator;

    @Tested
    private DemoClass demoClass;

    @Test
    public void test_managerResponse_mock_isResponsePositive() {

        // mock up for static method
        new MockUp<AppManager>() {
            @Mock
            public boolean isResponsePositive(String value) {
                return false;
            }
        };
        assertFalse(demoClass.managerResponse("Some string..."));
    }

    @Test
    public void test_calculatorResponse_with_mocked_calculator() {

        //mockup normal method
        new Expectations(){{
            mockCalculator.sum(anyInt, anyInt);
            result = 11;
            times =1;
        }};

        //when
        final String result = demoClass.calculatorResponse(10, 1);

        //then
        assertEquals("outside range", result);
    }

}