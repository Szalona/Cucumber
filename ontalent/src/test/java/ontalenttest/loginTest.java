package ontalenttest;

import model.LoginModel;
import ontalentbase.TestConfigurationBase;
import org.junit.Assert;
import org.testng.annotations.*;
import page.LoginPage;

public class loginTest extends TestConfigurationBase {

    @Test
    public void correctLogin(){
        LoginModel loginModel = new LoginModel();
        loginModel.setUsername(super.userName);
        loginModel.setPassword(super.password);

        LoginPage loginPage = new LoginPage();
        driver.findElement(loginPage.getUsernameInput()).sendKeys(loginModel.getUsername());
        driver.findElement(loginPage.getPasswordInput()).sendKeys(loginModel.getPassword());
        driver.findElement(loginPage.getLoginBtn()).click();

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, super.url);
        System.out.println(URL);
    }

    @Test
    public void incorrectLogin() {
        LoginModel loginModel = new LoginModel();
        loginModel.setUsername(super.userName);
        loginModel.setPassword("coko");

        LoginPage loginPage = new LoginPage();
        driver.findElement(loginPage.getUsernameInput()).sendKeys(loginModel.getUsername());
        driver.findElement(loginPage.getPasswordInput()).sendKeys(loginModel.getPassword());
        driver.findElement(loginPage.getLoginBtn()).click();

        String actual = waitVisible(loginPage.getWrongMailPasswordMsg()).getText();
        Assert.assertEquals("Wrong password", "Invalid username or password.", actual);
        System.out.println("Wrong password");
    }
}
