package StepDefinitions;

import Pages.loginPage;
import Utility.Hooks;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static Utility.Hooks.getDriver;

//import static java.lang.Thread.sleep;

public class loginStep {
    public WebDriver driver;

    loginPage lp;

    public loginStep()throws Exception{
        this.driver = getDriver();
        lp = new loginPage (driver);
    }



    @Given("user open browser with credentials")
    public void user_open_browser() throws InterruptedException{
        driver.get("https://dev-moewoe.amiprobashi.com");
        Thread.sleep(1000);

        lp.set_username();
        Thread.sleep(2000);

        lp.set_password();
        Thread.sleep(2000);

        lp.click_login_button();
        Thread.sleep(2000);


    }
//    @When("user inputs username")
//    public void user_inputs_username() throws InterruptedException{
//        lp.set_username();
//        Thread.sleep(2000);
//    }
//    @And("user inputs password")
//    public void user_inputs_password() throws InterruptedException {
//        lp.set_password();
//        Thread.sleep(2000);
//    }
//    @And("user click login button")
//    public void user_click_login_button() throws InterruptedException {
//        lp.click_login_button();
//        Thread.sleep(2000);
//    }









}
