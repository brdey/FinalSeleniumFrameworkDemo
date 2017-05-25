package allFeaturesTab;

import base.CommonAPI;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by BELEE on 5/25/2017.
 */
public class PrivacyPolicyVideoPlay extends CommonAPI {
    public void goToPrivacyPolicyVideoPage(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnPrivacyPolicy();
    }
}
