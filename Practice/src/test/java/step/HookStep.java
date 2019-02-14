package step;

import setup.Base;

import cucumber.api.java.Before;
import setup.Browser;

public class HookStep extends Base {
    @Before
    public void beforeScenario() {
        openBrowserGetURL(Browser.CHROME, PLATFORM_URL);
    }

//    @After
//    public void afterScenario() {
//        closeBrowser(chrome);
//    }
}
