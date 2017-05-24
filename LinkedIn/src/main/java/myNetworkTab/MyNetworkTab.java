package myNetworkTab;

import base.CommonAPI;
import homePage.HomePage;
import loginPage.LoginValue;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

/**
 * Created by BELEE on 5/23/2017.
 */
public class MyNetworkTab extends CommonAPI {
    public void goToMyNetworkPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnMyNetworkTab();
    }
}
