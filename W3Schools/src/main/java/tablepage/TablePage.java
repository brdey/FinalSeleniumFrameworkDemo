package tablepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by PIIT_NYA on 5/20/2017.
 */
public class TablePage extends CommonAPI {
    @FindBy(how = How.CSS, using = ".w3-responsive .w3-table-all.notranslate tbody tr:nth-child(1) th:nth-child(1)")
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
    public  WebElement getCustomerNameWebElement() {
        return customerNameWebElement;
    }
    public  WebElement getContactNameWebElement() {
        return contactNameWebElement;
    }
    public  WebElement getAddressWebElement() {
        return addressWebElement;
    }
    public  WebElement getCityWebElement() {
        return cityWebElement;
    }
    public  WebElement getPostalCodeWebElement() {
        return postalCodeWebElement;
    }
    public  WebElement getCountryWebElement() {
        return countryWebElement;
    }
    public String getCustomerID(){
       String customerID =  getCustomerIDWebElement().getText();
       return customerID;
    }
    public String getCustomerName(){
        String customerName = getCustomerNameWebElement().getText();
        return customerName;
    }
    public String getAddress(){
        String address = getAddressWebElement().getText();
        return address;
    }
    public String getCity(){
        String city = getCityWebElement().getText();
        return city;
    }
    public String getPostalCode(){
        String postalCode = getPostalCodeWebElement().getText();
        return postalCode;
    }
    public String getCountry(){
        String country = getCountryWebElement().getText();
        return country;
    }
    public void verifyHeader(){
        Assert.assertEquals("CustomerID", getCustomerID());
        Assert.assertEquals("CustomerName", getCustomerName());
        Assert.assertEquals("Address", getAddress());
        Assert.assertEquals("City", getCity());
        Assert.assertEquals("PostalCode", getPostalCode());
        Assert.assertEquals("Country", getCountry());
    }

    public void readColumn(){
        for(int i=1; i<=7; i++) {
            String text = getTextByCss(".w3-responsive .w3-table-all.notranslate tbody tr:nth-child(1) th:nth-child(" + i + ")");
            System.out.println(text);
        }
    }
}
