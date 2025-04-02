package TestCases;

import Base.BaseTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.example.Login;
import org.example.dashboard;
import org.example.gifting;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Base.BaseTest.driver;

public class DashboardPage extends BaseTest {
    private dashboard DashboardPage;
    private Login loginTest;

    @BeforeMethod(description = "This is the login test cases")
    public void setProfilePage() throws Exception {
        super.setUp();
        DashboardPage = new dashboard(driver);
        loginTest = new Login(driver);
    }
    @Test(description = "Test: Verify sign up with no title")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the signup flow")
    public void VerifyTryToLoginWithOutEmailID() throws Exception {
        loginTest.handlePermissions();
        loginTest.Loginapp();
        DashboardPage.ClickOnSeedlingGBP();

            Assert.fail();
    }
    @Test(description = "Test: Verify Click On Become A Guardian")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnBecomeAGuardian() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        DashboardPage.ClickOnBecomeAGuardian();
    }
    @Test(description = "Test: Verify Click On LearnMore Button")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnLearnMoreButton() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnLearnMoreButton())
            Assert.fail();
    }
    @Test(description = "Test: Verify Click On Gift Card Any")
    @Severity(SeverityLevel.NORMAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnGiftCardAny() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnGiftCardAny())
            Assert.fail();
    }
    @Test(description = "Test: Verify Click On ExploreSquads")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnExploreSquads() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnExploreSquads())
            Assert.fail();
    }
    @Test(description = "Test: Verify Click On Start Completing Profile")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnStartCompletingProfile() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnStartCompletingProfile())
            Assert.fail();
    }
    @Test(description = "Test: Verify Click On View Collectibles")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnViewCollectibles() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnViewCollectibles())
            Assert.fail();
    }
    @Test(description = "Test: Verify Click On LearnMoreAboutUs")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnLearnMoreAboutUs() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnLearnMoreAboutUs())
            Assert.fail();
    }
    @Test(description = "Test: Verify Click On Blog1")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnBlog1() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnBlog1())
            Assert.fail();
    }
    @Test(description = "Test: Verify Click On Blog2")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnBlog2() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnBlog2())
            Assert.fail();
    }

    @Test(description = "Test: Verify Click On Blog3")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnBlog3() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnBlog3())
            Assert.fail();
    }
    @Test(description = "Test: Verify Click On Blog4")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnBlog4() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnBlog4())
            Assert.fail();
    }
    @Test(description = "Test: Verify Click On ShowMoreButton")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnShowMoreButtonForBlogs() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnShowMoreButton())
            Assert.fail();
    }
    @Test(description = "Test: Verify ClickOnWhatIsSacredGrovesVideo")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnWhatIsSacredGrovesVideo() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnWhatIsSacredGrovesVideo())
            Assert.fail();
    }
    @Test(description = "Test: Verify ClickOnBenefitsBecomingGuardianVideo")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnBenefitsBecomingGuardianVideo() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnBenefitsBecomingGuardianVideo())
            Assert.fail();
    }
    @Test(description = "Test: Verify ClickOnBecomingGuardianOnMobileAppVideo")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnBecomingGuardianOnMobileAppVideo() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnBecomingGuardianOnMobileAppVideo())
            Assert.fail();

    }
    @Test(description = "Test: Verify ClickOnSubscribeClusterOnMobileAppVideo")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnSubscribeClusterOnMobileAppVideo() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnSubscribeClusterOnMobileAppVideo())
            Assert.fail();

    }
    @Test(description = "Test: Verify ClickOnStepByStepReceivingAGiftOnMobileAppVideo")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnStepByStepReceivingAGiftOnMobileAppVideo() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnStepByStepReceivingAGiftOnMobileAppVideo())
            Assert.fail();
    }

    @Test(description = "Test: Verify ClickOnFaceBook")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnFaceBook() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnFaceBook())
            Assert.fail();
    }
    @Test(description = "Test: Verify ClickOnInstagram")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnInstagram() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnInstagram())
            Assert.fail();
    }
    @Test(description = "Test: Verify ClickOnLinkDin")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnLinkDin() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnLinkDin())
            Assert.fail();
    }

    @Test(description = "Test: Verify ClickOnSeedlingGBP")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnSeedlingGBP() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnSeedlingGBP())
            Assert.fail();
    }
    @Test(description = "Test: Verify ClickOnSproutPlanGBP")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnSproutPlanGBP() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnSproutPlanGBP())
            Assert.fail();
    }

    @Test(description = "Test: Verify ClickOnSafariPlanGBP")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnSafariPlanGBP() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnSafariPlanGBP())
            Assert.fail();
    }
    @Test(description = "Test: Verify ClickOnTimeGBPOneNumber")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnTimeGBPOneNumber() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnTimeGBPOneNumber())
            Assert.fail();
    }
    @Test(description = "Test: Verify ClickOnTimeGBPTwoNumbers")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnTimeGBPTwoNumbers() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnTimeGBPTwoNumbers())
            Assert.fail();
    }
    @Test(description = "Test: Verify ClickOnTimeGBPThreeNumbers")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnTimeGBPThreeNumbers() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnTimeGBPThreeNumbers())
            Assert.fail();
    }
    @Test(description = "Test: Verify ClickOnTimeGBPFourNumbers")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnTimeGBPFourNumbers() throws Exception {
        loginTest.handlePermissions();
        loginTest.NonGuardian();
        if (!DashboardPage.ClickOnTimeGBPFourNumbers())
            Assert.fail();
    }














    @Test(description = "Test: Verify ClickOnFindOutHow")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyClickOnFindOutHow() throws Exception {
        loginTest.handlePermissions();
        loginTest.GuardianLogin();
        if (!DashboardPage.ClickOnFindOutHow())
            Assert.fail();
    }
    @Test(description = "Test: Verify SelectGigrinPrysg")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifySelectGigrinPrysg() throws Exception {
        loginTest.handlePermissions();
        loginTest.GuardianLogin();
        if (!DashboardPage.SelectGigrinPrysg())
            Assert.fail();
    }
    @Test(description = "Test: Verify SelectCodeRhyal")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifySelectCodeRhyal() throws Exception {
        loginTest.handlePermissions();
        loginTest.GuardianLogin();
        if (!DashboardPage.SelectCodeRhyal())
            Assert.fail();
    }
    @Test(description = "Test: Verify SelectOceanSanctuary")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifySelectOceanSanctuary() throws Exception {
        loginTest.handlePermissions();
        loginTest.GuardianLogin();
        if (!DashboardPage.SelectOceanSanctuary())
            Assert.fail();
    }

    @Test(description = "Test: Verify ScrollGigrinPageImages")
    @Severity(SeverityLevel.NORMAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyScrollGigrinPageImages() throws Exception {
        loginTest.handlePermissions();
        loginTest.GuardianLogin();
        if (!DashboardPage.ScrollGigrinPageImages())
            Assert.fail();
    }
    @Test(description = "Test: Verify ScrollCodeRhyalImages")
    @Severity(SeverityLevel.NORMAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyScrollCodeRhyalImages() throws Exception {
        loginTest.handlePermissions();
        loginTest.GuardianLogin();
        if (!DashboardPage.ScrollCodeRhyalImages())
            Assert.fail();
    }
    @Test(description = "Test: Verify ScrollOceanSanctuaryImages")
    @Severity(SeverityLevel.NORMAL)
    @Story("This story belongs to the Dashboard Page flow")
    public void VerifyScrollOceanSanctuaryImages() throws Exception {
        loginTest.handlePermissions();
        loginTest.GuardianLogin();
        if (!DashboardPage.ScrollOceanSanctuaryImages())
            Assert.fail();
    }

}
