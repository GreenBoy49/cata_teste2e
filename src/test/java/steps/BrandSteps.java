package steps;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class BrandSteps extends DriverFactory {
    HomePage homePage=new HomePage(driver);
    public BrandSteps() {
        super(); }
    @When("^he clicks on the brand to display the brand list$")
    public void heClicksOnTheBrandToDisplayTheBrandList() {
         homePage.showBrandList();
    }

    @And("^he select the apple brand$")
    public void heSelectTheAppleBrand() {
         homePage.chooseBrandApple();
    }

    @When("^he chooses \"([^\"]*)\"$")
    public void heChooses(String arg0) throws Throwable {
     homePage.appleMouseLink();
    }

    @Then("^it should display \"([^\"]*)\" mouses$")
    public void itShouldDisplayMouses(int arg0) throws Throwable {
         homePage.verifyAppleMouse(arg0);
    }


    @Then("^the breadcrumb should display as \"([^\"]*)\",\"([^\"]*)\"$")
    public void theBreadcrumbShouldDisplayAs(String arg0, String arg1) throws Throwable {
         homePage.verifyBreadcrumbApple(arg0,arg1);
    }

    @And("^the title must be \"([^\"]*)\"$")
    public void theTitleMustBe(String arg0) throws Throwable {
         homePage.verifyTitleApple(arg0);
    }

    @When("the user types {string} in the search box and validates")
    public void theUserTypesInTheSearchBoxAndValidates(String keyword) {
         homePage.typeSearchBox(keyword);
    }

    @And("the user clicks on {string}")
    public void theUserClicksOn(String arg0) {
         homePage.clickOnPrinters();
    }

    @And("the user should see {string} results")
    public void theUserShouldSeeResults(String arg0) {
         homePage.verifyResultsCount(arg0);
    }

    @When("the user filters the results by brand {string}")
    public void theUserFiltersTheResultsByBrand(String arg0) {
         homePage.chooseLexmark();
    }




    @Then("the user should see printer name's {string}")
    public void theUserShouldSeePrinterNameS(String arg0) {
         homePage.verifyResultsName(arg0);
    }
}
