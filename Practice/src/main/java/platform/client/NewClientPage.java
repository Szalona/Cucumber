package platform.client;

import org.openqa.selenium.By;
import platform.navigation.NavigationPage;
import setup.Base;
import setup.Wait;

import static platform.dictionary.RegionDict.*;
import static platform.dictionary.IndustryDict.*;

public class NewClientPage extends Base {

    private By fullNameInput = By.name("name");
    private By shortNameInput = By.name("shortName");
    private By regionDrp = By.name("region");
    private By taxIDInput = By.name("taxId");
    private By industryDrp = By.name("industry");
    private By partnerDrp = By.name("partner");
    private By ndaTypeDrp = By.name("ndaType");
    private By accountManagerInput = By.cssSelector("[ng-model='vm.model.accountManager'] input");
    private By acChip = By.cssSelector("span[class='highlight']");

    NewClientModel newClientModel = new NewClientModel();
    NavigationPage navigationPage = new NavigationPage();

    public void setFullname(String fullnameData) {
        visible(fullNameInput);
        waitSendkeys(Wait.VISIBLE, fullNameInput, newClientModel.getFullName(), fullnameData);
    }

    public void setShortname(String shortnameData) {
        waitSendkeys(Wait.VISIBLE, shortNameInput, newClientModel.getShortName(), shortnameData);
    }

    public void setRegion() {
        expandDropDownAndClickOption(Wait.VISIBLE, regionDrp, EUROPE.getData());
    }

    public void setTaxID(String taxIDData) {
        waitSendkeys(Wait.VISIBLE, taxIDInput, newClientModel.getTaxID(), taxIDData);
    }

    public void setIndustry() {
        visible(industryDrp);
        visible(industryDrp);
        expandDropDownAndClickOption(Wait.VISIBLE, industryDrp, IT_SERVICES.getData());
    }

    public void setAM() {
        visible(accountManagerInput);
        waitSendkeys(Wait.VISIBLE, accountManagerInput, newClientModel.getAccountManager(), "Ewa Testowa");
        waitClick(Wait.VISIBLE, acChip, newClientModel.getAcChip());
    }

    public void completeNewClientForm(String fullnameData, String shortnameData, String taxIDData) {
        setFullname(fullnameData);
        setShortname(shortnameData);
        setRegion();
        setTaxID(taxIDData);
        setIndustry();
        setAM();
        navigationPage.clickOnSave();
    }
}
