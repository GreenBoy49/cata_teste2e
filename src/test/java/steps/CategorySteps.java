package steps;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class CategorySteps  extends DriverFactory {
    HomePage homePage= new HomePage(driver);

    public CategorySteps(){super();}

    @When("^he clicks on the category to display the category list$")
    public void heClicksOnTheCategoryToDisplayTheCategoryList() {
         homePage.showCategoryList();
    }
    @And("^he select the perfume category$")
    public void heSelectThePerfumeCategory() {
        homePage.chooseCategoryPerfume();
    }
    @When("^he applies the price filter \"([^\"]*)\"$")
    public void heAppliesThePriceFilter(String arg0) throws Throwable {
         homePage.choosePerfumeFiltrePrice(arg0);
    }
    @Then("^it should display \"([^\"]*)\" perfums$")
    public void itShouldDisplayPerfums(int arg0) throws Throwable {
        homePage.verifyPerfumeResults(arg0);
    }
    @Then("^the breadcrumb should display \"([^\"]*)\",\"([^\"]*)\"$")
    public void theBreadcrumbShouldDisplay(String arg0, String arg1) throws Throwable {
         homePage.verifyBreadcrumb(arg0,arg1);
    }

    @And("he title should be {string}")
    public void heTitleShouldBe(String arg0) {
         homePage.verifyTitlePerfume(arg0);
    }


    @When("the user selects the language {string}")
    public void theUserSelectsTheLanguage(String arg0) {
         homePage.displayLanguagesList();
         homePage.chooseEnglish();
    }

    @And("the application language should be set to English")
    public void theApplicationLanguageShouldBeSetToEnglish() {
    }

    @And("the user clicks on the {string} category")
    public void theUserClicksOnTheCategory(String arg0) {
         homePage.chooseCategoryOption();
    }

    @Then("the user should see the text {string}")
    public void theUserShouldSeeTheText(String arg0) {
         homePage.verifyText(arg0);
    }
}
