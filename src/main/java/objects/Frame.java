package objects;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frame {
    CommonActions actions;
    public Frame(WebDriver driver){
        PageFactory.initElements(driver, this);
        actions = new CommonActions(driver);
    }
    @FindBy(linkText = "Frames")
    WebElement frames;
    public void clickFrames(){
        actions.click(frames);
    }
    @FindBy(xpath = "//a[text()='iFrame']")
    WebElement iFrame;
    public void clickIFrame(){
        actions.click(iFrame);
    }
    @FindBy(xpath = "//button[@type='button' and @class='tox-notification__dismiss tox-button tox-button--naked tox-button--icon']")
    WebElement popUp;
    public void closePopUp(){
        actions.click(popUp);
    }
    @FindBy(xpath = "//p[text()='Your content goes here.']")
    WebElement content;
    public void writeContent(){
        content.clear();
    }

}
