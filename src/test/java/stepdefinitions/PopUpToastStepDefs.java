package stepdefinitions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPages;
import utilities.Driver;
public class PopUpToastStepDefs {
    AllPages allPages = new AllPages();

    @And("kullanici Expandable Lists sayfasina gidecek")
    public void kullanici_expandable_lists_sayfasina_gidecek() throws InterruptedException {
        Thread.sleep(3000);
        allPages.viewsPage().expandableLists.click();
    }

    @And("kullanici Custom Adapter sayfasina gidecek")
    public void kullanici_custom_adapter_sayfasina_gidecek() throws InterruptedException {
        Thread.sleep(3000);
        allPages.expandableListPage().customAdapter.click();
    }

    @And("kulanici People Names basili tutacak ve popup acilacak")
    public void kulanici_people_names_basili_tutacak_ve_popup_acilacak() throws InterruptedException {
        TouchAction action = new TouchAction(Driver.getAppiumDriver());
        Thread.sleep(3000);
        action.longPress(ElementOption.element(allPages.expandableListPage().peopleNames)).perform();
        Assert.assertTrue(allPages.expandableListPage().sampleAction.isDisplayed());
    }

    @And("kullanici Simple action tiklayacak")
    public void kullanici_simple_action_tiklayacak() throws InterruptedException {
        Thread.sleep(3000);
        allPages.expandableListPage().sampleAction.click();
    }

    @Then("Tost mesaj {string} icerdigini onayla")
    public void tost_mesaj_icerdigini_onayla(String toastText) throws InterruptedException {
//        Thread.sleep(3000);
        System.out.println(allPages.expandableListPage().toastMessage.getAttribute("name"));
        Thread.sleep(1000);
        Assert.assertTrue(allPages.expandableListPage().toastMessage.getAttribute("name").contains(toastText));
//        Assert.fail();
    }
    @When("kullanici Popup Menu sayfasina gidecek")
    public void kullaniciPopupMenuSayfasinaGidecek() {
        AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Popup Menu\"))");
        allPages.popupMenuPage().popupMenu.click();
    }
    @When("kullanici Make a popup butonuna tikliyacak ve popup gorecek")
    public void kullaniciMakeAPopupButonunaTikliyacakVePopupGorecek() {
        allPages.popupMenuPage().makePopup.click();
        Assert.assertTrue(allPages.popupMenuPage().add.isDisplayed());
    }
    @When("kullanici Add butonuna basacak")
    public void kullaniciAddButonunaBasacak() {
        allPages.popupMenuPage().add.click();
    }
    @Then("toast mesaji onayliyacak {string}")
    public void toastMesajiOnayliyacak(String toastText) {
        System.out.println(allPages.popupMenuPage().toast.getAttribute("name"));
        Assert.assertEquals(toastText,allPages.popupMenuPage().toast.getAttribute("name"));
    }
}