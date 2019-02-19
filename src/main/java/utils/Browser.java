package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class Browser {
    public static WebDriver driver;

    /**
     * Method which opens a browser by passed browserType.
     * <p>
     * Valid options: chrome, firefox, opera
     *
     * @param browserType the browser type which will be opened.
     */
    public static void open(String browserType) {
        switch (browserType) {
            case "firefox":
                String firefoxPath = Paths.get("geckodriver.exe").toAbsolutePath().toString();
                System.setProperty("webdriver.gecko.driver", firefoxPath);
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                break;
            case "chrome":
                break;
            case "opera":
                break;

            default:
                throw new RuntimeException("The browser that is chosen " + browserType + " is not a valid browser!");
        }

    }

    /**
     * Method which closes the browser.
     */
    public static void quit() {
        driver.quit();
    }
}
