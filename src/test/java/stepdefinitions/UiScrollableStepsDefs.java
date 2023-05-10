package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.android.ApiDemosPage;
import pages.android.ViewsPage;
import utilities.Driver;

public class UiScrollableStepsDefs {
    ViewsPage viewsPage = new ViewsPage();
    @And("kullanici textswitcher secenegini secer")
    public void kullaniciTextswitcherSeceneginiSecer() throws InterruptedException {
        AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();
//AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();//UiScrollable özelliği Android de çalışır yalnızca
//
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"TextSwitcher\"))");
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"TextSwitcher\"))");
        Thread.sleep(3000);
        viewsPage.textSwitcher.click();
    }

    @And("kullanıcı next butonuna iki kez tiklar")
    public void kullanıcıNextButonunaIkiKezTiklar() {
        viewsPage.next.click();
        viewsPage.next.click();
    }

    @Then("sayinin iki oldugunu verify edin")
    public void sayininIkiOldugunuVerifyEdin() {
        Assert.assertTrue(viewsPage.sonuc.getText().equals("2"));
    }

}
