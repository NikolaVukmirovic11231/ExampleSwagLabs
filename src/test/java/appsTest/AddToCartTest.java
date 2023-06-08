package appsTest;

import Pages.AddToCart;
import Pages.BuyItemPageElements;
import Pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddToCartTest extends Base{


    LoginPage loginPageObj = new LoginPage(driver);

    BuyItemPageElements buyItemPageElementsObj = new BuyItemPageElements(driver);

    AddToCart addToCartObj = new AddToCart(driver);


    @Test
    public void addToCartTest() {

         addToCartObj.clickAddBackpackToCart();

         addToCartObj.clickAddBikeLampToCart();

         addToCartObj.clickAddFleeceJacketToCart();

         Assert.assertTrue(addToCartObj.numberOfItemsInCart());

         String removeFromCartText = "Remove";

         Assert.assertTrue(addToCartObj.removeItemFromCartText().equals(removeFromCartText));

         buyItemPageElementsObj.openCart();

         String expectedTextWhenOpenCart = "Your Cart";

         Assert.assertTrue(addToCartObj.yourCartTextAssertation().equals(expectedTextWhenOpenCart));

         Assert.assertTrue(addToCartObj.itemAtCartToProveAdding());







    }

    @Before
   public void login(){

       loginPageObj.login();

    }

}

