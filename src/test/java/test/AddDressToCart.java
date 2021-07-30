package test;


import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultsPage;

public class AddDressToCart extends BaseTest {
    @Test(priority = 1)
    public void addFirstItemToCart() {
        HomePage homePage = new HomePage();
        homePage.searchForItem("dress");
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        searchResultsPage.clickOnFirstItem();
        ProductPage productPage = new ProductPage();
        productPage.addToCart();
        productPage.verifyProductIsAdded();


    }

    @Test(priority = 2)
    public void addSecondItemToCart() {
        HomePage homePage = new HomePage();
        homePage.searchForItem("dress");
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        searchResultsPage.clickOnSecondItem();
        ProductPage productPage = new ProductPage();
        productPage.changeQuantity("2");
        productPage.changeSize();
        productPage.changeColour();
        productPage.addToCart();

    }

    @Test(priority = 3)
    public void addItemFromQuickMenu() {
        HomePage homePage = new HomePage();
        homePage.searchForItem("dress");
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        searchResultsPage.clickOnSecondItem();
        ProductPage productPage = new ProductPage();
        productPage.changeQuantity("2");
        productPage.changeSize();
        productPage.changeColour();
        productPage.addToCart();
        productPage.goToCheckout();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.deleteItem();

    }


}

