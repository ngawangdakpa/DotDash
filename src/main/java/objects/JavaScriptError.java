package objects;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptError {
    CommonActions actions;
    public JavaScriptError(WebDriver driver){
        PageFactory.initElements(driver,this);
        actions = new CommonActions(driver);
    }
    @FindBy(linkText = "JavaScript onload event error")
    WebElement javaScriptOnloadEventError;
    public void clickJavaScriptOnloadEventError(){
        actions.click(javaScriptOnloadEventError);
    }

}
