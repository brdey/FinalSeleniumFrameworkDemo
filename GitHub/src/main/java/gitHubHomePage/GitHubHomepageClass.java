package gitHubHomePage;

import base.CommonAPI;
import gitHubLoginPage.GitHubLoginValue;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

/**
 * Created by BELEE on 5/26/2017.
 */
public class GitHubHomepageClass extends CommonAPI {
    public void enteringTheValueGiven(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GitHubLoginValue gitHubLoginValue = PageFactory.initElements(driver, GitHubLoginValue.class);
        gitHubLoginValue.accessMyGithubLoginInfo();
    }

   @FindBy (how = How.CSS, using = "a.btn:nth-child(1)")
    WebElement clickOnNewRepositoryButton;
    @FindBy (how = How.XPATH, using = ".//*[@id='repository_name']")
    WebElement repositoryName;
    @FindBy (how = How.CSS, using = ".btn.btn-primary.first-in-line")
    WebElement createRepository;
    @FindBy (how = How.CSS, using = ".public>strong>a")
    WebElement clickOnCreatedRepositoryName;
    @FindBy (how = How.CSS, using = "a.btn:nth-child(3)")
    WebElement clickOnImportCode;
    @FindBy (how = How.CSS, using = "#vcs_url")
    WebElement giveOldGitProjectUrl;
    @FindBy (how = How.CSS, using = ".btn.btn-primary")
    WebElement clickOnBeginImport;
    @FindBy (how = How.CSS, using = ".anim-fade-in.mt-3>a")
    WebElement clickOnNewCreatedRepositoryLink;

    public void creatingNewRepository(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        enteringTheValueGiven();
        clickOnNewRepositoryButton.click();
        repositoryName.sendKeys("Automated-Project");
        createRepository.click();
        clickOnCreatedRepositoryName.click();
        clickOnImportCode.click();
        giveOldGitProjectUrl.sendKeys("https://github.com/brdey/GlassFisherProject.git");
        clickOnBeginImport.click();
        clickOnNewCreatedRepositoryLink.click();
    }

    // Deleting the repository that has been created automatically
    @FindBy (how = How.CSS, using = "a.js-selected-navigation-item:nth-child(6)")
    WebElement clickOnSettingsTab;
    @FindBy (how = How.CSS, using = "#options_bucket > div.boxed-group.dangerzone > div > button:nth-child(11)")
    WebElement clickDeleteRepository;
    @FindBy (how = How.XPATH, using = ".//*[@id='facebox']/div/div/form/p/input")
    WebElement giveTheNameOfRepositoryToBeDeleted;
    @FindBy (how = How.CSS, using = ".facebox-content > form:nth-child(5) > button:nth-child(3)")
    WebElement clickIUnderstandDeleteRepository;

    public void deletingTheRepositoryHasBeenCreated(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSettingsTab.click();
        clickDeleteRepository.click();
        giveTheNameOfRepositoryToBeDeleted.sendKeys("Automated-Project");
        clickIUnderstandDeleteRepository.click();
    }

    // Checking the project deleted or Not
    @FindBy (how = How.CSS, using = ".header-nav-link.name.tooltipped.tooltipped-sw.js-menu-target")
    WebElement clickOnArrowOrProfilePic;
    @FindBy (how = How.CSS, using = "div.dropdown-menu > a:nth-child(3)")
    WebElement clickOnYourProfileLink;

    public void checkingTheProjectDeletedOrNot(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnArrowOrProfilePic.click();
        clickOnYourProfileLink.click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;  // To scroll down the page
        jse.executeScript("window.scrollBy(0,250)", "");
    }

    // Signing out from github
    @FindBy (how = How.XPATH, using = ".//*[@id='user-links']/li[3]/a")
    WebElement clickOnArrowOrProfilePicAgain;
    @FindBy (how = How.CSS, using = ".logout-form > button:nth-child(2)")
    WebElement clickOnSignOutLink;

    public void signingOutFromGitHub(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnArrowOrProfilePicAgain.click();
        clickOnSignOutLink.click();
    }
}
