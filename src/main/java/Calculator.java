import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

    public static Logger logger = LoggerFactory.getLogger("Calculator");

    public int sum(int a, int b) {
        logger.info("This is inside Calculator.sum()");
        return a + b;
    }
}
