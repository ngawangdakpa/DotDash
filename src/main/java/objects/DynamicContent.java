package objects;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DynamicContent {

    CommonActions actions;
    public DynamicContent(WebDriver driver){
        PageFactory.initElements(driver, this);
        actions = new CommonActions(driver);
    }

    @FindBy(linkText = "Dynamic Content")
    WebElement dynamicContent;

    public void clickDynamicContent(){
        actions.click(dynamicContent);
    }

    @FindBy(linkText = "click here")
    WebElement clickHere;

    @FindBy(xpath = "//img[@src='/img/avatars/Original-Facebook-Geek-Profile-Avatar-1.jpg']//following::div[@class='large-10 columns']//following::div[@class='large-10 columns']")
    WebElement thirdAvatar;
    public void clickRefreshBtn() throws InterruptedException {
        String beforeRefreshText = thirdAvatar.getText();
        actions.click(clickHere);
        Thread.sleep(3000);
        Assert.assertFalse(beforeRefreshText==thirdAvatar.getText(),"The doesnt changes on each refresh");

    }

}
