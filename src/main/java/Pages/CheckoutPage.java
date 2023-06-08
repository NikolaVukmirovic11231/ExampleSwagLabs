package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    public WebDriver driver;

    public By backpackPrice = By.xpath("//*[text()='29.99']");

    public By bikeLampPrice = By.xpath("//*[text()='9.99']");

    public By taxPrice = By.xpath("//*[@class='summary_tax_label']");

    public By totalPrice = By.xpath("//*[text()='43.18']");

    public By totalPriceWithoutDollarSign = By.xpath("//*[text()='43.18']");



    public CheckoutPage(WebDriver driver){

        this.driver = driver;

    }

    public double calculatingPricesManually(double price1, double price2, double price3){



       double  x = price1 + price2 + price3;


        return x;
    }

    public String getFirstItemPrice(){

        return driver.findElement(backpackPrice).getText();

    }

    public String getSecondItemPrice(){

        return driver.findElement(bikeLampPrice).getText();



    }


    public String getTaxPrice(){

        return driver.findElement(taxPrice).getText();

    }

    public String getTotalPrice(){

        return driver.findElement(totalPrice).getText();

    }

    public String getGet(){

        return driver.findElement(totalPriceWithoutDollarSign).getText();

    }





}
