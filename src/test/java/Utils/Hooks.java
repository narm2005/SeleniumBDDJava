package Utils;

//import cucumber.api.java.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static BrowserDriver driver;
    public static ChromeOptions options;

    @Before
    public void setUp(){
        driver = new BrowserDriver();

    }


}
