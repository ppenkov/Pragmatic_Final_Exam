package pages;

import org.openqa.selenium.By;
import utils.Browser;

public class HomePage {

    private static final By LOC_MYACCOUNT = By.xpath("//div[@id='top-links']//li[@class='dropdown']//span[@class='hidden-xs hidden-sm hidden-md']");
    private static final By LOC_REGISTER = By.xpath("//div[@id='top-links']//li[@class='dropdown open']//ul//li//a");

    /**
     * Method which takes you to the home page!
     */
    public static void goTo() {
        Browser.driver.get("http://shop.pragmatic.bg/");
    }

    /**
     * Method that navigates to the register page.
     *
     */
    public static void navigate() {
        Browser.driver.findElement(LOC_MYACCOUNT).click();
        Browser.driver.findElement(LOC_REGISTER).click();
    }
}
