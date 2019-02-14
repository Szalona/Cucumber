package step;

import cucumber.api.java.en.*;
import platform.assertion.AssertionPage;
import platform.client.NewClientPage;

public class NewClientStep {

    NewClientPage newClientPage = new NewClientPage();

    @And("^complete \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" about client$")
    public void completeForm(String fullname, String shortname, String taxID) {
        newClientPage.completeNewClientForm(fullname, shortname, taxID);
    }

    AssertionPage assertionPage = new AssertionPage();

    @Then("^see success notification \"([^\"]*)\"$")
    public void seeSuccessNotification(String fullname) {
        assertionPage.assertNotificationIsVisible(fullname);
    }
}
