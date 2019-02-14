package platform.login;

import org.openqa.selenium.By;
import setup.Base;
import setup.Elements;
import setup.Wait;

public class LoginPage extends Base {

    private By usernameInput = By.name("username");
    private By passwordInput = By.name("password");
    private By submitBtn = By.name("login");
    private By loginError = By.xpath("//*[@id=\"kc-feedback-wrapper\"]/span");

    LoginModel loginModel = new LoginModel();

    public LoginPage() {
        setLogger(LoginPage.class.getName());
    }

    public void setUsername(String usernameData) {
        waitSendkeys(Wait.VISIBLE, usernameInput, loginModel.getUserName(), usernameData);
    }

    public void setPassword(String passwordData) {
        waitSendkeys(Wait.VISIBLE, passwordInput, loginModel.getPassword(), passwordData);
    }

    public void submit() {
        waitClick(Wait.CLICKABLE, submitBtn, loginModel.getSubmit());
    }

    public void login(String usernameData, String passwordData) {
        setUsername(usernameData);
        setPassword(passwordData);
        submit();
    }

    public void assertLoginError() {
        assertText(Wait.VISIBLE, loginError, Elements.TEXT, loginModel.getLoginError(), "Invalid username or password.");
    }
}
