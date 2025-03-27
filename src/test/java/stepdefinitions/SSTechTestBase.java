package stepdefinitions;

import Utils.BrowserDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


//import static Utils.BrowserDriver.*;


public class SSTechTestBase  {
    //public BrowserDriver driver;
    public WebDriver browser;

    @Given("I login in to Portal")
    public void i_login_in_to_portal() {
        WebDriverManager.chromedriver().setup();  // Auto-downloads the correct ChromeDriver

        ///System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe"); // Windows

        browser = new ChromeDriver();
        //browser = driver.getDefaultDriver();

        browser.get("https://apps.sstech.us/portal/#/login");
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("I am on Home Page")
    public void i_am_on_home_page() {
        browser.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("npalanisamy");
        browser.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("narmi305");
        browser.findElement(By.xpath("//button[text()='Login ']")).click();

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("I validate user name is diaplayed")
    public void i_validate_user_name_is_displayed() {
        browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if(browser.getTitle() == "Office"){
            System.out.println("On the Home Page");
        }
        else {
            System.out.println(browser.getTitle());
        }
        //if (browser.findElement(By.xpath(   "//div[@class='name-title']/p[@class='name']")).getText() == "Narmadha Palanisamy")
        System.out.println("hey on the HOME");
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

    @After()
    public void closeBrowser()
    {
        browser.quit();

    }

}
