package pages;

import org.openqa.selenium.By;

public class CheckoutPage extends BasePage {


    private static final By deleteButton = By.cssSelector("i.icon-trash");
    private static final By warning = By.cssSelector("p.alert-warning");


    public CheckoutPage deleteItem() {
        waitForElement(deleteButton);
        assertIsDisplayed(deleteButton);
        clickElement(deleteButton);
        waitForElement(warning);
        assertIsDisplayed(warning);

        return this;
    }
}
