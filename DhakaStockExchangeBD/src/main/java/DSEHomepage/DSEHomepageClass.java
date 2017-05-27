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
    @FindBy(how = How.CSS, using = "li.dropdown:nth-child(2) > a:nth-child(1)")
    WebElement aboutUs;

    public void aboutUsFeatures() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        aboutUs.click();
    }

    //Reading data from a table from DSE Homepage
    @FindBy(how = How.CSS, using = "div.col-xs-7:nth-child(4) > div:nth-child(1) > div:nth-child(3)")
    WebElement sharePriceByTable;
    @FindBy(how = How.TAG_NAME, using = "tr")
    WebElement totalCloumnInThisTable;
    @FindBy(how = How.XPATH, using = ".//*[@id='bvoluem']/div/table/thead/tr/th")
    WebElement totalRowInThisTable;

    public void readTheDataFromShareByTable() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        String tableData = sharePriceByTable.getText();
        System.out.println("Total column in this table are :" + totalCloumnInThisTable.getSize());
        System.out.println("Total row in this table are : " + totalRowInThisTable.getSize());
        System.out.println("\nThe Data in this table are following:"+"\n" + tableData);
    }
}
