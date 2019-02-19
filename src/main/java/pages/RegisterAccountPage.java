package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class RegisterAccountPage {

    private static final By LOC_FIRSTNAME = By.id("input-firstname");
    private static final By LOC_LASTNAME = By.id("input-lastname");
    private static final By LOC_INPUTEMAIL = By.id("input-email");
    private static final By LOC_INPUTTELEPHONE = By.id("input-telephone");
    private static final By LOC_INPUTPASSWORD = By.id("input-password");
    private static final By LOC_INPUTCONFIRMPASSWORD= By.id("input-confirm");
    private static final By LOC_INPUTSUBSCRIBE= By.name("newsletter");
    private static final By LOC_INPUTPOLICY= By.name("agree");

    private static final By LOC_CONTINUE_BUTTON = By.xpath("//input[@class='btn btn-primary']");

    private static final By LOC_FIRSTNAMEERROR = By.xpath("//input[@id='input-firstname']/following-sibling::div[@class='text-danger']");
    private static final By LOC_LASTNAMEERROR = By.xpath("//input[@id='input-lastname']/following-sibling::div[@class='text-danger']");
    private static final By LOC_EMAILERROR = By.xpath("//input[@id='input-email']/following-sibling::div[@class='text-danger']");
    private static final By LOC_TELEPHONEERROR = By.xpath("//input[@id='input-telephone']/following-sibling::div[@class='text-danger']");
    private static final By LOC_PASSWORDERROR = By.xpath("//input[@id='input-password']/following-sibling::div[@class='text-danger']");

    /**
     * Method that register a user
     *
     * @param firstname - the first name of the user
     * @param lastname - the last name of the user
     * @param telephone - the telephone of the user
     * @param email - the e-mail of the user
     * @param password - the password of the user
     */
    public static void register(String firstname, String lastname, String email, String telephone, String password) {
        Browser.driver.findElement(LOC_FIRSTNAME).sendKeys(firstname);
        Browser.driver.findElement(LOC_LASTNAME).sendKeys(lastname);
        Browser.driver.findElement(LOC_INPUTEMAIL).sendKeys(email);
        Browser.driver.findElement(LOC_INPUTTELEPHONE).sendKeys(telephone);
        Browser.driver.findElement(LOC_INPUTPASSWORD).sendKeys(password);
        Browser.driver.findElement(LOC_INPUTCONFIRMPASSWORD).sendKeys(password);
        Browser.driver.findElement(LOC_INPUTSUBSCRIBE).click();
        Browser.driver.findElement(LOC_INPUTPOLICY).click();
        Browser.driver.findElement(LOC_CONTINUE_BUTTON).click();
    }

    /**
     * Method which verifies the first name error validation message of the admin login page.
     *
     * @param expectedMessage                           the expected error validation message
     * @param messageInCaseOfIncorrectValidationMessage message which will be logged in case the error validation message is not correct
     */
    public static void verifyErrorValidationMessageFirstName(String expectedMessage, String messageInCaseOfIncorrectValidationMessage) {
        Browser.driver.findElement(LOC_CONTINUE_BUTTON).click();
        String actualErrorValidationMessage = Browser.driver.findElement(LOC_FIRSTNAMEERROR).getText();

        Assert.assertTrue(actualErrorValidationMessage.contains(expectedMessage), messageInCaseOfIncorrectValidationMessage);
    }

    /**
     * Method which verifies the first name error validation message of the admin login page.
     *
     * @param expectedMessage                           the expected error validation message
     * @param messageInCaseOfIncorrectValidationMessage message which will be logged in case the error validation message is not correct
     */
    public static void verifyErrorValidationMessageLastName(String expectedMessage, String messageInCaseOfIncorrectValidationMessage) {
        Browser.driver.findElement(LOC_CONTINUE_BUTTON).click();
        String actualErrorValidationMessage = Browser.driver.findElement(LOC_LASTNAMEERROR).getText();

        Assert.assertTrue(actualErrorValidationMessage.contains(expectedMessage), messageInCaseOfIncorrectValidationMessage);
    }

    /**
     * Method which verifies the e-mail error validation message of the admin login page.
     *
     * @param expectedMessage                           the expected error validation message
     * @param messageInCaseOfIncorrectValidationMessage message which will be logged in case the error validation message is not correct
     */
    public static void verifyErrorValidationMessageEmail(String expectedMessage, String messageInCaseOfIncorrectValidationMessage) {
        Browser.driver.findElement(LOC_CONTINUE_BUTTON).click();
        String actualErrorValidationMessage = Browser.driver.findElement(LOC_EMAILERROR).getText();

        Assert.assertTrue(actualErrorValidationMessage.contains(expectedMessage), messageInCaseOfIncorrectValidationMessage);
    }

    /**
     * Method which verifies the telephone error validation message of the admin login page.
     *
     * @param expectedMessage                           the expected error validation message
     * @param messageInCaseOfIncorrectValidationMessage message which will be logged in case the error validation message is not correct
     */
    public static void verifyErrorValidationMessageTelephone(String expectedMessage, String messageInCaseOfIncorrectValidationMessage) {
        Browser.driver.findElement(LOC_CONTINUE_BUTTON).click();
        String actualErrorValidationMessage = Browser.driver.findElement(LOC_TELEPHONEERROR).getText();

        Assert.assertTrue(actualErrorValidationMessage.contains(expectedMessage), messageInCaseOfIncorrectValidationMessage);
    }

    /**
     * Method which verifies the password error validation message of the admin login page.
     *
     * @param expectedMessage                           the expected error validation message
     * @param messageInCaseOfIncorrectValidationMessage message which will be logged in case the error validation message is not correct
     */
    public static void verifyErrorValidationMessagePassword(String expectedMessage, String messageInCaseOfIncorrectValidationMessage) {
        Browser.driver.findElement(LOC_CONTINUE_BUTTON).click();
        String actualErrorValidationMessage = Browser.driver.findElement(LOC_PASSWORDERROR).getText();

        Assert.assertTrue(actualErrorValidationMessage.contains(expectedMessage), messageInCaseOfIncorrectValidationMessage);
    }
}
