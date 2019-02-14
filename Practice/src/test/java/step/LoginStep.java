package step;

import cucumber.api.java.en.*;
import platform.assertion.AssertionPage;
import platform.login.LoginPage;
import static setup.Credentials.*;

public class LoginStep {

    @Given("^login to platform as Ewa Testowa user$")
    public void loginToPlatformAsEwaTestowaUser() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(USERNAME_EWA_TESTOWA, PASSWORD_EWA_TESTOWA);
    }

    @Then("^see loaded page$")
    public void seeLoadedPage() {
        AssertionPage assertionPage = new AssertionPage();
        assertionPage.assertHeaderIsVisible(USERNAME_EWA_TESTOWA, PASSWORD_EWA_TESTOWA);
    }
}
