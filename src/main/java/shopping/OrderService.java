package shopping;

public class OrderService {


    MailService mailService;

    UserCheckService userCheckService;


    public OrderService(MailService mailService, UserCheckService userCheckService) {
        this.mailService = mailService;
        this.userCheckService = userCheckService;
    }

    public boolean submitOrder(long buyerId, long itemId) {

        if (!userCheckService.check(buyerId)) {
            return false;
        }

        submit();

        if (!this.mailService.sendMail(buyerId, "下单成功")) {
            return false;
        }
        return true;
    }

    void submit(){
        System.out.println("This is in submit process.");
    }
}
