package sales;

import model.NewLeadModel;
import ontalentbase.TestConfigurationBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;
import page.NavigatePage;
import page.NewLeadPage;

public class newLeadTest extends TestConfigurationBase {
    @BeforeClass
    public void shouldLoginPlatform() {
        super.login();

        NavigatePage navigatePage = new NavigatePage();
        waitVisible(navigatePage.getPlatformLogo());
        wait.until(ExpectedConditions.invisibilityOfElementLocated(navigatePage.getPlatformLogo()));
        waitVisible(navigatePage.getSaleBtn()).click();
        waitVisible(navigatePage.getRecentlyClientsBtn()).click();
        waitVisible(navigatePage.getClientNameBtn()).click();
    }
    @Test
    public void shouldCreateNewLead() throws InterruptedException {

        NavigatePage navigatePage = new NavigatePage();

        NewLeadModel newLeadModel = new NewLeadModel();
        newLeadModel.setLeadName("Test");
        newLeadModel.setDeliveryManager("Damian");
        newLeadModel.setDeliveryManagerDwa("Michał");
        newLeadModel.setPercentage("80");
        newLeadModel.setProjectStart("17/12/2018");
        newLeadModel.setPeriodicPayment("1000");
        newLeadModel.setPeriodicDaysOfPayment("14");
        newLeadModel.setFirstInvoice("17/12/2018");
        newLeadModel.setLastInvoice("17/03/2019");

        NewLeadPage newLeadPage = new NewLeadPage();
        waitVisible(newLeadPage.getNewLeadBtn()).click();

        waitVisible(newLeadPage.getLeadNameInput()).sendKeys(newLeadModel.getLeadName());
        expandDropDownAndClickOption(newLeadPage.getStatusDrp(), "NEW");
        waitInvisibility(newLeadPage.getStatusScroll());
        expandDropDownAndClickOption(newLeadPage.getLeadSourceDrp(), "MARKETING");
        waitVisible(newLeadPage.getExpectedSignDateDrp()).click();
        waitVisible(newLeadPage.getSignDateDay()).click();
        waitVisible(navigatePage.getNextBtn()).click();

        waitVisible(newLeadPage.getTimeMaterialBox());
        waitVisible(newLeadPage.getTimeMaterialBox()).click();
        waitVisible(newLeadPage.getHardwareBox()).click();
        waitVisible(navigatePage.getAddMoreBtn()).click();
        waitVisible(newLeadPage.getDeliveryManagerDrp()).sendKeys(newLeadModel.getDeliveryManager());
        waitInvisibility(newLeadPage.getDeliveryManagerScroll());
        expandDropDownAndClickOption(newLeadPage.getOpportunityTypeDrp(), ".NET Competence Center");
        waitVisible(navigatePage.getNextBtn()).click();

        waitInvisibility(navigatePage.getAddMoreBtn());
        waitVisible(newLeadPage.getExpectedProjectStartDrp()).sendKeys(newLeadModel.getProjectStart());
        expandDropDownAndClickOption(newLeadPage.getCurrencyDrp(), "PLN" );
        waitVisible(newLeadPage.getPeriodBox()).click();
        expandDropDownAndClickOption(newLeadPage.getFrequencyDrp(), "MONTHLY");
        waitVisible(newLeadPage.getFirstInvoiceDrp()).sendKeys(newLeadModel.getFirstInvoice());
        waitVisible(newLeadPage.getPeriodicPaymentInput()).sendKeys(newLeadModel.getPeriodicPayment());
        waitVisible(newLeadPage.getLastInvoiceDrp()).sendKeys(newLeadModel.getLastInvoice());
        Thread.sleep(2000);
        waitVisible(navigatePage.getSaveBtn()).click();

//        String nameLead = waitVisible(newLeadPage.getLeadNameInput()).getAttribute("value");
//        Assert.assertTrue(nameLead.isEmpty());
//        System.out.println(nameLead.isEmpty() ? "Invalid" : "Valid");

    }

}
