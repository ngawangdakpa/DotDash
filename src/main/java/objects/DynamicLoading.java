package objects;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoading {
    CommonActions actions;
    public DynamicLoading(WebDriver driver){
        PageFactory.initElements(driver,this);
        actions = new CommonActions(driver);
    }

    @FindBy(linkText = "Dynamic Loading")
    WebElement dynamicLoading;
    public void clickDynamicLoading(){
        actions.click(dynamicLoading);
    }
    @FindBy(linkText = "Example 1: Element on page that is hidden")
    WebElement elementOnPageThatIsHidden;

    public void clickelementOnPageThatIsHidden(){
        actions.click(elementOnPageThatIsHidden);
    }
    @FindBy(xpath = "//button[text()='Start']")
    WebElement start;
    public void clickStartBtn(){
        actions.click(start);
    }
    @FindBy(xpath = "//h4[text()='Hello World!']")
    WebElement helloWorld;
    public void helloWorldText(String expected){
        actions.validate(helloWorld,expected);
    }

}
