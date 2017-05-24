package loginPageTest;

import base.CommonAPI;
import loginPage.LoginValue;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by BELEE on 5/23/2017.
 */
public class LoginPageTest extends CommonAPI {
    @Test
    public void goToLoginPage(){
        LoginValue loginValue = PageFactory.initElements(driver, LoginValue.class);
        loginValue.myLikedInLogin();
    }
}
