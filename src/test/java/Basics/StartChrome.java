package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class StartChrome {

    WebDriver driver;

    @Test
    public void verifyLoginSuccess() throws InterruptedException, IOException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        takeScreenShot("login_page");
        Thread.sleep(1000);

        //Print page Title
        String pageTitle = driver.getTitle();
        System.out.println("Page Title:" + pageTitle);


        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.id("login-button")).click();

//Verify Product Page
        String ProductText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(ProductText, "Products");

        //driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("shopping_cart_container")).click();
        takeScreenShot("cart_page");

        driver.findElement(By.id("checkout")).click();
       takeScreenShot("cart_contents_container");
        Thread.sleep(1000);

        driver.findElement(By.id("first-name")).sendKeys("M");
        driver.findElement(By.id("last-name")).sendKeys("M");
        driver.findElement(By.id("postal-code")).sendKeys("8345");
        takeScreenShot("checkout_information_page");
        Thread.sleep(1000);

        driver.findElement(By.id("continue")).click();
        takeScreenShot("checkout_overview_page");
        Thread.sleep(1000);

        driver.findElement(By.id("finish")).click();
        takeScreenShot("checkout_complete_page");
        Thread.sleep(1000);

        driver.findElement(By.id("back-to-products")).click();
        takeScreenShot("products_page");
    }

    public void takeScreenShot(String fileName) throws IOException    {
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenshot, new File("src/Screenshots/" + fileName + ".png"));
    }
    @AfterTest
   public void closeBrowser() {
       driver.quit();
      }
    }