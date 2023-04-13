package objects;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DragAndDrop {

    CommonActions actions;
    Actions action;

    public DragAndDrop(WebDriver driver){
        PageFactory.initElements(driver, this);
        actions = new CommonActions(driver);
        action = new Actions(driver);
    }

    @FindBy(linkText = "Drag and Drop")
    WebElement dragAndDropButton;

    public void clickDragAndDropBtn(){
        actions.click(dragAndDropButton);
    }

    @FindBy(id = "column-a")
    WebElement sourceLocator;

    @FindBy(id = "column-b")
    WebElement targetLocator;

    public void dragAndDropTask() throws InterruptedException {
        String target = targetLocator.getText();
        action.dragAndDrop(sourceLocator,targetLocator).build().perform();
        Thread.sleep(3000);
        Assert.assertEquals(target,targetLocator.getText());
    }


}
