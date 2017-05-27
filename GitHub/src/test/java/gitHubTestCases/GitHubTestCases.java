package gitHubTestCases;

import base.CommonAPI;
import gitHubHomePage.GitHubHomepageClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by BELEE on 5/26/2017.
 */
public class GitHubTestCases extends CommonAPI {
   /* @Test
    public void enteringToTheGitHubPage() {
        ApplicationLog.epicLogger("Epic: GitHubTestCases AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        GitHubHomepageClass gitHubHomepageClass = PageFactory.initElements(driver, GitHubHomepageClass.class);
        gitHubHomepageClass.enteringTheValueGiven();
    }*/
    @Test
    public void createDeleteAndSignOutFromGitHub(){
        ApplicationLog.epicLogger("Epic: GitHubTestCases AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        GitHubHomepageClass gitHubHomepageClass = PageFactory.initElements(driver, GitHubHomepageClass.class);
        gitHubHomepageClass.creatingNewRepository();
        gitHubHomepageClass.deletingTheRepositoryHasBeenCreated();
        /*gitHubHomepageClass.checkingTheProjectDeletedOrNot();
        gitHubHomepageClass.signingOutFromGitHub();*/

    }
}
