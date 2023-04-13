package objects;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControls {
    CommonActions actions;
    public DynamicControls(WebDriver driver){
        PageFactory.initElements(driver,this);
        actions = new CommonActions(driver);
    }

    @FindBy(linkText = "Dynamic Controls")
    WebElement dynamicControls;

    public void clickDynamicControls(){
        actions.click(dynamicControls);
    }

    @FindBy(xpath = "//button[text()='Remove']")
    WebElement removeBtn;
    @FindBy(xpath = "//button[text()='Add']")
    WebElement addBtn;
    @FindBy(xpath = "//p[@id='message']")
    WebElement message;
    public void clickRemoveBtnAndAssert(String expected){
        actions.click(removeBtn);
        actions.validate(message,expected);
    }

    public void clickAddBtnAndAssert(String expected){
        actions.click(addBtn);
        actions.validate(message,expected);
    }

    @FindBy(xpath = "//button[text()='Enable']")
    WebElement enableBtn;

    @FindBy(xpath = "//button[text()='Disable']")
    WebElement disableBtn;

    public void clickEnableBtnAndAssert(String expected){
        actions.click(enableBtn);
        actions.validate(message,expected);
    }
    public void clickDisableBtnAndAssert(String expected){
        actions.click(disableBtn);
        actions.validate(message,expected);
    }



}
