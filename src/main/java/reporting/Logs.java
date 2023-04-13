package reporting;

import com.aventstack.extentreports.Status;
import org.testng.Reporter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Logs {
    static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void log(String msg){
        logger.log(Level.INFO, msg);
        Reporter.log(msg+"<br>");
//        ExtentReporting.extentTest.log(Status.INFO, msg);
    }
}
