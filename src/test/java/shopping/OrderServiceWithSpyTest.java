package shopping;

import mockit.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OrderServiceWithSpyTest {

    @Tested
    OrderService orderService;

    long testBuyerId = 123456l;
    long testItemId = 456789l;

    @Test
    public void submitOrder(@Injectable final MailService mailService, @Injectable final UserCheckService userCheckService) {
        //given
        new Expectations(){{
           mailService.sendMail(testBuyerId, anyString);
           result = true;

           userCheckService.check(testBuyerId);
           result = true;
        }};
        new MockUp<OrderService>(OrderService.class){
            @Mock
            void submit(){
                System.out.println("This is in mock submit process");
            }
        };

        //when
        final boolean result = orderService.submitOrder(testBuyerId, testItemId);

        //then
        assertTrue(result);


    }
}