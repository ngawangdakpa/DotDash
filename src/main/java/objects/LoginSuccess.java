package objects;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSuccess {

    CommonActions actions;

    public LoginSuccess(WebDriver driver){
        PageFactory.initElements(driver, this);
        actions = new CommonActions(driver);
    }

    @FindBy (xpath = "//a[text()='Form Authentication']")
    WebElement login;

    @FindBy (tagName = "h2")
    WebElement login_Title;

    @FindBy (id = "username")
    WebElement userName;

    @FindBy (id = "password")
    WebElement passWord;

    @FindBy (tagName = "button")
    WebElement loginButton;

    @FindBy (tagName = "h4")
    WebElement successTitle;

    @FindBy (id = "flash")
    WebElement failedTitle;
    public void clickLogin(){
        actions.click(login);
    }
    public void validateTitle(String expected){
        actions.validate(login_Title, expected);
    }

    public void insertValidUsername_Password_clickLogin(){
        actions.insert(userName, "tomsmith");
        actions.insert(passWord,"SuperSecretPassword!");
        actions.click(loginButton);
    }
    public void insertInValidUsername_Password_clickLogin(){
        actions.insert(userName, "tomsmith");
        actions.insert(passWord,"SuperSecret");
        actions.click(loginButton);
    }

    public void validateSuccessTitle(String expected){
        actions.validate(successTitle,expected);
    }

    public void validateInvalidTitle(String expected){
        actions.validate(failedTitle,expected);
    }



}
