package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyItemPageElements {

    public static WebDriver driver;

    Faker fakerObj = new Faker();

    public By addBackpackToCart = By.xpath("//*[@name='add-to-cart-sauce-labs-backpack']");

    public By cartIcon = By.xpath("//*[@class='shopping_cart_link']");

    public By checkoutIcon = By.xpath("//*[@class='btn btn_action btn_medium checkout_button']");

    public By firstNameCheckoutInputField = By.xpath("//*[@class='input_error form_input'][@placeholder='First Name']");

    public By lastNameCheckoutInputField = By.xpath("//*[@class='input_error form_input'][@placeholder='Last Name']");

    public By postalCodeCheckoutInputField = By.xpath("//*[@class='input_error form_input'][@placeholder='Zip/Postal Code']");

    public By continueButtonToBuyItem = By.xpath("//*[@class='submit-button btn btn_primary cart_button btn_action']");

    public By shippingInformationTextAssert = By.xpath("//*[text()='Shipping Information']");

    public By checkoutStepTwoFinishButton = By.xpath("//*[@class='btn btn_action btn_medium cart_button']");

    public By thankYouForOrderText = By.xpath("//*[text()='Thank you for your order!']");

    public By backToHomePageAfterSuccsessfullOrder = By.id("back-to-products");







    public BuyItemPageElements(WebDriver driver) {

        this.driver = driver;
    }

    public void addBackpackToCart(){

        driver.findElement(addBackpackToCart).click();

    }

    public void openCart(){

        driver.findElement(cartIcon).click();

    }

    public void clickCheckoutButton(){

        driver.findElement(checkoutIcon).click();

    }

    public void enterFirstNameCheckout(String EnterFirstName){

        driver.findElement(firstNameCheckoutInputField).sendKeys(EnterFirstName);
    }

    public void enterLastNameCheckout(String enterLastName){

        driver.findElement(lastNameCheckoutInputField).sendKeys(enterLastName);

    }

    public void enterPostalCodeCheckout(String enterPostalCode){

        driver.findElement(postalCodeCheckoutInputField).sendKeys(enterPostalCode);

    }

    public void clickOnContinueButtonAfterEnteringCredentials(){

        driver.findElement(continueButtonToBuyItem).click();

    }

    public void shippingTextDisplayed(){

        driver.findElement(shippingInformationTextAssert).isDisplayed();

    }

    public  void pressLastFinishButton(){

        driver.findElement(checkoutStepTwoFinishButton).click();

    }

    public void thankYouForYourOrderTextIsDisplayedAssert(){

        driver.findElement(thankYouForOrderText).isDisplayed();

    }

    public void backToProductsAfterOrdering(){

        driver.findElement(backToHomePageAfterSuccsessfullOrder).click();

    }

    public void getRandomFirstNameByFaker(){

         driver.findElement(firstNameCheckoutInputField).sendKeys(fakerObj.name().firstName());

    }

    public void getRandomLastNameByFaker(){

        driver.findElement(lastNameCheckoutInputField).sendKeys(fakerObj.name().lastName());


    }

    public void getRandomPostalCodeByFaker(){


        driver.findElement(postalCodeCheckoutInputField).sendKeys(fakerObj.number().digits(5));



    }



}
