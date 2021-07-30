package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class SearchResultsPage extends BasePage {

    WebElement firstItem = webDriver.findElement(By.cssSelector("img.img-responsive[src='http://automationpractice.com/img/p/1/2/12-home_default.jpg']"));
    WebElement secondItem = webDriver.findElement(By.cssSelector("img.img-responsive[src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']"));



    public SearchResultsPage clickOnFirstItem() {
        waitForElement(firstItem);
        Assert.assertTrue(firstItem.isDisplayed());
        firstItem.click();
        System.out.println("First item on the page was succesfully clicked");
        return this;
    }
    public SearchResultsPage clickOnSecondItem(){
        waitForElement(secondItem);
        Assert.assertTrue(secondItem.isDisplayed());
        secondItem.click();
        return this;
    }
}
