package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.android.ApiDemosPage;
import pages.android.DragAndDropPage;
import pages.android.ViewsPage;
import utilities.Driver;


public class DragAndDropStepDefs {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
    ViewsPage viewsPage = new ViewsPage();
    DragAndDropPage dragAndDropPage = new DragAndDropPage();
    @Given("kullanici views sayfasina gidecek")
    public void kullanici_views_sayfasina_gidecek() {
        apiDemosPage.views.click();
    }
    @Given("kullanici drag and drop sayfasina gidecek")
    public void kullanici_drag_and_drop_sayfasina_gidecek() {
        viewsPage.dragAndDrop.click();
    }
    @Given("kullanici ilk butonu alip ikinci butona koyacak")
    public void kullanici_ilk_butonu_alip_ikici_butona_koyacak() {
        //TouachAction nesnesi olusturuyoruz
        TouchAction touchAction=new TouchAction(Driver.getAppiumDriver());
        //bir noktadan diger noktaya suruklemek icin bu nesneyi kullaniyoruz
        touchAction.longPress(ElementOption.element(dragAndDropPage.Nokta1))
                .moveTo(ElementOption.element(dragAndDropPage.Nokta2)).release().perform();
    }
    @Then("text onaylanacak")
    public void onaylanacak() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(dragAndDropPage.actualText.isDisplayed());
    }
}
