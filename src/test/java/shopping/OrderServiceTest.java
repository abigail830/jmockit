package shopping;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import mockit.Verifications;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OrderServiceTest {

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

        //when
        final boolean result = orderService.submitOrder(testBuyerId, testItemId);

        //then
        assertTrue(result);

    }
}