package platform.navigation;

import org.openqa.selenium.By;
import setup.Base;
import setup.Wait;

public class NavigationPage extends Base {

    private By platformLogo = By.xpath("//div[@class='logo']");
    private By ontalentLogo = By.xpath("//*[@id=\"vertical-navigation\"]/md-toolbar");
    private By salesTab = By.xpath("//span[text()='Sales']");
    private By recenltyVisitedClientsTab = By.xpath("//span[text()='Recently visited clients']");
    private By newClientBtn = By.xpath("//*[@id=\"new-client\"]/md-icon");
    private By nextBtn = By.xpath("//span[text()='Next']");
    private By backBtn = By.xpath("//span[text()='Back']");
    private By saveBtn = By.xpath("//span[text()='Save']");
    private By clientNameTab = By.xpath("//tbody[@class='md-body']/tr[4]/td[6]");
    private By addMoreBtn = By.xpath("//button[@ng-click=\"addNewManagerRow()\"]");
    private By leadsBtn = By.xpath("//button[@ng-click=\"toolbar.newLead()\"]");

    NavigationModel navigationModel = new NavigationModel();

    public void goToPlatform() {
        visible(platformLogo);
        invisible(platformLogo);
    }

    public void goToSales() {
        waitClick(Wait.VISIBLE, salesTab, navigationModel.getSales());
    }

    public void clickOnRecentlyClients() {
        waitClick(Wait.VISIBLE, recenltyVisitedClientsTab, navigationModel.getRecentlyVisitedClients());
    }

    public void clickOnNewClient() {
        waitClick(Wait.VISIBLE, newClientBtn, navigationModel.getNewClient());
    }

    public void clickOnAddNewLead() {
        waitClick(Wait.VISIBLE, clientNameTab, navigationModel.getClientName());
        waitClick(Wait.VISIBLE, leadsBtn, navigationModel.getLeads());
    }

    public void clickOnNext() {
        waitClick(Wait.VISIBLE, nextBtn, navigationModel.getNext());
    }

    public void clickOnSave() {
        waitClick(Wait.CLICKABLE, saveBtn, navigationModel.getSave());
    }

    public void addMore() {
        waitClick(Wait.VISIBLE, addMoreBtn, navigationModel.getAddMore());
    }
}
