package objects;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDown {

    CommonActions actions;
    Select select;
    public DropDown(WebDriver driver){
        PageFactory.initElements(driver, this);
        actions = new CommonActions(driver);
    }

    @FindBy(linkText = "Dropdown")
    WebElement dropdown;

    public void clickDropdown(){
        actions.click(dropdown);
    }
    @FindBy(xpath = "//h3[text()='Dropdown List']")
    WebElement dropDownTitle;

    public void validateDropdownTitle(String expected){
        actions.validate(dropDownTitle,expected);
    }
    @FindBy(xpath = "//select[@id='dropdown']")
    WebElement dropDownList;
    public void dropDownSelect(){
        select = new Select(dropDownList);
        select.selectByVisibleText("Option 1");
        select.selectByVisibleText("Option 2");
    }


}
