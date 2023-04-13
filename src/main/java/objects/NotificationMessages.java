package objects;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationMessages {
    CommonActions actions;
    public NotificationMessages(WebDriver driver){
        PageFactory.initElements(driver, this);
        actions = new CommonActions(driver);
    }
    @FindBy(linkText = "Notification Messages")
    WebElement notificationMessages;
    public void clickNotificationMessages(){
        actions.click(notificationMessages);
    }
    @FindBy(linkText = "Click here")
    WebElement clickHereLink;
    @FindBy(id = "flash-messages")
    WebElement message;
    public void clickOnClickHere(){
        for (int i = 0; i<10;i++){
            actions.click(clickHereLink);
            System.out.println(message.getText());
        }
    }
}
