package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    public WebDriver driver;

    @FindBy(css = ".flex.items-center.gap-1.p-2.text-sm")   // prendre premier elt pour catalog
    private List<WebElement> showCatalogList;

    @FindBy(css =".flex.items-center.gap-1.p-2.text-sm")   // prendre premier elt pour catalog
    private List<WebElement> showBrandList;

    @FindBy(xpath = "//a[@href=\"" + "https://www.getcata.com/ma-fr/category/sport" + "\"]")
    private WebElement catalogSport;

    @FindBy(xpath = "//a[@href=\"" + "https://www.getcata.com/ma-fr/catalogs/decathlon" + "\"]")
    private WebElement decatlhonLink;

    @FindBy(xpath = "//a[@href=\"" + "https://www.getcata.com/ma-fr/category/perfumes" + "\"]")
    private WebElement perfumeLink;

    @FindBy(xpath = "//a[@href=\"" + "https://www.getcata.com/ma-fr/category/mouses/apple" + "\"]")
    private WebElement appleMouseLink;

    @FindBy(xpath = "//a[@href=\"" + "https://www.getcata.com/ma-fr/brand/apple" + "\"]")
    private WebElement appleLink;

    @FindBy(css = "ol.inline-flex")
    private WebElement BreadCrumpLabel;

    @FindBy(css = ".flex.items-center.justify-start.w-full.gap-2.py-3.text-sm.font-medium")
    private WebElement breadCrumpCategory;

    @FindBy(css = ".p-2.text-xs .justify-start")
    private WebElement breadCrumpBrand;

    @FindBy(css = "h1.inline-block")
    private WebElement titleName;

    @FindBy(css = ".text-lg.text-gray-800.truncate")
    private WebElement titleNamePerfume;

    @FindBy(css = ".items-center.justify-start.w-full.gap-2.py-3.text-sm.font-medium")
    private WebElement titleNameBrandApple;

    @FindBy(css = "a.flex.items-center.cursor-pointer .form-radio.cursor-pointer")
    private List<WebElement> perfumeFiltrePrice ;

    @FindBy(css = ".overflow-hidden .absolute.flex")
    private List<WebElement> resultList;

    @FindBy(css = ".bg-white.border-gray-200")
    private List<WebElement> printerBrandCheckbox;

    @FindBy(css = ".w-full .ring-primary-600")
    private WebElement searchBoxInput;

    @FindBy(name = "q")
    private WebElement searchBoxIcon;

    @FindBy(css = ".text-sm.text-gray-500")
    private List<WebElement> resultCountText;

    @FindBy(css = ".max-w-full.text-lg.truncate")
    private WebElement resultName;

    @FindBy(xpath = "//a[@href=\"" + "https://www.getcata.com/ma-fr/category/printers" + "\"]")
    private WebElement printerLink;

    @FindBy(css = ".inline button.flex.items-center.gap-1.text-sm")
    private List<WebElement> displayLaguagebutton;

    @FindBy(xpath = "//a[@href=\"" + "https://www.getcata.com/ma-en" + "\"]")
    private WebElement englishLink;

    @FindBy(xpath = "//a[@href=\"" + "https://www.getcata.com/ma-en/category/motherboards" + "\"]")
    private WebElement motherboardLink;

    @FindBy(css = ".text-sm.text-gray-500")
    private List<WebElement> resultsSummuary;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void chooseCatalogOption() {
        //catalogSport.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", catalogSport);
    }

    public void showCatalogList() {
        showCatalogList.get(0).click();
    }

    public void verifyResults() {
    }

    public void clickOn() {
        //decatlhonLink.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", decatlhonLink);
    }

    public void verifyBreadcrumb(String key0, String key1, String key2) {
        String ActualBreadCrump = BreadCrumpLabel.getText();
        Assert.assertTrue(ActualBreadCrump.contains(key0));
        Assert.assertTrue(ActualBreadCrump.contains(key1));
        Assert.assertTrue(ActualBreadCrump.contains(key2));
    }

    public void verifyTitle(String key) {
        Assert.assertTrue(titleName.getText().contains(key));
    }

    public void showCategoryList() {
        showCatalogList.get(1).click();
    }

     public void chooseCategoryPerfume() {
   // perfumeLink.click();
         JavascriptExecutor executor = (JavascriptExecutor) driver;
         executor.executeScript("arguments[0].click();", perfumeLink);
    }

    public void verifyBreadcrumb(String arg0, String arg1) {
        String ActualBreadCrump = breadCrumpCategory.getText();
        Assert.assertTrue(ActualBreadCrump.contains(arg0));
        Assert.assertTrue(ActualBreadCrump.contains(arg1));
    }

    public void verifyTitlePerfume(String arg0) {
        Assert.assertEquals(arg0,titleNamePerfume.getText());
    }

    public void choosePerfumeFiltrePrice(){
        perfumeFiltrePrice.get(1).click();
    }

    public void verifyPerfumeResults(int arg0){
        Assert.assertEquals(arg0, resultList.size());
    }

    public void showBrandList() {
        showCatalogList.get(2).click();
    }

    public void chooseBrandApple() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", appleLink);
    }

    public void verifyBreadcrumbApple(String arg0, String arg1) {
        String ActualBreadCrump = breadCrumpBrand.getText();
        Assert.assertTrue(ActualBreadCrump.contains(arg0));
        Assert.assertTrue(ActualBreadCrump.contains(arg1));
    }

    public void verifyTitleApple(String arg0) {
        String ActualTitleNameApple = titleNameBrandApple.getText();
        Assert.assertTrue(ActualTitleNameApple.contains(arg0));
    }

    public void appleMouseLink() {
        appleMouseLink.click();
    }

    public void verifyAppleMouse(int arg0) {
        Assert.assertEquals(arg0,resultList.size());
    }

    public void typeSearchBox(String keyword) {
        searchBoxIcon.click();
        searchBoxIcon.sendKeys(keyword);
        searchBoxIcon.sendKeys(Keys.ENTER);

    }

    public void clickOnPrinters() {
        printerLink.click();
    }

    public void verifyResultsCount(String count) {
        Assert.assertTrue(resultCountText.get(1).getText().contains(count));
    }
    public void verifyResultsName(String name) {
        Assert.assertTrue(resultName.getText().contains(name));
    }
    public void chooseLexmark() {
        printerBrandCheckbox.get(3).click();
    }

    public void displayLanguagesList() {
        clickJS(displayLaguagebutton.get(1));
    }

    public void chooseEnglish() {
        clickJS(englishLink);
    }

    public void chooseCategoryOption() {
        clickJS(motherboardLink);
    }

    public void verifyText(String arg0) {
        Assert.assertTrue(resultsSummuary.get(1).getText().contains(arg0));
    }

    public void clickJS(WebElement webElement) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", webElement);
    }

    public void choosePerfumeFiltrePrice(String arg0) {
        clickJS(perfumeFiltrePrice.get(1));
    }
}
