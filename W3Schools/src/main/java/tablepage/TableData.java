package tablepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/**
 * Created by PIIT_NYA on 5/20/2017.
 */
public class TableData extends CommonAPI {

    @FindBy(how = How.CSS, using = ".w3-responsive .w3-table-all.notranslate tbody tr:nth-child(4) td:nth-child(4)")
    public static WebElement customerIDWebElement;

    @FindBy(how = How.CSS, using = ".w3-responsive .w3-table-all.notranslate tbody tr:nth-child(1) th:nth-child(2)")
    public static WebElement customerNameWebElement;

    @FindBy(how = How.CSS, using = ".w3-responsive .w3-table-all.notranslate tbody tr:nth-child(1) th:nth-child(3)")
    public static WebElement contactNameWebElement;

    @FindBy(how = How.CSS, using = ".w3-responsive .w3-table-all.notranslate tbody tr:nth-child(1) th:nth-child(4)")
    public static WebElement addressWebElement;

    @FindBy(how = How.CSS, using = ".w3-responsive .w3-table-all.notranslate tbody tr:nth-child(1) th:nth-child(5)")
    public static WebElement cityWebElement;

    @FindBy(how = How.CSS, using = ".w3-responsive .w3-table-all.notranslate tbody tr:nth-child(1) th:nth-child(6)")
    public static WebElement postalCodeWebElement;

    @FindBy(how = How.CSS, using = ".w3-responsive .w3-table-all.notranslate tbody tr:nth-child(1) th:nth-child(7)")
    public static WebElement countryWebElement;

    public WebElement getCustomerIDWebElement(){
        return customerIDWebElement;
    }
    public String getCellData(){
        String cell = getCustomerIDWebElement().getText();
        return cell;
    }

    public void readData(){
        String data = getCellData();
    }

    public void table(){
        List<String> list = getTextFromWebElements(".w3-responsive .w3-table-all.notranslate tbody tr td");
        for(String st:list){
            System.out.println(st);
        }

    }
}
