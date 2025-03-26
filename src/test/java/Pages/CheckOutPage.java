package Pages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class CheckOutPage {

    WebDriver driver;

    public CheckOutPage(){
        this.driver = driver;
    }

    public void clickCheckoutButton(){
        driver.findElement(By.id("checkout")).click();
    }
}
