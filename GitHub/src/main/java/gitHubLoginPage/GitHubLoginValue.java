package gitHubLoginPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by BELEE on 5/26/2017.
 */
public class GitHubLoginValue extends CommonAPI {
    @FindBy(how = How.CSS, using = "a.text-bold:nth-child(2)")
    WebElement signIn;
    @FindBy(how = How.CSS, using = "#login_field")
    WebElement userNameOremail;
    @FindBy(how = How.CSS, using = "#password")
    private WebElement password;
    @FindBy(how = How.CSS, using = ".btn.btn-primary.btn-block")
    WebElement clickSignInButton;

    public void accessMyGithubLoginInfo(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signIn.click();
        userNameOremail.sendKeys("beleedey@hotmail.com");
        password.sendKeys("");
        clickSignInButton.click();
    }
}
