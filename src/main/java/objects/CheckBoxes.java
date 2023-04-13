package objects;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckBoxes {

    public CommonActions actions;
    public CheckBoxes(WebDriver driver){
        PageFactory.initElements(driver, this);
        actions = new CommonActions(driver);
    }

    @FindBy(linkText = "Checkboxes")
    WebElement checkBoxeButton;

    @FindBy(tagName = "h3")
    WebElement checkBoxeTitle;
    public void clickCheckBoxes(){
        actions.click(checkBoxeButton);
    }

    public void validateCheckBoxTitle(String expected){
        actions.validate(checkBoxeTitle,expected);
    }

    @FindBy (xpath = "//input[@type='checkbox']//preceding-sibling::input[@type='checkbox']")
    WebElement checkBox1;
    @FindBy (xpath = "//input[@type='checkbox']//following-sibling::input[@type='checkbox']")
    WebElement checkBox2;
    public void checkBox2Check(){
        Assert.assertTrue(checkBox2.isSelected(),"CheckBox is not selected");
        Assert.assertFalse(checkBox1.isSelected(),"Checkbox 1 is selected");
    }

    public void checkCheckBox1AndValidate(){
        actions.click(checkBox1);
        Assert.assertTrue(checkBox1.isSelected(),"CheckBox 1 is not selected");
    }

}
