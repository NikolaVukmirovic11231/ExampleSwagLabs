package appsTest;

import Pages.AddToCart;
import Pages.BuyItemPageElements;
import Pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveFromCartTest extends Base{


    AddToCart addToCartObj = new AddToCart(driver);


    LoginPage loginPageElementsObj = new LoginPage(driver);






    @Test
    public void removeFromCartTest() throws InterruptedException {

        addToCartObj.clickAddBikeLampToCart();

        addToCartObj.clickAddBackpackToCart();

        addToCartObj.clickAddFleeceJacketToCart();

        Thread.sleep(1000);

        addToCartObj.removeBackpackFromCartAction();

        Thread.sleep(1000);

        addToCartObj.removeBikeLightFromCartAction();

        Thread.sleep(1000);

        addToCartObj.removeFleeceJacketFromCartAction();

        Thread.sleep(1000);


        driver.findElement(addToCartObj.emptyCartIcon).isDisplayed();

//        driver.findElement(addToCartObj.zeroItemsInCart).isDisplayed();










    }





    @Before
    public void loginAction(){

        loginPageElementsObj.login();

    }
}
