package loginPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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
        email.sendKeys("your email address");
        password.sendKeys("your password");
        signIn.click();
    }
}
// This method will ask for credention in Test page