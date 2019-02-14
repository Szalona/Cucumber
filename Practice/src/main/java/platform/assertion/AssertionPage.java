package platform.assertion;

import org.openqa.selenium.By;
import setup.Base;
import setup.Elements;
import setup.Wait;

public class AssertionPage extends Base {

    private By header = By.xpath("//*[@id=\"calendar\"]/div/div[1]/h2/span");
    private By notification = By.xpath("//span[@class='md-toast-text ng-binding']");

    AssertionModel assertionModel = new AssertionModel();

    public AssertionPage() {
        setLogger(AssertionPage.class.getName());
    }

    public void assertHeaderIsVisible(String username, String password) {
        assertText(Wait.VISIBLE, header, Elements.TEXT, assertionModel.getHeader(), "Calendar");
        log.debug(String.format("'%s' user with '%s' password has been logged", username, password));
    }

    public void assertNotificationIsVisible(String fullname) {
        String notificationText = String.format("Client %s has been created.", fullname);
        assertText(Wait.VISIBLE, notification, Elements.TEXT, assertionModel.getNotification(), notificationText);
        log.debug(String.format("Client '%s' has been created.", fullname));
    }
}