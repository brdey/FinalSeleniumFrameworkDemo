package allFeaturesTab;

import base.CommonAPI;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

/**
 * Created by BELEE on 5/25/2017.
 */
public class JobSearchByJobLink extends CommonAPI {
    public void goToJobSearchByCatagoryPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnJobLink();
        homePage.giveTheValueInSearchBox();
    }
}
