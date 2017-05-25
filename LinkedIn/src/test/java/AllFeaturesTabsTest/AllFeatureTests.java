package AllFeaturesTabsTest;

import allFeaturesTab.AllFeaturesTabs;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by BELEE on 5/25/2017.
 */
public class AllFeatureTests extends CommonAPI {
    @Test
    public void giveAllValueInTheField() {
        ApplicationLog.epicLogger("Epic: LoginPageTest AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        AllFeaturesTabs allFeaturesTabs = PageFactory.initElements(driver, AllFeaturesTabs.class);
        allFeaturesTabs.FillSigningUpInfo();
    }
}
