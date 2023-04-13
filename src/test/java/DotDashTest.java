import base.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class DotDashTest extends BaseClass {

    @Test (enabled = false)
    public void loginSuccessTest(){
        loginSuccess.clickLogin();
        loginSuccess.validateTitle("Login Page");
        loginSuccess.insertValidUsername_Password_clickLogin();
        loginSuccess.validateSuccessTitle("Welcome to the Secure Area. When you are done click logout below.");
    }
    @Test (enabled = false)
    public void loginFailTest(){
        loginSuccess.clickLogin();
        loginSuccess.validateTitle("Login Page");
        loginSuccess.insertInValidUsername_Password_clickLogin();
        loginSuccess.validateInvalidTitle("Your password is invalid!");
    }

    @Test (enabled = false)
    public void checkBoxTest(){
        checkBoxes.clickCheckBoxes();
        checkBoxes.validateCheckBoxTitle("Checkboxes");
        checkBoxes.checkBox2Check();
        checkBoxes.checkCheckBox1AndValidate();
    }

    @Test(enabled = false)
    public void contextMenuTest(){
        contextMenu.clickContextMenuBtn();
        contextMenu.rightClickOnRectangleSpace();
        alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"You selected a context menu");
    }

    @Test(enabled = false)
    public void dragAndDropTest() throws InterruptedException {
        dragAndDrop.clickDragAndDropBtn();
        dragAndDrop.dragAndDropTask();
    }

    @Test(enabled = false)
    public void dropDownTest(){
        dropDown.clickDropdown();
        dropDown.validateDropdownTitle("Dropdown List");
        dropDown.dropDownSelect();
    }

    @Test(enabled = false)
    public void dynamicContentTest() throws InterruptedException {
        dynamicContent.clickDynamicContent();
        dynamicContent.clickRefreshBtn();
    }

    @Test(enabled = false)
    public void dynamicControlsTest(){
        dynamicControls.clickDynamicControls();
        dynamicControls.clickRemoveBtnAndAssert("It's gone!");
        dynamicControls.clickAddBtnAndAssert("It's back!");
        dynamicControls.clickEnableBtnAndAssert("It's enabled!");
        dynamicControls.clickDisableBtnAndAssert("It's disabled!");
    }

    @Test(enabled = false)
    public void dynamicLoadingTest(){
        dynamicLoading.clickDynamicLoading();
        dynamicLoading.clickelementOnPageThatIsHidden();
        dynamicLoading.clickStartBtn();
        dynamicLoading.helloWorldText("Hello World!");

    }

    @Test(enabled = false)
    public void filedownloadTest() throws IOException {
        fileDownload.clickFileDownload();
        fileDownload.clickOnFileToDownload();
    }

    @Test(enabled = false)
    public void fileUploadTest(){
        fileUpload.clickFileUpload();
        fileUpload.upLoadFile();
        fileUpload.upLoadBtnClick();
        fileUpload.validateTitle("File Uploaded!");
    }

    @Test(enabled = false)
    public void floatingMenuTest(){
        floatingMenu.clickFloatingMenuAndSrcollEnd();
        floatingMenu.floatingMenuValidate();
    }
    @Test(enabled = false)
    public void framesTest(){
        frame.clickFrames();
        frame.clickIFrame();
        frame.closePopUp();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementByXpath('//p[text()='Your content goes here.']').value='Hello World';");
    }
    @Test(enabled = false)
    public void hoversTest(){
        hovers.clickOnHovers();
        hovers.hoverAction("user1");
    }
    @Test(enabled = false)
    public void javaScriptAlertsTest(){
        javaScriptAlerts.clickJavaScriptAlerts();
        javaScriptAlerts.clickOnClickForJSAlertBtn();
        alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"I am a JS Alert");
        alert.accept();
        javaScriptAlerts.clickOnClickForJSConfirm();
        alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"I am a JS Confirm");
        alert.accept();
        javaScriptAlerts.clickOnClickForJSPromptBtn();
        alert = driver.switchTo().alert();
        alert.sendKeys("DotDash");
        alert.accept();
        javaScriptAlerts.validateResult("You entered: DotDash");
    }
    @Test(enabled = false)
    public void javaScriptOnloadEventError(){
        javaScriptError.clickJavaScriptOnloadEventError();
        Assert.assertEquals(driver.getTitle(),"Page with JavaScript errors on load","Page doesnt have error");
        System.out.print("Page with JavaScript errors on load");
    }
    @Test(enabled = false)
    public void multipleWindowsTest(){
        multipleWindow.clickMultipleWindows();
        multipleWindow.clickOnClickHere();
        String parentWindow = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();
        Iterator<String >I1= s.iterator();
        while (I1.hasNext()){
            String childWindow = I1.next();
            if (!parentWindow.equals(childWindow)){
                driver.switchTo().window(childWindow);
            }
        }
       Assert.assertEquals(driver.getTitle(),"New Window", "Window is not Switched");
    }
    @Test(enabled = true)
    public void notificationMessagesTest(){
        notificationMessages.clickNotificationMessages();
        notificationMessages.clickOnClickHere();
    }
}
