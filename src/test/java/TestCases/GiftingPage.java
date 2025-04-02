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
    }
    @Test(description = "Test: Verify Send Gift With From SGCsBalance")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the signup flow")
    public void VerifySendGiftWithFromSGCsBalance() throws Exception {
        loginTest.handlePermissions();
        loginTest.GuardianLogin();
        if (!GiftingPage.SendGiftWithGBPFromSGCsBalance())
            Assert.fail();
    }
    @Test(description = "Test: Verify SendGiftWithoutMessage")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the signup flow")
    public void VerifySendGiftWithoutMessage() throws Exception {
        loginTest.handlePermissions();
        loginTest.GuardianLogin();
        if (!GiftingPage.SendGiftWithoutMessage())
            Assert.fail();
    }
    @Test(description = "Test: Verify SendGiftWithoutEmail")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the signup flow")
    public void VerifySendGiftWithoutEmail() throws Exception {
        loginTest.handlePermissions();
        loginTest.GuardianLogin();
        if (!GiftingPage.SendGiftWithoutEmail())
            Assert.fail();
    }
    @Test(description = "Test: Verify SendGiftWithoutName")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the signup flow")
    public void VerifySendGiftWithoutName() throws Exception {
        loginTest.handlePermissions();
        loginTest.GuardianLogin();
        if (!GiftingPage.SendGiftWithoutName())
            Assert.fail();
    }
    @Test(description = "Test: Verify SendGiftFromPayNow")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the signup flow")
    public void VerifySendGiftFromPayNow() throws Exception {
        loginTest.handlePermissions();
        loginTest.GuardianLogin();
        if (!GiftingPage.SendGiftFromPayNow())
            Assert.fail();
    }
    @Test(description = "Test: Verify SendGiftFromPayNowWithoutAnyData")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the signup flow")
    public void VerifySendGiftFromPayNowWithoutAnyData() throws Exception {
        loginTest.handlePermissions();
        loginTest.GuardianLogin();
        if (!GiftingPage.SendGiftFromPayNowWithoutAnyData())
            Assert.fail();
    }
    @Test(description = "Test: Verify SendGiftFromSGCWithoutAnyData")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the signup flow")
    public void VerifySendGiftFromSGCWithoutAnyData() throws Exception {
        loginTest.handlePermissions();
        loginTest.GuardianLogin();
        if (!GiftingPage.SendGiftFromSGCWithoutAnyData())
            Assert.fail();
    }

}
