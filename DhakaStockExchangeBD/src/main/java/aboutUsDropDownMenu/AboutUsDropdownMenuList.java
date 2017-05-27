package aboutUsDropDownMenu;

import DSEHomepage.DSEHomepageClass;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

/**
 * Created by BELEE on 5/26/2017.
 */
public class AboutUsDropdownMenuList extends CommonAPI {
    public void goToAboutUsDropDown() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DSEHomepageClass dseHomepageClass = PageFactory.initElements(driver,DSEHomepageClass.class);
        dseHomepageClass.aboutUsFeatures();
    }
}