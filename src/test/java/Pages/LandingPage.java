package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LandingPage {

    WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }
        public void verifyProductText() {
            String ProductText = driver.findElement(By.xpath("//*[@id='header_container']/div[2]/span")).getText();
            Assert.assertEquals(ProductText, "Products");
        }

        public void addToCart(){
            WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
            addToCart.click();
        }
}