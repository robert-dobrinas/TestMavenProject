package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckoutPage extends BasePage {
    WebElement deleteButton = webDriver.findElement(By.cssSelector("i.icon-trash"));
    WebElement warning = webDriver.findElement(By.cssSelector("p.alert-warning"));


    public CheckoutPage deleteItem(){
        waitForElement(deleteButton);
        Assert.assertTrue(deleteButton.isDisplayed());
        deleteButton.click();
        waitForElement(warning);
        Assert.assertTrue(warning.isDisplayed());
        return this;
    }
}
