package TestCases;

import Base.BaseTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.example.Collectibles;
import org.example.Login;
import org.example.dashboard;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Base.BaseTest.driver;

public class CollectiblesPage extends BaseTest {
    private Collectibles CollectiblesPage;
    private Login loginTest;

    @BeforeMethod(description = "This is the login test cases")
    public void setProfilePage() throws Exception {
        super.setUp();
        CollectiblesPage = new Collectibles(driver);
        loginTest = new Login(driver);
    }
    @Test(description = "Test:Verify Download Guardian Certificate ")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the Collectibles flow")
    public void VerifyDownloadGuardianCertificate() throws Exception {
        loginTest.GuardianLogin();
        if (!CollectiblesPage.DownloadGuardianCertificate())
            Assert.fail();
    }
    @Test(description = "Test: Verify Download Map CodeRhyal")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the Collectibles flow")
    public void VerifyDownloadMapCodeRhyal() throws Exception {
        loginTest.GuardianLogin();
        if (!CollectiblesPage.DownloadMapCodeRhyal())
            Assert.fail();
    }
    @Test(description = "Test: Verify DownloadMapGigrin")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the Collectibles flow")
    public void VerifyDownloadMapGigrin() throws Exception {
        loginTest.GuardianLogin();
        if (!CollectiblesPage.DownloadMapGigrin())
            Assert.fail();
    }
    @Test(description = "Test: Verify DownloadMapOceanSanctuary")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the Collectibles flow")
    public void VerifyDownloadMapOceanSanctuary() throws Exception {
        loginTest.GuardianLogin();
        if (!CollectiblesPage.DownloadMapOceanSanctuary())
            Assert.fail();
    }
    @Test(description = "Test: Verify DownloadCalendar")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the Collectibles flow")
    public void VerifyDownloadCalendar() throws Exception {
        loginTest.GuardianLogin();
        if (!CollectiblesPage.DownloadCalendar())
            Assert.fail();
    }
    @Test(description = "Test: Verify DownloadBackGroundImage1")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the Collectibles flow")
    public void VerifyDownloadBackGroundImage1() throws Exception {
        loginTest.GuardianLogin();
        if (!CollectiblesPage.DownloadBackGroundImage1())
            Assert.fail();
    }
    @Test(description = "Test: Verify DownloadBackGroundImage2")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the Collectibles flow")
    public void VerifyDownloadBackGroundImage2() throws Exception {
        loginTest.GuardianLogin();
        if (!CollectiblesPage.DownloadBackGroundImage2())
            Assert.fail();
    }
    @Test(description = "Test: Verify DownloadBackGroundImage3")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the Collectibles flow")
    public void VerifyDownloadBackGroundImage3() throws Exception {
        loginTest.GuardianLogin();
        if (!CollectiblesPage.DownloadBackGroundImage3())
            Assert.fail();
    }
    @Test(description = "Test: Verify DownloadStickers1")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the Collectibles flow")
    public void VerifyDownloadStickers1() throws Exception {
        loginTest.GuardianLogin();
        if (!CollectiblesPage.DownloadStickers1())
            Assert.fail();
    }
    @Test(description = "Test: Verify DownloadStickers2")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the Collectibles flow")
    public void VerifyDownloadStickers2() throws Exception {
        loginTest.GuardianLogin();
        if (!CollectiblesPage.DownloadStickers2())
            Assert.fail();
    }
    @Test(description = "Test: Verify DownloadStickers3")
    @Severity(SeverityLevel.BLOCKER)
    @Story("This story belongs to the Collectibles flow")
    public void VerifyDownloadStickers3() throws Exception {
        loginTest.GuardianLogin();
        if (!CollectiblesPage.DownloadStickers3())
            Assert.fail();
    }
}
