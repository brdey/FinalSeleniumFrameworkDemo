package homePage;

import base.CommonAPI;
import loginPage.LoginValue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
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
    public void accessMyLoginValue(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        LoginValue loginValue = PageFactory.initElements(driver, LoginValue.class);
        loginValue.myLikedInLogin();
    }
    public void clickOnMyNetworkTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        accessMyLoginValue();
        getMyNetworkTab().click();
    }
    //Tesst -3 Invalid login information
    public void enteringInvalidLoginData(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        LoginValue loginValue = PageFactory.initElements(driver, LoginValue.class);
        loginValue.enterYourLoginValue("invalid@gmail.com", "abc1234");
    }
}
