package objects;

import common.CommonActions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenu {

    CommonActions actions;
    Actions actions1;
    public ContextMenu(WebDriver driver){
        PageFactory.initElements(driver, this);
        actions = new CommonActions(driver);
        actions1 = new Actions(driver);
    }

    @FindBy(linkText = "Context Menu")
    WebElement contextMenuButton;

    public void clickContextMenuBtn(){
        actions.click(contextMenuButton);
    }

    @FindBy(id = "hot-spot")
    WebElement rectangleSpace;

    public void rightClickOnRectangleSpace(){
        actions1.moveToElement(rectangleSpace).contextClick().build().perform();
    }

}
