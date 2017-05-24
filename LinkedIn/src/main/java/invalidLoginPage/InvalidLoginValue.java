package invalidLoginPage;

import base.CommonAPI;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

/**
 * Created by BELEE on 5/24/2017.
 */
public class InvalidLoginValue extends CommonAPI {
    public void putInvalidValue() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.enteringInvalidLoginData();
    }
}
