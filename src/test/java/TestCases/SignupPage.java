package TestCases;

import Base.BaseTest;
import org.example.Login;
import org.example.Signup;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignupPage extends BaseTest {

    private Signup SignupPage;

    @BeforeMethod(description = "This is the login test cases")
    public void SignupTest() {
        super.setUp();
        SignupPage = new Signup(driver);
    }

    @Test(description = "Verify the Signup With Already Exists PhoneNumber And EmailID ", priority = 1)
    public void VerifySignupWithAlreadyExistsPhoneNumberAndEmailID() throws Exception {
        if (!SignupPage.SignupWithAlreadyExistsPhoneNumberAndEmailID())
            Assert.fail();
    }
    @Test(description = "Verify the Signup With Already Exists PhoneNumber ", priority = 1)
    public void VerifySignupWithAlreadyExistsPhoneNumber() throws Exception {
        if (!SignupPage.SignupWithAlreadyExistsPhoneNumber())
            Assert.fail();
    }
    @Test(description = "Verify the Signup With Already Exists EmailID ", priority = 1)
    public void VerifySignupWithAlreadyExistsEmailID() throws Exception {
        if (!SignupPage.SignupWithAlreadyExistsEmailID())
            Assert.fail();
    }
}


