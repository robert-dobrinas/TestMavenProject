package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Driver;

public class BasePage {
    WebDriver webDriver = Driver.getInstance().webDriver;

    public void waitForElement(By parentElement) {
        WebElement ele = webDriver.findElement(parentElement);
        WebDriverWait wait = new WebDriverWait(webDriver, 20);
        wait.until(ExpectedConditions.visibilityOf(ele));

    }

    public void clickElement(By parentElement) {
        WebElement name = webDriver.findElement(parentElement);
        name.click();

    }

    public void assertIsDisplayed(By parentElement) {
        WebElement elem = webDriver.findElement(parentElement);
        Assert.assertTrue(elem.isDisplayed());

    }

    public void sendKeysToElem(By parentElement, String art) {
        WebElement pst = webDriver.findElement(parentElement);
        pst.sendKeys(art);

    }


}
