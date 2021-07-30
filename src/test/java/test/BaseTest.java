package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Driver;

public class BaseTest {

    public static Driver driver = null;
    @BeforeMethod
    public void startTest() {
        driver = Driver.getInstance();
        driver.navigate();




    }

    @AfterMethod
    public void closeDriver() {

        driver.exit();
    }
}
