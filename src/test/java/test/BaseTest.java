package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultsPage;
import utils.Driver;

public class BaseTest {

    public static Driver driver = null;

    @BeforeMethod
    public void startTest() {
        driver = Driver.getInstance();
        driver.navigate();


    }

    HomePage homePage = new HomePage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();
    ProductPage productPage = new ProductPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @AfterMethod
    public void closeDriver() {

        driver.exit();
    }
}
