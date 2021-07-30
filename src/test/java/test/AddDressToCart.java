package test;


import org.testng.annotations.Test;

public class AddDressToCart extends BaseTest {
    @Test(priority = 1)
    public void addFirstItemToCart() {

        homePage.searchForItem("dress");
        searchResultsPage.clickOnFirstItem();
        productPage.addToCart();
        productPage.verifyProductIsAdded();


    }

    @Test(priority = 2)
    public void addSecondItemToCart() {

        homePage.searchForItem("dress");
        searchResultsPage.clickOnSecondItem();
        productPage.changeQuantity("2");
        productPage.changeSize();
        productPage.changeColour();
        productPage.addToCart();
        productPage.verifyProductIsAdded();

    }

    @Test(priority = 3)
    public void addItemFromQuickMenu() {

        homePage.searchForItem("dress");
        searchResultsPage.clickOnSecondItem();
        productPage.changeQuantity("2");
        productPage.changeSize();
        productPage.changeColour();
        productPage.addToCart();
        productPage.goToCheckout();
        checkoutPage.deleteItem();

    }


}

