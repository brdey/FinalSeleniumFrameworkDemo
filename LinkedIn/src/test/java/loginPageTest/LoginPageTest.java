package loginPageTest;

import base.CommonAPI;
import homePage.HomePage;
import loginPage.LoginValue;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by BELEE on 5/23/2017.
 */
public class LoginPageTest extends CommonAPI {
    @Test
    public void goToLoginPage(){
        ApplicationLog.epicLogger("Epic: LoginPageTest AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.accessMyLoginValue();
    }
}
