package loginPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by BELEE on 5/23/2017.
 */
public class LoginValue extends CommonAPI {
    @FindBy(how = How.ID, using = "login-email")
    WebElement email;
    @FindBy(how = How.ID, using = "login-password")
    private WebElement password;
    @FindBy(how = How.ID, using = "login-submit")
    WebElement signIn;

    public void myLikedInLogin() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        email.sendKeys("beleedey@hotmail.com");
        password.sendKeys("your password");
        signIn.click();
    }
    public void enterYourLoginValue(String uEmail, String uPassword) {
        email.sendKeys(uEmail);
        password.sendKeys(uPassword);
        signIn.click();
    }
}
