package page;

import org.openqa.selenium.By;

public class LoginPage {
    private By usernameInput = By.id("username");
    private By passwordInput = By.id("password");
    private By loginBtn = By.id("kc-login");
    private By wrongMailPasswordMsg = By.xpath("//*[@id=\"kc-feedback-wrapper\"]/span");

    public By getUsernameInput() {
        return this.usernameInput;
    }
    public By getPasswordInput() {
        return this.passwordInput;
    }
    public By getLoginBtn() {
        return this.loginBtn;
    }
    public By getWrongMailPasswordMsg() {
        return this.wrongMailPasswordMsg;
    }

}
