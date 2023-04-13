package objects;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class FileDownload {
    CommonActions actions;
    public FileDownload(WebDriver driver){
        PageFactory.initElements(driver,this);
        actions = new CommonActions(driver);
    }
    @FindBy(linkText = "File Download")
    WebElement fileDownload;
    public void clickFileDownload(){
        actions.click(fileDownload);
    }
    @FindBy(linkText = "some-file.txt")
    WebElement fileName;
    public void clickOnFileToDownload() throws IOException {
        actions.click(fileName);
        Runtime.getRuntime().exec("D:\\SoftwareTestingMaterial\\AutoIt\\DownloadFile.exe");
    }

}
