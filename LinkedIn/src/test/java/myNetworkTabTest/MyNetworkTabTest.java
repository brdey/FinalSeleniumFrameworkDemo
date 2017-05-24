package myNetworkTabTest;

import base.CommonAPI;
import myNetworkTab.MyNetworkTab;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by BELEE on 5/23/2017.
 */
public class MyNetworkTabTest extends CommonAPI {
    @Test
    public void myNetworkPage(){
        ApplicationLog.epicLogger("Epic: MyNetworkTabTest AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        MyNetworkTab myNetworkTab = PageFactory.initElements(driver, MyNetworkTab.class);
        myNetworkTab.goToMyNetworkPage();
    }
}
