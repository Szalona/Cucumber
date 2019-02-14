package sales;

import model.NewClientModel;
import ontalentbase.TestConfigurationBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;
import page.NavigatePage;
import page.NewClientPage;

public class newClientTest extends TestConfigurationBase {

    @BeforeClass
    public void shouldLoginPlatform() {
        super.login();

        NavigatePage navigatePage = new NavigatePage();
        waitVisible(navigatePage.getPlatformLogo());
        wait.until(ExpectedConditions.invisibilityOfElementLocated(navigatePage.getPlatformLogo()));
        waitVisible(navigatePage.getSaleBtn()).click();
        waitVisible(navigatePage.getRecentlyClientsBtn()).click();
    }

    @DataProvider(name="newClientModelFailureData")
    public Object[][] getFullNameData() {
        return new Object[][]{
            { new NewClientModel("", "", "5555", "Ewa Testowa", "Test") },
            { new NewClientModel("", "", "666", "Ewa Testowa", "TseT") }
        };
    }

    @Test(dataProvider = "newClientModelFailureData")
    public void shouldNotCreateNewClient(NewClientModel newClientModel) {

        NewClientPage newClientPage = new NewClientPage();
        waitVisible(newClientPage.getNewClientBtn()).click();
        waitVisible(newClientPage.getFullNameInput());
        driver.findElement(newClientPage.getFullNameInput()).sendKeys(newClientModel.getFullName());
        waitVisible(newClientPage.getShortNameInput());

        driver.findElement(newClientPage.getShortNameInput()).sendKeys(newClientModel.getShortName());
        waitVisible(newClientPage.getRegionDrp());

        expandDropDownAndClickOption(newClientPage.getRegionDrp(), "ER");

        waitVisible(newClientPage.getTaxIDInput());
        driver.findElement(newClientPage.getTaxIDInput()).sendKeys(newClientModel.getTaxID());

        waitVisible(newClientPage.getIndustryDrp());
        expandDropDownAndClickOption(newClientPage.getIndustryDrp(), "TEL");
        waitInvisibility(newClientPage.getIndustryScroll());

        waitVisible(newClientPage.getAccountManagerInput());
        driver.findElement(newClientPage.getAccountManagerInput()).sendKeys(newClientModel.getAccountManager());
        waitVisible(newClientPage.getChipInput());
        driver.findElement(newClientPage.getChipInput()).click();

        String fullName = waitVisible(newClientPage.getFullNameInput()).getAttribute("value");
        Assert.assertTrue(fullName.isEmpty());
        System.out.println(fullName.isEmpty() ? "Invalid" : "Valid");
        String shortName = waitVisible(newClientPage.getShortNameInput()).getAttribute("value");
        Assert.assertTrue(shortName.isEmpty());
        System.out.println(shortName.isEmpty() ? "Invalid" : "Valid");
    }

    @AfterMethod
    public void quitPlatform() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='oo-lead-form-dialog']/md-toolbar/div/button/md-icon")).click();
        Thread.sleep(3000);
    }
}
