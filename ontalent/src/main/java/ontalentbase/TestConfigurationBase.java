package ontalentbase;

import model.LoginModel;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.LoginPage;

public class TestConfigurationBase {
    public String userName = "ewa.tusinska@onwelo.com";
    public String password = "cokolwiek";
    public String url = "https://ontalent-tst.onwelo.com/";

    private static final String CHROME_FILEPATH = "/drivers/chromedriver.exe";
    private static final String FIREFOX_FILEPATH = "/drivers/geckodriver.exe";

    public WebDriver driver;
    public WebDriverWait wait;

    public TestConfigurationBase() {
        this.driverInit();
        this.waitInit();
    }

    public WebElement waitVisible(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public boolean waitInvisibility(By by) {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public void expandDropDownAndClickOption(By dropDown, String value) {
        WebElement dropDownElement = driver.findElement(dropDown);
        dropDownElement.click();
        dropDownElement.findElement(By.xpath("//md-option[@value='" + value + "']")).click();
        // //md-option[@value='SRV']"
    }

    public void login() {
        LoginModel loginModel = new LoginModel();
        loginModel.setUsername(this.userName);
        loginModel.setPassword(this.password);

        LoginPage loginPage = new LoginPage();
        driver.findElement(loginPage.getUsernameInput()).sendKeys(loginModel.getUsername());
        driver.findElement(loginPage.getPasswordInput()).sendKeys(loginModel.getPassword());
        driver.findElement(loginPage.getLoginBtn()).click();

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, this.url);
        System.out.println(URL);
    }

    public void closePage() {
        driver.close();
    }

    private void driverInit() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://ontalent-tst.onwelo.com/");
        driver.manage().window().maximize();
    }

    private void waitInit() {
        wait = new WebDriverWait(driver, 3000);
    }
}
