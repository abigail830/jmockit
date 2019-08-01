import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoClass {

    public static Logger logger = LoggerFactory.getLogger("DemoClass");

    public boolean managerResponse(String question) {
        final boolean result = AppManager.isResponsePositive(question);
        if(result){
            logger.info("managerResponse: Bingo!");
        }else{
            logger.info("managerResponse: wrong!");
        }
        return result;
    }

    public String calculatorResponse(int a, int b){
        int result = new Calculator().sum(a, b);
        if(result>=10){
            return "outside range";
        }else {
            return "within range";
        }
    }

}
