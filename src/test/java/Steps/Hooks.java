package Steps;

import drivers.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import static drivers.DriverHolder.setDriver;

public class Hooks {
    static WebDriver driver;

    @Before
    public void setup(){
        this.driver = DriverFactory.getNewInstance("");
        setDriver(driver);

        //Todo Call the URL
        driver.get("https://www.saucedemo.com/");
    }
    @After
    public void tearDown(){
        this.driver.quit();
    }
}
