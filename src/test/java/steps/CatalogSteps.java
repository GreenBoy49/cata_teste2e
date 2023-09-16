package steps;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class CatalogSteps extends DriverFactory {

     HomePage homePage=new HomePage(driver);
    public CatalogSteps() {
        super();
    }

    @Given("^the user is on the home page$")
    public void theUserIsOnTheHomePage() {
        driver.get("https://www.getcata.com/ma-fr");
    }

    @When("^he click on the catalogue to display the catalogue list$")
    public void heClickOnTheCatalogueToDisplayTheCatalogueList() {
       homePage.showCatalogList();
    }

    @And("^he select the sport catalogue$")
    public void heSelectTheSportCatalogue() {
        homePage.chooseCatalogOption();
    }

    @Then("^(\\d+) results should appear$")
    public void resultsShouldAppear(int arg0) {
        homePage.verifyResults();
    }

    @And("^he click on \"([^\"]*)\"$")
    public void heClickOn(String arg0) throws Throwable {
        homePage.clickOn();
    }


    @And("^the title should be \"([^\"]*)\"$")
    public void theTitleShouldBe(String arg0) throws Throwable {
      homePage.verifyTitle(arg0);
    }

    @Then("^the breadcrumb should display \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void theBreadcrumbShouldDisplay(String arg0, String arg1, String arg2) throws Throwable {
       homePage.verifyBreadcrumb(arg0, arg1, arg2);


    }
}
