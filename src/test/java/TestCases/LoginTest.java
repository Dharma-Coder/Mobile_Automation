package TestCases;

import Base.BaseTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.example.Login;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

        private Login loginTest;

        @BeforeMethod(description = "This is the login test cases")
        public void RegistrationSetupTest() {
            super.setUp();
            loginTest = new Login(driver);
        }

        @Test(description = "Verify the login ", priority = 0)
        public void VerifyLogin() throws Exception {
            loginTest.handlePermissions();
            loginTest.Loginapp();
        }
       @Test(description = "Test: Verify sign up with no title")
       @Severity(SeverityLevel.BLOCKER)
       @Story("This story belongs to the signup flow")
       public void VerifyTryToLoginWithOutEmailID()  {
           if(!loginTest.TryToLoginWithOutEmailID())
               Assert.fail();
       }
    @Test(description = "Test: Verify sign up with no title")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the signup flow")
    public void VerifyTryToLoginWithOutPassword()  {
        loginTest.handlePermissions();
        if(!loginTest.TryToLoginWithOutPassword())
            Assert.fail();
    }
    @Test (description = "Test: Verify sign up with no title")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the signup flow")
    public void VerifyTryToLoginWithInvalidPassword()  {
        loginTest.handlePermissions();
        if(!loginTest.LoginWithInvalidPassword())
            Assert.fail();
    }
    @Test (description = "Test: Verify sign up with no title")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the signup flow")
    public void VerifyTryToLoginWithInvalidUserEmail()  {
        loginTest.handlePermissions();
        if(!loginTest.LoginWithInvalidUserEmail())
            Assert.fail();
    }
    @Test (description = "Test: Verify sign up with no title")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the signup flow")
    public void Verifylinks() throws Exception {
       loginTest.Linkidn();
    }
}
