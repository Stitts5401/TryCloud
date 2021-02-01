package trycloud.testcases;

import com.trycloud.base.TestBase;
import com.trycloud.pages.homepages.HomePage;
import com.trycloud.base.TestBase;
import com.trycloud.pages.homepages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.testng.Assert;

    public class HomePageSteps extends TestBase {
        HomePage homePage;
        String expectedPage;

        public HomePageSteps() {
        }

        @Given("I am at landing page")
        public void iAmAtLandingPage() {
            this.homePage = new HomePage();
        }

        @When("I click {string}")
        public void iClick(String arg0) {
            byte var3 = -1;
            switch(arg0.hashCode()) {
                case -1822469688:
                    if (arg0.equals("Search")) {
                        var3 = 4;
                    }
                    break;
                case -1678787584:
                    if (arg0.equals("Contact")) {
                        var3 = 2;
                    }
                    break;
                case 73596745:
                    if (arg0.equals("Login")) {
                        var3 = 5;
                    }
                    break;
                case 81075958:
                    if (arg0.equals("Trial")) {
                        var3 = 3;
                    }
                    break;
                case 685445846:
                    if (arg0.equals("Feature")) {
                        var3 = 0;
                    }
                    break;
                case 1349597094:
                    if (arg0.equals("Pricing")) {
                        var3 = 1;
                    }
            }

            switch(var3) {
                case 0:
                    this.homePage.goToFeatures();
                    this.expectedPage = "Features - Trycloud";
                    break;
                case 1:
                    this.homePage.goToPricing();
                    this.expectedPage = "Pricing - Trycloud";
                    break;
                case 2:
                    this.homePage.goToContacts();
                    this.expectedPage = "Contact - Trycloud";
                    break;
                case 3:
                    this.homePage.goToTrial();
                    this.expectedPage = "FREE Trial - Trycloud";
                    break;
                case 4:
                    this.homePage.goToSearch();
                    this.expectedPage = "Home - Trycloud";
                    break;
                case 5:
                    this.homePage.goToLogin();
                    this.expectedPage = "Trycloud";
                    break;
                default:
                    this.expectedPage = "null";
            }

        }

        @Then("{string} loads")
        public void loads(String arg0) {
            Assert.assertEquals(driver.getTitle(), this.expectedPage);
        }
    }


