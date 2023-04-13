package objects;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Hovers {
    CommonActions actions;
    Actions actions1;
    public Hovers(WebDriver driver){
        PageFactory.initElements(driver, this);
        actions = new CommonActions(driver);
        actions1 = new Actions(driver);
    }
    @FindBy (linkText = "Hovers")
    WebElement hovers;
    public void clickOnHovers(){
        actions.click(hovers);
    }

    @FindBy(xpath = "//div[@class='figure']//preceding-sibling::div[@class='figure']//preceding-sibling::div[@class='figure']")
    WebElement user1;
    public void hoverAction(String expected){
        String actual = user1.getText();
        actions1.moveToElement(user1).build().perform();
        Assert.assertTrue(expected.contains(actual));

    }


}
