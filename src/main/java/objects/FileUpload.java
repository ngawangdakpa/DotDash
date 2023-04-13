package objects;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FileUpload {
    CommonActions actions;

    public FileUpload(WebDriver driver) {
        PageFactory.initElements(driver,this);
        actions = new CommonActions(driver);
    }
    @FindBy(linkText = "File Upload")
    WebElement fileUpload;

    public void clickFileUpload(){
        actions.click(fileUpload);
    }
    @FindBy (id = "file-upload")
    WebElement chooseFileBtn;

    public void upLoadFile(){
        chooseFileBtn.sendKeys("C:\\Users\\NGAWANG DAKPA\\Downloads\\some-file (6).txt");
    }
    @FindBy(id = "file-submit")
    WebElement upLoadBtn;
    public void upLoadBtnClick(){
        actions.click(upLoadBtn);
    }
    @FindBy(tagName = "h3")
    WebElement fileUploadedTitle;
    public void validateTitle(String expected){
        Assert.assertEquals(fileUploadedTitle.getText(),expected);
    }

}
