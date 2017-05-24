package invalidLoginTest;

import base.CommonAPI;
import homePage.HomePage;
import invalidLoginPage.InvalidLoginValue;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by BELEE on 5/24/2017.
 */
public class LoginWithInvalidValue extends CommonAPI {
    @Test
    public void testInvalidLogin() {
        ApplicationLog.epicLogger("Epic: LoginWithInvalidValue AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        InvalidLoginValue invalidLoginValue = PageFactory.initElements(driver, InvalidLoginValue.class );
        invalidLoginValue.putInvalidValue();
        String actualError = driver.findElement(By.cssSelector("#control_gen_1>p>strong")).getAttribute("innerHTML");
        String expectedError = "There were one or more errors in your submission. Please correct the marked fields below.";
        Assert.assertEquals(actualError, expectedError);
        System.out.println("Printing Actual Error from the site :: "+ actualError);
    }

}
