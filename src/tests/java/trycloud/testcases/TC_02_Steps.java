package trycloud.testcases;
import com.trycloud.base.TestBase;
import com.trycloud.pages.appPages.FilePage;
import com.trycloud.pages.homepages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class TC_02_Steps extends TestBase {
    HomePage homePage = new HomePage();
    FilePage filePage = new FilePage();

    public TC_02_Steps() {
        super();
    }

    @Given("Im in the File page")
    public void imInTheFilePage() {
        homePage.goToLogin().loginHappyPath();
        Assert.assertEquals(driver.getTitle(),"Files - Trycloud");
    }

    @When("I click on {string} module.")
    public void iClickOnModule(String arg0) {
        filePage.hasModule(arg0);
    }

    @Then("Load {string} page.")
    public void loadPage(String arg0) {
        Assert.assertNotEquals("Files - Trycloud", filePage.canClick(arg0));
    }
}