package Tests;

import org.testng.annotations.Test;

@Test
public class purchaseItemTests extends Base{


    public void enterUsernameTests(){
        loginPage.enterUsername("standard_user");
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTest(){
        loginPage.enterPassword("secrect_sauce");

    }
    @Test(dependsOnMethods = "enterPasswordTest")
    public void clickLoginTests(){
        takeScreenshots.takesSnapShot(driver,"Login Page");
        loginPage.clickLoginButton();
    }
    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess(){
        takeScreenshots.takesSnapShot(driver,"Landing Page");
        landingPage.verifyProductText();
    }
    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void addToCartTest(){
        landingPage.addToCart();
    }
    @Test(dependsOnMethods = "addToCartTest")
    public void clickCartTests(){
        landingPage.clickCart();
    }

}
