package step;

import cucumber.api.java.en.*;
import platform.navigation.NavigationPage;

public class NavigationStep {

    NavigationPage navigationPage = new NavigationPage();

    @When("^go to Platform$")
    public void goToPlatform() {
        navigationPage.goToPlatform();
    }

    @And("^click on Sales$")
    public void goToSales() {
        navigationPage.goToSales();
    }

    @And("^choose Recently visited clients$")
    public void clickOnRecentlyClients() {
        navigationPage.clickOnRecentlyClients();
    }

    @And("^click on Add new client$")
    public void clickOnNewClient() {
        navigationPage.clickOnNewClient();
    }

    @And("^click on Add new lead$")
    public void clickOnAddNewLead() {
        navigationPage.clickOnAddNewLead();
    }
}
