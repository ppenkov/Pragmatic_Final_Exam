package negative;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterAccountPage;
import utils.Browser;

public class RegisterAccountPageTests {
    @BeforeMethod
    public void setUp() {
        Browser.open("firefox");
        HomePage.goTo();
        HomePage.navigate();
    }

    @Test
    public void unsuccesfulFirstNameInput() {
        RegisterAccountPage.verifyErrorValidationMessageFirstName("First Name must be between 1 and 32 characters!",
                "The expected validation error message is INCORRECT!");
    }

    @Test
    public void unsuccesfulLastNameInput() {
        RegisterAccountPage.verifyErrorValidationMessageLastName("Last Name must be between 1 and 32 characters!",
                "The expected validation error message is INCORRECT!");
    }

    @Test
    public void unsuccesfulEmailInput() {
        RegisterAccountPage.verifyErrorValidationMessageEmail("E-Mail Address does not appear to be valid!",
                "The expected validation error message is INCORRECT!");
    }

    @Test
    public void unsuccesfulTelephoneInput() {
        RegisterAccountPage.verifyErrorValidationMessageTelephone("Telephone must be between 3 and 32 characters!",
                "The expected validation error message is INCORRECT!");
    }

    @Test
    public void unsuccesfulPasswordInput() {
        RegisterAccountPage.verifyErrorValidationMessagePassword("Password must be between 4 and 20 characters!",
                "The expected validation error message is INCORRECT!");
    }

    @AfterMethod
    public void tearDown() {
        Browser.quit();
    }
}
