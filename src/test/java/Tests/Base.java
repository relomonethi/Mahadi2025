package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.TakeScreenshots;
import Pages.CartPage;
import Pages.CheckOutPage;
import Pages.InformationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.testng.annotations.Test;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome","https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
    InformationPage informationPage = PageFactory.initElements(driver, InformationPage.class);
    CheckOutPage checkOutPage = PageFactory.initElements(driver, CheckOutPage.class);


    TakeScreenshots takeScreenshots = new TakeScreenshots();

//    @Test
//    public void test()
//    {
//
//    }
}
