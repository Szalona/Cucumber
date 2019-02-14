package steps;

import ontalentbase.TestConfigurationBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page.NavigatePage;

public class NavigateStep extends TestConfigurationBase {

    public void navigateThroughPlatform() {

        NavigatePage navigatePage = new NavigatePage();

        waitVisible(navigatePage.getPlatformLogo());
        wait.until(ExpectedConditions.invisibilityOfElementLocated(navigatePage.getPlatformLogo()));
    }
}
