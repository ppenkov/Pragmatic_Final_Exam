package positive;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterAccountPage;
import utils.Browser;
import utils.CommonVerification;

public class RegisterAccountPageTests {

    @BeforeMethod
    public void setUp() {
        Browser.open("firefox");
        HomePage.goTo();
        HomePage.navigate();
    }

    @Test
    public void userRegisterTest() {
        RegisterAccountPage.register("Pavel12345", "Penkov12345", "qwweqwrsqeq@asdasas.com", "435843275832", "1234567");
        CommonVerification.verifyTitle("Your Account Has Been Created!", "The register was unsuccessful!");
    }

    @AfterMethod
    public void tearDown() {Browser.quit();}
}
