package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseClass {
    protected WebDriver driver;
    protected LoginSuccess loginSuccess;
    protected CheckBoxes checkBoxes;
    protected ContextMenu contextMenu;
    protected DragAndDrop dragAndDrop;
    protected DropDown dropDown;
    protected DynamicContent dynamicContent;
    protected DynamicControls dynamicControls;
    protected DynamicLoading dynamicLoading;
    protected FileDownload fileDownload;
    protected FileUpload fileUpload;
    protected FloatingMenu floatingMenu;
    protected Frame frame;
    protected Hovers hovers;
    protected JavaScriptAlerts javaScriptAlerts;
    protected Alert alert;
    protected JavaScriptError javaScriptError;
    protected MultipleWindow multipleWindow;
    protected NotificationMessages notificationMessages;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("http://localhost:7080/");
        initPages(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void initPages (WebDriver driver){
        loginSuccess = new LoginSuccess(driver);
        checkBoxes = new CheckBoxes(driver);
        contextMenu = new ContextMenu(driver);
        dragAndDrop = new DragAndDrop(driver);
        dropDown = new DropDown(driver);
        dynamicContent = new DynamicContent(driver);
        dynamicControls = new DynamicControls(driver);
        dynamicLoading = new DynamicLoading(driver);
        fileDownload = new FileDownload(driver);
        fileUpload = new FileUpload(driver);
        floatingMenu = new FloatingMenu(driver);
        frame = new Frame(driver);
        hovers = new Hovers(driver);
        javaScriptAlerts = new JavaScriptAlerts(driver);
        javaScriptError = new JavaScriptError(driver);
        multipleWindow = new MultipleWindow(driver);
        notificationMessages = new NotificationMessages(driver);

    }

    @AfterMethod
    public void tearUp(){
        driver.quit();
    }
}
