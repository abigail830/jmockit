import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class AppManager {
    public static Logger logger = LoggerFactory.getLogger("AppManager");

    public static boolean isResponsePositive(String value) {
        logger.info("This is inside AppManager.isResponsePositive()");

        if (value == null) {
            return false;
        }
        int length = value.length();
        int randomNumber = randomNumber();
        return length == randomNumber ? true : false;
    }

    private static int randomNumber() {
        logger.info("This is inside AppManager.randomNumber()");
        return new Random().nextInt(7);
    }
}