package appsTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Iterator;
import java.util.Set;

public class SocialMediaButtonTest extends Base{

    Pages.LoginPage loginPageObject = new Pages.LoginPage(driver);

    Pages.SocialMediaButtons socialMediaPageObject = new Pages.SocialMediaButtons(driver);



    @Test
    public void testTwitterLink() throws InterruptedException {

    socialMediaPageObject.clickTwitterLogo();

    Thread.sleep(2000);

    Set <String> handlesObj =  driver.getWindowHandles();

    Iterator it = handlesObj.iterator();

    String parentTab = (String) it.next();

    String childTab = (String) it.next();

    Thread.sleep(2000);

    driver.switchTo().window(childTab);

    String expectedUrlTwitterTab = "https://twitter.com/saucelabs";

    Assert.assertTrue(expectedUrlTwitterTab.equals(driver.getCurrentUrl()));

    System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(parentTab);


    }

    @Test
    public void testFacebookLink() throws InterruptedException {

        socialMediaPageObject.clickFacebookLogo();

        Thread.sleep(2000);

        Set <String> handlesObj =  driver.getWindowHandles();

        Iterator it = handlesObj.iterator();

        String parentTab = (String) it.next();

        String childTab = (String) it.next();

        driver.switchTo().window(childTab);

        Thread.sleep(3000);

        String expectedUrlOnFacebookTab = "https://www.facebook.com/saucelabs";

        Assert.assertTrue(expectedUrlOnFacebookTab.equals(driver.getCurrentUrl()));

        System.out.println(driver.getCurrentUrl());


        Thread.sleep(2000);

        driver.switchTo().window(parentTab);



    }

    @Test
    public void testLinkedInButton() throws InterruptedException {

        socialMediaPageObject.clickLinkedinLogo();

        Set <String> handlesObj =  driver.getWindowHandles();

        Iterator it = handlesObj.iterator();

        String parentTab = (String) it.next();

        String childTab = (String) it.next();

        driver.switchTo().window(childTab);

        Thread.sleep(3000);

        String expectedUrlLinkedIn = "https://www.linkedin.com/company/sauce-labs/?original_referer=";

        Assert.assertTrue(expectedUrlLinkedIn.equals(driver.getCurrentUrl()));

        driver.switchTo().window(parentTab);






    }

    @Before
    public void loginAndScrollDown() throws InterruptedException {

        loginPageObject.login();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1550)", "");




}

}