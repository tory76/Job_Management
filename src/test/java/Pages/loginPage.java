package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    @FindBy (xpath = "//*[@id=\"exampleFormControlInput1\"]")
    public WebElement username;

    @FindBy(xpath = "(//input[@id='exampleFormControlInput1'])[2]")
    public WebElement password;

    @FindBy(id = "kt_login_signin_submit")
    public WebElement login;


    public loginPage(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }

    public void set_username() throws InterruptedException {

        username.sendKeys("F.M.Q._Establishment");
        Thread.sleep(2000);


    }


    public void set_password() throws InterruptedException {
      password.sendKeys("Ra0@test2");
      Thread.sleep(2000);

    }

    public void click_login_button() throws InterruptedException {

        login.click();
    }


}
