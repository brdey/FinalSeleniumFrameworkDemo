package DSEHomepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by BELEE on 5/26/2017.
 */
public class DSEHomepageClass extends CommonAPI {
    @FindBy (how = How.CSS, using = "li.dropdown:nth-child(2) > a:nth-child(1)")
    WebElement aboutUs;

    public void aboutUsFeatures(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        aboutUs.click();
    }
}
