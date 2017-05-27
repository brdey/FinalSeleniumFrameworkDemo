package allAboutUsDropDownMenu;

import aboutUsDropDownMenu.AboutUsDropdownMenuList;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by BELEE on 5/26/2017.
 */
public class AllAboutUsDropDownMenu extends CommonAPI {
    @Test
    public void clickOnAboutUsMenu(){
        ApplicationLog.epicLogger("Epic: AllAboutUsDropDownMenu AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        AboutUsDropdownMenuList aboutUsDropdownMenuList = PageFactory.initElements(driver, AboutUsDropdownMenuList.class);
        aboutUsDropdownMenuList.goToAboutUsDropDown();
    }
}
