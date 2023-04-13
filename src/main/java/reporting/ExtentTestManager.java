package reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentTestManager {
    public  static ExtentReports extentReports;

    public static synchronized ExtentReports initialExtentReports(){
        try {
            if (extentReports == null){
                extentReports = new ExtentReports();
                ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
                spark.config().setReportName("Dot Dash Automation");
                spark.config().setTheme(Theme.DARK);
                extentReports.attachReporter(spark);
                extentReports.attachReporter(spark);
                extentReports.setSystemInfo("Testing", "Regression");
                extentReports.setSystemInfo("Team", "QA - Avengers");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return extentReports;
    }


}
