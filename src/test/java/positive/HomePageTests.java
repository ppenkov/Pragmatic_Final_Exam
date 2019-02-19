package positive;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Browser;
import utils.CommonVerification;

public class HomePageTests {
    @BeforeMethod
    public void setUp() {
        Browser.open("firefox");
    }

    @Test
    public void userNavigateTest() {
        HomePage.goTo();
        HomePage.navigate();

        CommonVerification.verifyTitle("Register Account", "The navigation was unsuccessful!");
    }

    @AfterMethod
    public void tearDown() {Browser.quit();}
}
