package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.android.SpinnerPage;
import pages.android.ViewsPage;
import utilities.Driver;

public class SpinnerStepsDefs {
    ViewsPage viewsPage = new ViewsPage();
    SpinnerPage spinnerPage = new SpinnerPage();
    @When("kullanici Spinner sayfasina gidecek")
    public void kullaniciSpinnerSayfasinaGidecek() throws InterruptedException {
        AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();
        Thread.sleep(3000);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Spinner\"))");
        viewsPage.spinner.click();
    }

    @Then("ilk dropdown Blue sec ve onayla")
    public void ilkDropdownBlueSecVeOnayla() throws InterruptedException {

        spinnerPage.spinner1.click();
        spinnerPage.blue.click();
        Thread.sleep(3000);
        Assert.assertTrue(spinnerPage.selectedBlue.isDisplayed());
        System.out.println("blue ekran secildi.");

    }

    @And("ikinci dropdown Mars sec ve onayla")
    public void ikinciDropdownMarsSecVeOnayla() throws InterruptedException {
        spinnerPage.spinner2.click();
        spinnerPage.mars.click();
        Thread.sleep(3000);
        // Assert.assertTrue(spinnerPage.mars.isDisplayed());
    }
}
