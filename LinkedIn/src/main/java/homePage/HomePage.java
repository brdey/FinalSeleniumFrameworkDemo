package homePage;

import base.CommonAPI;
import loginPage.LoginValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utility.reporting.TestLogger;

import java.util.List;

/**
 * Created by BELEE on 5/23/2017.
 */
public class HomePage extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='mynetwork-nav-item']/a/span[2]")
    public static WebElement myNetworkTab;

    public WebElement getMyNetworkTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        return myNetworkTab;
    }

    //Test -1 Verifying error message with Invalid login information
    public void enteringInvalidLoginData() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        LoginValue loginValue = PageFactory.initElements(driver, LoginValue.class);
        loginValue.enterYourLoginValue("invalid@gmail.com", "abc1234");
        String actualError = driver.findElement(By.cssSelector("#control_gen_1>p>strong")).getAttribute("innerHTML");
        String expectedError = "There were one or more errors in your submission. Please correct the marked fields below.";
        Assert.assertEquals(actualError, expectedError);
        System.out.println("Printing Actual Error from the site :: " + actualError);
    }

    //Test -2  Login with valid information
    public void accessMyLoginValue() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        LoginValue loginValue = PageFactory.initElements(driver, LoginValue.class);
        loginValue.myLikedInLogin();
    }

    //Test -3 Clicking on Mynetwork Tab after logging in
    public void clickOnMyNetworkTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        accessMyLoginValue();
        getMyNetworkTab().click();
    }
    //Test -4 Trying to sign up with invalid name
    @FindBy(how = How.CSS, using = "#reg-firstname")
    WebElement firstName;
    @FindBy(how = How.CSS, using = "#reg-lastname")
    WebElement lastName;
    @FindBy(how = How.CSS, using = "#reg-email")
    WebElement email;
    @FindBy(how = How.CSS, using = "#reg-password")
    WebElement password;
    @FindBy(how = How.XPATH, using = ".//*[@id='registration-submit']")
    WebElement joinNow;

    public void enteringAllValuesForSigningUp() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        firstName.sendKeys("Practice");
        lastName.sendKeys("project");
        email.sendKeys("invaidemail@invalid.com");
        password.sendKeys("abc1234");
        joinNow.click();
       /* String actualError = driver.findElement(By.cssSelector("#captcha-title")).getAttribute("innerHTML");
        String expectedError = "Security verification";
        Assert.assertEquals(actualError, expectedError);
        System.out.println("Printing Actual Error message from the site :: " + actualError+"/n");*/
    }

    //Test -5 Trying to sign up with blank fields
    public void leaveSigningUpFieldsBlank() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        firstName.sendKeys("");
        lastName.sendKeys("");
        email.sendKeys("");
        password.sendKeys("");
        joinNow.click();
    }

    //Test -6 Check browse by country link
    @FindBy(how = How.CSS, using = ".country-search>a")
    WebElement browseByCountryLink;

    public void clickOnBrowseByCountryLink(){
        browseByCountryLink.click();
    }

    //Test -6 Search job by job link from the bottom of the page
    @FindBy(how = How.CSS, using = "div.links:nth-child(3) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")
    WebElement jobSearchByCatagories;
    @FindBy(how = How.CSS, using = ".card-image.information-technology")
    WebElement informationTechnologyJobsLink;

    public void clickOnJobLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        jobSearchByCatagories.click();
        informationTechnologyJobsLink.click();
    }
    @FindBy(how = How.XPATH, using = ".//*[@id='keyword-search-box']")
    WebElement giveJobTittleToBeSearched;
    @FindBy(how = How.CSS, using = "#location-search-box")
    WebElement giveLocation;
    @FindBy(how = How.CSS, using = ".search-button")
    WebElement findJobsButton;

    public void giveTheValueInSearchBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        giveJobTittleToBeSearched.clear();
        giveJobTittleToBeSearched.sendKeys("Automation QA Engineer Selenium");
        giveLocation.clear();
        giveLocation.sendKeys("Boston");
        findJobsButton.click();
    }

    //Test -7 Privacy policy page check
    @FindBy(how = How.CSS, using = ".legal-nav > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")
    WebElement privacyPolicyPage;
    @FindBy(how = How.CSS, using = ".ytp-large-play-button.ytp-button>svg")
    public WebElement privacyPolicyVideoPlay;

    public void clickOnPrivacyPolicy(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        privacyPolicyPage.click();
    }
    public  void clickOnPlayButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        privacyPolicyVideoPlay.click();
    }

    //Test -8 Read data from Privacy Policy Page
    @FindBy(how = How.CSS, using = ".description>h1")
    WebElement readDataFromPrivacyPolicy;

    public void readPostTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        clickOnPrivacyPolicy();
        List<WebElement> getData = readDataFromPrivacyPolicy.findElements(By.cssSelector(".description>h1"));
        String text = getTextByCss("p.first");
        System.out.println("\n" + text+"\n");
        System.out.println(getData);
    }
}
