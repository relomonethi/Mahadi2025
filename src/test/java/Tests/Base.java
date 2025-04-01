package Tests;

import Pages.*;
import Pages.LoginPage;
import Utils.BrowserFactory;
import Utils.TakeScreenshots;
import Pages.CartPage;
import Pages.CheckOutPage;
import Pages.InformationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome","https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);

    CartPage cartPage = PageFactory.initElements(driver, CartPage.class);

    InformationPage informationPage = PageFactory.initElements(driver, InformationPage.class);

    CheckOutPage checkOutPage = PageFactory.initElements(driver, CheckOutPage.class);

    ReadFromExcel readFromExcel;

    {
        try {
            readFromExcel = new ReadFromExcel();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    TakeScreenshots takeScreenshots = new TakeScreenshots();

    // @Test
    // public void test()
    // {
    // }
}
