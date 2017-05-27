package AllFeaturesTabsTest;

import allFeaturesTab.*;
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
        ApplicationLog.epicLogger("Epic: AllFeatureTests AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        InvalidSignUpPage invalidSignUpPage = PageFactory.initElements(driver, InvalidSignUpPage.class);
        invalidSignUpPage.FillSigningUpInfo();
    }

    @Test
    public void SigningUpWithoutInfo() {
        ApplicationLog.epicLogger("Epic: AllFeatureTests AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        SignUpPageWithoutInfo signUpPageWithoutInfo = PageFactory.initElements(driver, SignUpPageWithoutInfo.class);
        signUpPageWithoutInfo.KeepTheSigningUpFieldsBlank();
    }
    @Test
    public void openTheBrowseByCountryPage() {
        ApplicationLog.epicLogger("Epic: AllFeatureTests AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        BrowseByCountryLink browseByCountryLink =PageFactory.initElements(driver, BrowseByCountryLink.class);
        browseByCountryLink.goToBrowseByCountryPage();
    }
    @Test
    public void openJobSearchByCatagoryPage() {
        ApplicationLog.epicLogger("Epic: AllFeatureTests AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        JobSearchByJobLink jobSearchByJobLink = PageFactory.initElements(driver, JobSearchByJobLink.class);
        jobSearchByJobLink.goToJobSearchByCatagoryPage();
    }

    @Test
    public void openPrivacyPolicyPage(){
        ApplicationLog.epicLogger("Epic: AllFeatureTests AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        PrivacyPolicyVideoPlay privacyPolicyVideoPlay = PageFactory.initElements(driver, PrivacyPolicyVideoPlay.class);
        privacyPolicyVideoPlay.goToPrivacyPolicyVideoPage();
    }
    @Test
    public void openPrivacyPolicyPageAndReadThePost(){
        ApplicationLog.epicLogger("Epic: AllFeatureTests AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        ReadingDataFromPrivacyPolicy readingDataFromPrivacyPolicy = PageFactory.initElements(driver, ReadingDataFromPrivacyPolicy.class);
        readingDataFromPrivacyPolicy.getAndReadThePost();
    }

}