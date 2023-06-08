package Pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public static WebDriver driver;

    public By usernameInputField = By.xpath("//input[@name='user-name']");

    public By passwordInputField = By.xpath("//input[@class='input_error form_input'][@data-test='password']");

    public By submitLoginButton = By.xpath("//input[@class='submit-button btn_action']");

    public By messageIfCredentialsAreInvalid = By.xpath("//*[text()='Epic sadface: Username and password do not match any user in this service']");

    public By messageIfPasswordFieldIsEmpty = By.xpath("//*[text()='Epic sadface: Password is required']");

    public By messageIfUsernameFieldIsEmpty = By.xpath("//*[text()='Epic sadface: Username is required']");

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }


    public void enterUsername(String enterUsername){

        driver.findElement(usernameInputField).sendKeys(enterUsername);


    }

    public void enterPassword(String enterPassword){

        driver.findElement(passwordInputField).sendKeys(enterPassword);


    }

    public void clickOnSubmitButton(){

        driver.findElement(submitLoginButton).click();

    }

    public boolean errorMessage (){

       return driver.findElement(messageIfCredentialsAreInvalid).isDisplayed();



    }

    public boolean missingPasswordErrorMessage (){

        return driver.findElement(messageIfPasswordFieldIsEmpty).isDisplayed();

    }

    public boolean missingUsernameErrorMessage (){

        return driver.findElement(messageIfUsernameFieldIsEmpty).isDisplayed();

    }

    public void keyENTER(){

        driver.findElement(submitLoginButton).sendKeys(Keys.ENTER);

    }

    public void login(){

        driver.get("https://www.saucedemo.com/");

        driver.findElement(usernameInputField).sendKeys("standard_user");

        driver.findElement(passwordInputField).sendKeys("secret_sauce");

        driver.findElement(submitLoginButton).click();




    }








    }





