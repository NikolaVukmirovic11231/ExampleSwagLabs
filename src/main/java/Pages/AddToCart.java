package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {


    public WebDriver driver;

    public By addBackpackToCart = By.xpath("//*[@name='add-to-cart-sauce-labs-backpack']");

    public By addBikeLampToCart = By.xpath("//*[@name='add-to-cart-sauce-labs-bike-light']");

    public By addFleeceJacketToCart = By.xpath("//*[@name='add-to-cart-sauce-labs-fleece-jacket']");

    public By cartIconWithNumberOfAddedItems = By.xpath("//*[@class='shopping_cart_badge'][text()='3']");

    public By removeItemFromCart = By.xpath("//*[@name='remove-sauce-labs-bike-light']");

    public By yourCartTextInUpperLeftCorner = By.xpath("//*[text()='Your Cart']");

    public By backpackLocatedAtCart = By.xpath("//*[text()='Sauce Labs Backpack']");

    public By removeBackpackFromCart = By.xpath("//*[@name='remove-sauce-labs-backpack']");

    public By removeBikeLightFromCart = By.xpath("//*[@name='remove-sauce-labs-bike-light']");

    public By removeFleeceJacketFromCart = By.xpath("//*[@name='remove-sauce-labs-fleece-jacket']");

    public By emptyCartIcon = By.xpath("//*[@class='shopping_cart_link']");

//    public By zeroItemsInCart = By.xpath("//*[@class='shopping_cart_badge'][text()='0']");

    public AddToCart(WebDriver driver) {

        this.driver = driver;

    }

    public void clickAddBackpackToCart() {

        driver.findElement(addBackpackToCart).click();

    }

    public void clickAddBikeLampToCart() {

        driver.findElement(addBikeLampToCart).click();

    }

    public void clickAddFleeceJacketToCart() {

        driver.findElement(addFleeceJacketToCart).click();

    }

    public boolean numberOfItemsInCart() {

        return driver.findElement(cartIconWithNumberOfAddedItems).isDisplayed();


    }

    public String removeItemFromCartText() {

        return driver.findElement(removeItemFromCart).getText();

    }

    public String yourCartTextAssertation() {

        return driver.findElement(yourCartTextInUpperLeftCorner).getText();

    }

    public boolean itemAtCartToProveAdding() {

        return driver.findElement(backpackLocatedAtCart).isDisplayed();

    }

    public void removeBackpackFromCartAction() {

        driver.findElement(removeBackpackFromCart).click();


    }

    public void removeBikeLightFromCartAction(){

        driver.findElement(removeBikeLightFromCart).click();

    }

    public void removeFleeceJacketFromCartAction(){

        driver.findElement(removeFleeceJacketFromCart).click();

    }

    public boolean emptyCartIconToAssertRemovingFromCart(){

        return driver.findElement(emptyCartIcon).isDisplayed();

    }



}
