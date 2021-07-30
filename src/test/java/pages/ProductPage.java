package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {


//    WebElement sizeDropdown = webDriver.findElement(By.cssSelector("select#group_1"));
//    WebElement sizeS = webDriver.findElement(By.cssSelector("option[value = '1'"));
//    WebElement sizeL = webDriver.findElement(By.cssSelector("option[value = '3'"));
    private static final By addToCartButton = By.cssSelector("button.exclusive");
    private static final By addedConfirmation = By.cssSelector("i.icon-ok");
    private static final By quantityField = By.cssSelector("input#quantity_wanted");
    private static final By increaseQty = By.cssSelector("i.icon-plus");
    private static final By decreaseQty = By.cssSelector("i.icon-minus");
    private static final By sizeM = By.cssSelector("option[value = '2'");
    private static final By proceedToCheckout = By.cssSelector("a.button-medium[title = 'Proceed to checkout'");
    private static final By pink = By.cssSelector("a#color_24");


    public ProductPage addToCart() {

        waitForElement(addToCartButton);
        assertIsDisplayed(addToCartButton);
        clickElement(addToCartButton);
        System.out.println("Add to cart button was clicked");

        return this;
    }

    public ProductPage verifyProductIsAdded() {
        waitForElement(addedConfirmation);
        assertIsDisplayed(addedConfirmation);
        System.out.println("Item was added succesfully");
        return this;
    }

    public ProductPage changeQuantity(String qty) {

        webDriver.findElement(quantityField).clear();
        sendKeysToElem(quantityField, qty);
       clickElement(increaseQty);
       clickElement(decreaseQty);
        System.out.println("Product quantity changed succesfully");


        return this;
    }

    public ProductPage changeColour() {
        clickElement(pink);
        System.out.println("Colour changed to pink");
        return this;
    }

    public ProductPage changeSize() {
        clickElement(sizeM);
        System.out.println("Size succesfully changed to M");

        return this;
    }

    public ProductPage goToCheckout() {
        waitForElement(proceedToCheckout);
        assertIsDisplayed(proceedToCheckout);
        clickElement(proceedToCheckout);
        System.out.println("User is redirected to Order Page");
        return this;
    }


}
