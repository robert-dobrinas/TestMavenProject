package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProductPage extends BasePage {

    WebElement addToCartButton = webDriver.findElement(By.cssSelector("button.exclusive"));
    WebElement addedConfirmation = webDriver.findElement(By.cssSelector("i.icon-ok"));
    WebElement quantityField = webDriver.findElement(By.cssSelector("input#quantity_wanted"));
    WebElement increaseQty = webDriver.findElement(By.cssSelector("i.icon-plus"));
    WebElement decreaseQty = webDriver.findElement(By.cssSelector("i.icon-minus"));
    WebElement sizeDropdown = webDriver.findElement(By.cssSelector("select#group_1"));
    WebElement sizeS = webDriver.findElement(By.cssSelector("option[value = '1'"));
    WebElement sizeM = webDriver.findElement(By.cssSelector("option[value = '2'"));
    WebElement sizeL = webDriver.findElement(By.cssSelector("option[value = '3'"));
    protected WebElement pink = webDriver.findElement(By.cssSelector("a#color_24"));
    WebElement proceedToCheckout = webDriver.findElement(By.cssSelector("a.button-medium[title = 'Proceed to checkout'"));






    public ProductPage addToCart(){
        waitForElement(addToCartButton);
        Assert.assertTrue(addToCartButton.isDisplayed());
        addToCartButton.click();
        System.out.println("Add to cart button was clicked");

        return this;
    }
    public ProductPage verifyProductIsAdded(){
        waitForElement(addedConfirmation);
        Assert.assertTrue(addedConfirmation.isDisplayed());
        System.out.println("Item was added succesfully");
        return this;
    }

    public ProductPage changeQuantity(String qty){
        quantityField.clear();
        quantityField.sendKeys(qty);
        increaseQty.click();
        decreaseQty.click();


        return this;
    }
    public ProductPage changeColour(){
        pink.click();
        return this;
    }

    public ProductPage changeSize(){
        sizeM.click();

        return this;
    }

    public ProductPage goToCheckout(){
        waitForElement(proceedToCheckout);
        Assert.assertTrue(proceedToCheckout.isDisplayed());
        proceedToCheckout.click();
        return this;
    }


}
