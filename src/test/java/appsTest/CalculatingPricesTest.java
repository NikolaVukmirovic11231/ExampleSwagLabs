package appsTest;

import Pages.AddToCart;
import Pages.BuyItemPageElements;
import Pages.CheckoutPage;
import Pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatingPricesTest extends Base{

    AddToCart addToCartObj = new AddToCart(driver);

    BuyItemPageElements buyItemObj = new BuyItemPageElements(driver);

    LoginPage loginPageObj = new LoginPage(driver);

    CheckoutPage checkoutPageObj = new CheckoutPage(driver);

    @Test
    public void calculatingMultiplePrices() {

        addToCartObj.clickAddBackpackToCart();

        addToCartObj.clickAddBikeLampToCart();

        buyItemObj.openCart();

        buyItemObj.clickCheckoutButton();

        buyItemObj.getRandomFirstNameByFaker();

        buyItemObj.getRandomLastNameByFaker();

        buyItemObj.getRandomPostalCodeByFaker();

        buyItemObj.clickOnContinueButtonAfterEnteringCredentials();



//        double x = checkoutPageObj.calculatingPricesManually(29.99,9.99,3.2);
//
//        double expectedPriceManuallyCalculated = 43.18;
//
//        Assert.assertTrue(x == expectedPriceManuallyCalculated);




        String backpackPrice = "$29.99";

        String bikeLampPrice = "$9.99";

        String taxPrice = "$3.20";

        String expectedTotalPrice = "Total: $43.18";

        Assert.assertTrue(expectedTotalPrice.equals(checkoutPageObj.getTotalPrice()));


    }

    @Before
   public void login(){

       loginPageObj.login();

   }
}
