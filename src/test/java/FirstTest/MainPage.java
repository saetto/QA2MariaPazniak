package FirstTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Andrei Pazniak on 3/26/2017.
 */
public class MainPage {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://javaguru.lv");
        driver.quit();
    }
}

