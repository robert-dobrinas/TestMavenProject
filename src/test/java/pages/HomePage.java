package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePage {
    WebElement SEARCH_BOX = webDriver.findElement(By.cssSelector("input#search_query_top"));

    WebElement SEARCH_BUTTON = webDriver.findElement(By.cssSelector("button.button-search"));


    public HomePage searchForItem(String article) {

        SEARCH_BOX.sendKeys(article);
        SEARCH_BUTTON.click();
        System.out.println("Search performed succesfully for item "+ article);

        return this;
    }
}





