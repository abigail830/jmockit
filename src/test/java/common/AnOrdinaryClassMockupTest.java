package common;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AnOrdinaryClassMockupTest {

    //WARNING: fake for private method AnOrdinaryClass#privateMethod()I found; such fakes will no longer be supported
    @Test
    public void testPrivate1() {

        new MockUp<AnOrdinaryClass>(AnOrdinaryClass.class) {
            @Mock
            private int privateMethod() {
                return 50;
            }
        };

        AnOrdinaryClass instance = new AnOrdinaryClass();

        // private方法被mock了
        assertTrue(instance.callPrivateMethod() == 50);
    }

    @Test
    public void testPrivate2() {

        class MockAnOrdinary extends MockUp<AnOrdinaryClass>{
            @Mock
            private int privateMethod() {
                return 60;
            }
        }
        new MockAnOrdinary();

        AnOrdinaryClass instance = new AnOrdinaryClass();

        // private方法被mock了
        assertTrue(instance.callPrivateMethod() == 60);
    }
}