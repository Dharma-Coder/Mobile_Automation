package TestCases;

import Base.BaseTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.example.Login;
import org.example.gifting;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GiftingPage extends BaseTest {
    private gifting GiftingPage;
    private Login loginTest;

    @BeforeMethod(description = "This is the login test cases")
    public void setProfilePage() throws Exception {
        super.setUp();
        GiftingPage = new gifting(driver);
        loginTest = new Login(driver);
        loginTest.Loginapp();
    }
    @Test(description = "Test: Verify sign up with no title")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the signup flow")
    public void VerifyTryToLoginWithOutEmailID() {
        if (!loginTest.TryToLoginWithOutEmailID())
            Assert.fail();
    }

}
