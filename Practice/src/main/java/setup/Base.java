package setup;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.time.LocalDate;

import static java.awt.event.KeyEvent.*;

public abstract class Base {
    public static final String PLATFORM_URL = "...";
    public static final int NUMBER_OF_MINISECONDS_TO_SLEEP_THREAD = 500;

    private static final String CHROME_FILEPATH = "/drivers/chromedriver.exe";
    private static final String FIREFOX_FILEPATH = "/drivers/geckodriver.exe";

    private static WebDriver driver;
    private static WebDriverWait wait;
    private static WebDriverWait longWait;
    private static WebElement waitBy;

    public Logger log;

    public Base() {
        setLogger(Base.class.getName());
    }

    public void setLogger(String loggerClass) {
        log = LoggerFactory.getLogger(loggerClass);
    }

    public void openBrowserGetURL(Browser browser, String url) {
        openBrowser(browser);
        getURL(url);
    }

    private void openBrowser(Browser browser) {
        switch (browser) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", getClass().getResource(CHROME_FILEPATH).getPath());
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", getClass().getResource(FIREFOX_FILEPATH).getPath());
                driver = new FirefoxDriver();
                break;
        }
        log.info(String.format("'%s' browser has been started", browser));
        wait = new WebDriverWait(driver, 30);
        longWait = new WebDriverWait(driver, 60);
    }

    private void getURL(String url) {
        driver.get(url);
        driver.manage().window().maximize();
        log.info(String.format("'%s' url has been opened", url));
    }

    public WebElement visible(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public boolean invisible(By by) {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }
    public WebElement presence(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public WebElement clickable(By by) {
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    private WebElement chooseWait(Wait wait, By by) {
        switch (wait) {
            case VISIBLE:
                waitBy = visible(by);
                break;
            case PRESENCE:
                waitBy = presence(by);
            case CLICKABLE:
                waitBy = clickable(by);
                break;
        }
        return waitBy;
    }

    public void visibleInvisible(By by) {
        visible(by);
        invisible(by);
    }

    public boolean display(By by) {
        return driver.findElement(by).isDisplayed();
    }

    public void waitClick(Wait wait, By by, String elementName) {
        chooseWait(wait, by).click();
        log.debug(String.format("'%s' button has been clicked", elementName));
    }

    public void waitSendkeys(Wait wait, By by, String elementName, String text) {
        chooseWait(wait, by).sendKeys(text);
        log.debug(String.format("'%s' input has been filled by '%s' data", elementName, text));
    }

    public void waitClear(Wait wait, By by, String elementName) {
        chooseWait(wait, by).clear();
        log.debug(String.format("'%s' input has been cleared", elementName));
    }

    public void waitClearSendkeys(Wait wait, By by, String elementName, String text) {
        waitClear(wait, by, elementName);
        waitSendkeys(wait, by, elementName, text);
    }

    public void expandDropDownAndClickOption(Wait wait,By by, String element) {
        WebElement dropDownElement = driver.findElement(by);
        dropDownElement.click();
        dropDownElement.findElement(By.xpath("//md-option[@value='" + element + "']")).click();
        // //md-option[@value='SRV']"
    }

    public void assertText(Wait wait, By by, Elements elements, String elementName, String expected){
        String actual = null;
        switch (elements){
            case TEXT:
                actual = chooseWait(wait, by).getText();
                break;
            case ATTRIBUTE:
                actual = chooseWait(wait, by).getAttribute("value");
                break;
        }
        Assert.assertEquals(expected, actual);
        log.info(String.format("'%s' appeared properly as '%s'", actual, elementName));
    }

    public void assertContainText(Wait wait, By by, String elementName, String expected){
        String fullText = chooseWait(wait, by).getAttribute("value");
        Assert.assertTrue(String.format("'%s' didn't appear as '%s'", expected, elementName), fullText.contains(expected));
        log.info(String.format("'%s' appeared properly as '%s'", expected, elementName));
    }

    public String getLastMonthDate() {
        return LocalDate.now().minusMonths(1).toString().substring(0, 7);
    }

    public void provideFilePathInWindowsDialog(String resourceFilePath) throws AWTException, InterruptedException {
        Thread.sleep(NUMBER_OF_MINISECONDS_TO_SLEEP_THREAD);
        Robot robot = new Robot();
        String filePath = getClass().getResource(resourceFilePath).getPath();
        filePath = filePath.replaceAll("/", "\\\\");
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        robot.keyPress(VK_CONTROL);
        robot.keyPress(VK_V);
        robot.keyRelease(VK_V);
        robot.keyRelease(VK_CONTROL);
        Thread.sleep(NUMBER_OF_MINISECONDS_TO_SLEEP_THREAD);
        robot.keyPress(VK_ENTER);
        robot.keyRelease(VK_ENTER);
        log.debug(String.format("'%s' resource path has been provided", resourceFilePath));
    }

    public void scrollHorizontal(By by){
        Actions action = new Actions(driver);
        action.moveToElement(visible(by)).clickAndHold();
        action.moveByOffset(125,0);
        action.release();
        action.perform();
        log.debug("Page has been scrolled horizontal");
    }

    public void closeBrowser(Browser browser){
        driver.quit();
        log.info(String.format("'%s' browser has been closed", browser));
    }
}
