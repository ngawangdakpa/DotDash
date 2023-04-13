package objects;

import common.CommonActions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FloatingMenu {
    CommonActions actions;
    Actions actions1;

    public FloatingMenu(WebDriver driver){
        PageFactory.initElements(driver, this);
        actions = new CommonActions(driver);
        actions1 = new Actions(driver);
    }

    @FindBy(linkText = "Floating Menu")
    WebElement floatingMenu;
    public void clickFloatingMenuAndSrcollEnd(){
        actions.click(floatingMenu);
        actions1.keyDown(Keys.ENTER).sendKeys(Keys.END).perform();
    }
    @FindBy(xpath = "//a[text()='Home']")
    WebElement homeFloatingMenu;
    public void floatingMenuValidate(){
        Assert.assertTrue(homeFloatingMenu.isDisplayed(),"Home menu is not displayed");
    }

}
