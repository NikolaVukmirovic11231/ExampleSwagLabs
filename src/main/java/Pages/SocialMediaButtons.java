package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SocialMediaButtons {

    public static WebDriver driver;

    public By twitterLogo = By.xpath("//a[@href='https://twitter.com/saucelabs']");

    public By facebookLogo = By.xpath("//a[@href='https://www.facebook.com/saucelabs']");

    public By linkedinLogo = By.xpath("//*[text()='LinkedIn']");


    public  SocialMediaButtons(WebDriver driver){

        this.driver = driver;

    }


//    public void TwitterFacebookInstagram(WebDriver driver){
//
//        this.driver = driver;
//
//    }

    public void clickTwitterLogo(){

        driver.findElement(twitterLogo).click();

    }
    public void clickFacebookLogo(){

        driver.findElement(facebookLogo).click();

    }

    public void clickLinkedinLogo(){

        driver.findElement(linkedinLogo).click();

    }

    public void sendESCKey(){

        driver.findElement(facebookLogo).sendKeys(Keys.ESCAPE);

    }




}
