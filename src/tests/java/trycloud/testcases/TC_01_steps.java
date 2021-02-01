package trycloud.testcases;


import com.trycloud.base.TestBase;
import com.trycloud.pages.appPages.FilePage;
import com.trycloud.pages.homepages.HomePage;
import com.trycloud.pages.homepages.LoginPage;
import com.trycloud.testutl.TestUtil;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC_01_steps extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    FilePage filePage = new FilePage();

    @Given("I log in with valid {string} and {string}")
    public void givenValid(String arg0, String arg1) {
     homePage.goToLogin();
     loginPage.loginWithUsernamePassword(arg0, arg1);
    }

    @When("I login with valid info.")
    public void iLoginWithValidInfo() {
        System.out.println("================================================");
        TestUtil.sleep(500);
    }

    @Then("URL is chawed to homepage's url.")
    public void urlIsChawedToHomepageSUrl() {
        Assert.assertTrue(filePage.checkUrl());
    }

    @Given("I login with invalid {string} {string}.")
    public void givenInvalid(String arg0, String arg1) {
        this.homePage.goToLogin();
        this.loginPage.loginWithUsernamePassword(arg0, arg1);
    }

    @When("I login with invalid info.")
    public void iLoginWithInvalidInfo() {
        TestUtil.sleep(500);
    }

    @Then("Wrong password message should be displayed.")
    public void messageShouldBeDisplayed() {
        Assert.assertTrue(this.loginPage.containsErrorMsg());
    }

    @And("page title and url stay the same.")
    public void pageTitleAndUrlStayTheSame() {
        Assert.assertEquals(this.loginPage.checkUrl(), "https://app.trycloud.net/index.php/login", "URL Changed!  BUG!");
        Assert.assertEquals(this.loginPage.checkTitle(), "Trycloud", "Title Changed! BUG!");
    }

}