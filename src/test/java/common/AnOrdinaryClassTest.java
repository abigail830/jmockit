package common;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AnOrdinaryClassTest {

    @Test
    public void testMock() {

        final AnOrdinaryClass anOrdinaryClass = new AnOrdinaryClass();

        new Expectations(AnOrdinaryClass.class) {
            {
                // mock静态方法
                AnOrdinaryClass.staticMethod();
                result = 10;
                // mock普通方法
                anOrdinaryClass.commonPublicMethod();
                result = 20;
                // mock final方法
                anOrdinaryClass.finalMethod();
                result = 30;
                // native, private方法无法用Expectations来Mock
            }
        };

        //when
        AnOrdinaryClass instance = new AnOrdinaryClass();

        //then
        assertTrue(AnOrdinaryClass.staticMethod() == 10);
        assertTrue(instance.commonPublicMethod() == 20);
        assertTrue(instance.finalMethod() == 30);
        assertTrue(instance.callPrivateMethod() == 4);
    }
}