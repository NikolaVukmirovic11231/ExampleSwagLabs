package appsTest;

import Pages.BuyItemPageElements;
import Pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class BuyItemTest extends Base {
    
    LoginPage objectLoginPage = new LoginPage(driver);

    BuyItemPageElements objectInventoryPage = new BuyItemPageElements(driver);




    @Test
    public void buyItem() throws InterruptedException {

        objectInventoryPage.addBackpackToCart();

        objectInventoryPage.openCart();

        objectInventoryPage.clickCheckoutButton();

        String expectedCheckoutUrl = "https://www.saucedemo.com/checkout-step-one.html";

        Assert.assertTrue(expectedCheckoutUrl.equals(driver.getCurrentUrl()));

//        objekatZaInventoryPage.enterFirstNameCheckout("Nikola");
//
//        objekatZaInventoryPage.enterLastNameCheckout("Vukmirovic");
//
//        objekatZaInventoryPage.enterPostalCodeCheckout(String.valueOf(11231));

        objectInventoryPage.getRandomFirstNameByFaker();

        objectInventoryPage.getRandomLastNameByFaker();

        objectInventoryPage.getRandomPostalCodeByFaker();

        Thread.sleep(2000);

        objectInventoryPage.clickOnContinueButtonAfterEnteringCredentials();

        objectInventoryPage.shippingTextDisplayed();

        objectInventoryPage.pressLastFinishButton();

        objectInventoryPage.thankYouForYourOrderTextIsDisplayedAssert();

        objectInventoryPage.backToProductsAfterOrdering();

        String expectedUrlAfterOrdering = "https://www.saucedemo.com/inventory.html";

        Assert.assertTrue(expectedUrlAfterOrdering.equals(driver.getCurrentUrl()));



    }

    @Before
    public void url() throws InterruptedException {


        objectLoginPage.login();

    }
}