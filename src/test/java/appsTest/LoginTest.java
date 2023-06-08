package appsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginTest extends Base {

    Pages.LoginPage loginPageObject = new Pages.LoginPage(driver);



    @Test
    public void testCase1() {

//      Login with incorrect username but correct password

        loginPageObject.enterUsername("false___username");

        loginPageObject.enterPassword("secret_sauce");

        loginPageObject.clickOnSubmitButton();

        String expectedUrl = "https://www.saucedemo.com/";

        Assert.assertTrue(expectedUrl.equals(driver.getCurrentUrl()));

        loginPageObject.errorMessage();

    }

    @Test
    public void testCase2() {

//        Login with correct credentials

        loginPageObject.login();



    }

    @Test
    public void testCase3() {

//        Login with empty password field

        loginPageObject.enterUsername("standard_user");

        loginPageObject.enterPassword("");

        loginPageObject.clickOnSubmitButton();

        loginPageObject.missingPasswordErrorMessage();

    }
    @Test
    public void testCase4(){

//        Login with empty username field

        loginPageObject.enterUsername("");

        loginPageObject.enterPassword("secret_sauce");

        loginPageObject.clickOnSubmitButton();

        loginPageObject.missingUsernameErrorMessage();

    }

    @Test
    public void testCase5() {

//        Login with pressing ENTER keyboard button instead of submit button

        loginPageObject.enterUsername("standard_user");

        loginPageObject.enterPassword("secret_sauce");

        loginPageObject.keyENTER();

        String expectedUrl = "https://www.saucedemo.com/inventory.html";

        Assert.assertTrue(expectedUrl.equals(driver.getCurrentUrl()));




    }

    @Before
    public void url() throws InterruptedException {

        driver.get("https://www.saucedemo.com/");
        
        Thread.sleep(500);
        

    }

    





}
