package objects;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptAlerts {
    CommonActions actions;
    JavascriptExecutor js;
    public JavaScriptAlerts(WebDriver driver){
        PageFactory.initElements(driver,this);
        actions = new CommonActions(driver);
        js = (JavascriptExecutor) driver;
    }
    @FindBy(linkText = "JavaScript Alerts")
    WebElement javaScriptAlerts;
    public void clickJavaScriptAlerts(){
        actions.click(javaScriptAlerts);
    }
    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    WebElement clickForJSAlertBtn;
    public void clickOnClickForJSAlertBtn(){
        js.executeScript("arguments[0].click();",clickForJSAlertBtn);
    }
    @FindBy(xpath = "//button[text()='Click for JS Confirm']")
    WebElement clickForJSConfirmBtn;
    public void clickOnClickForJSConfirm(){
        js.executeScript("arguments[0].click();",clickForJSConfirmBtn);
    }
    @FindBy(xpath = "//button[text()='Click for JS Prompt']")
    WebElement clickForJSPromptBtn;
    public void clickOnClickForJSPromptBtn(){
        js.executeScript("arguments[0].click();",clickForJSPromptBtn);
    }
    @FindBy(xpath = "//p[@id='result']")
    WebElement result;
    public void validateResult(String expected){
        actions.validate(result,expected);
    }

}
