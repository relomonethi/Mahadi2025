package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


import java.time.Duration;

public class LoginPage {

    WebDriver driver;


    @FindBy(id = "user-name")
    WebElement userName_id;

    @FindBy(id = "password")
    WebElement password_id;

    @FindBy(id = "login-button")
    WebElement loginButton_id;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    //Input username method
    public void enterUsername(String username) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(userName_id));
        userName_id.sendKeys(username);
    }

    //Input password method
    public void enterPassword(String password) {
               password_id.sendKeys(password);
    }

    //Click login button method
    public void clickLoginButton() {
        loginButton_id.click();
    }


}
