package homePage;

import base.CommonAPI;
import loginPage.LoginValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

/**
 * Created by BELEE on 5/23/2017.
 */
public class HomePage extends CommonAPI {
    @FindBy (how = How.XPATH, using = ".//*[@id='mynetwork-nav-item']/a/span[2]")
            public static WebElement myNetworkTab;

    public WebElement getMyNetworkTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return myNetworkTab;
    }
    //Tesst -1 Verifying error message with Invalid login information
    public void enteringInvalidLoginData(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        LoginValue loginValue = PageFactory.initElements(driver, LoginValue.class);
        loginValue.enterYourLoginValue("invalid@gmail.com", "abc1234");
        String actualError = driver.findElement(By.cssSelector("#control_gen_1>p>strong")).getAttribute("innerHTML");
        String expectedError = "There were one or more errors in your submission. Please correct the marked fields below.";
        Assert.assertEquals(actualError, expectedError);
        System.out.println("Printing Actual Error from the site :: " +actualError);
    }
    //Tesst -2  Login with valid information
    public void accessMyLoginValue(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        LoginValue loginValue = PageFactory.initElements(driver, LoginValue.class);
        loginValue.myLikedInLogin();
    }
    //Test -3 Cliking on Mynetwork Tab after logging in
    public void clickOnMyNetworkTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        accessMyLoginValue();
        getMyNetworkTab().click();
    }
}
