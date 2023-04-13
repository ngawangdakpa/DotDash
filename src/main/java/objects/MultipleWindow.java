package objects;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleWindow {
    CommonActions actions;
    public MultipleWindow(WebDriver driver){
        PageFactory.initElements(driver,this);
        actions = new CommonActions(driver);
    }
    @FindBy(linkText = "Multiple Windows")
    WebElement multipleWindows;
    public void clickMultipleWindows(){
        actions.click(multipleWindows);
    }
    @FindBy(linkText = "Click Here")
    WebElement clickHere;
    public void clickOnClickHere(){
        actions.click(clickHere);
    }
    @FindBy(tagName = "h3")
    WebElement newWindow;
}
