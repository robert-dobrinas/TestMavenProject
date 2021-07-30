package pages;

import org.openqa.selenium.By;

public class SearchResultsPage extends BasePage {


    private static final By secondItem = By.cssSelector("img.img-responsive[src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']");
    private static final By firstItem = By.cssSelector("img.img-responsive[src='http://automationpractice.com/img/p/1/2/12-home_default.jpg']");


    public SearchResultsPage clickOnFirstItem() {

        waitForElement(firstItem);
        assertIsDisplayed(firstItem);
        clickElement(firstItem);
        System.out.println("First item on the page was succesfully clicked");
        return this;
    }

    public SearchResultsPage clickOnSecondItem() {

        waitForElement(secondItem);
        assertIsDisplayed(secondItem);
        clickElement(secondItem);
        System.out.println("Second item on page was succesfully clicked");
        return this;
    }
}
