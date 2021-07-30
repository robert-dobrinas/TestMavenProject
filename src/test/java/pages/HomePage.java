package pages;

import org.openqa.selenium.By;


public class HomePage extends BasePage {

    private static final By searchBox = By.cssSelector("input#search_query_top");
    private static final By searchButton = By.cssSelector("button.button-search");


    public HomePage searchForItem(String article) {

        sendKeysToElem(searchBox, article);
        clickElement(searchButton);
        System.out.println("Search performed succesfully for item " + article);

        return this;
    }
}





