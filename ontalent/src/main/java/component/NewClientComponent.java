package component;

import model.NewClientModel;
import ontalentbase.TestConfigurationBase;
import page.NewClientPage;

public class NewClientComponent extends TestConfigurationBase {
    public void completeNewClient() {
        NewClientModel newClientModel = new NewClientModel();
        newClientModel.setFullName("Testowy");
        newClientModel.setShortName("Tst");
        newClientModel.setTaxID("5555");
        newClientModel.setAccountManager("Ewa Testowa");
        newClientModel.setGeneralRemarks("Test");

        NewClientPage newClientPage = new NewClientPage();
        waitVisible(newClientPage.getNewClientBtn()).click();
        waitVisible(newClientPage.getFullNameInput());
        driver.findElement(newClientPage.getFullNameInput()).sendKeys(newClientModel.getFullName());
        waitVisible(newClientPage.getShortNameInput());
        driver.findElement(newClientPage.getShortNameInput()).sendKeys(newClientModel.getShortName());
        waitVisible(newClientPage.getRegionDrp());
        expandDropDownAndClickOption(newClientPage.getRegionDrp(), "ER");
        driver.findElement(newClientPage.getTaxIDInput()).sendKeys(newClientModel.getTaxID());
        expandDropDownAndClickOption(newClientPage.getIndustryDrp(), "SRV");
        driver.findElement(newClientPage.getAccountManagerInput()).sendKeys(newClientModel.getAccountManager());
    }
}
