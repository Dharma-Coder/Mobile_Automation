package TestCases;

import Base.BaseTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.example.Login;
import org.example.Profile;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilePage extends BaseTest {
    private Profile ProfilePage;
    private Login loginTest;

    @BeforeMethod(description = "This is the login test cases")
    public void setProfilePage() throws Exception {
        super.setUp();
        ProfilePage = new Profile(driver);
        loginTest = new Login(driver);


    }
    @Test(description = "Verify the login ", priority = 0)
    public void VerifyName() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.SaveName())
            Assert.fail();
    }
    @Test(description = "Verify the login ", priority = 0)
    public void VerifySaveAddressDetails() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.SaveAddressDetails())
            Assert.fail();
    }
    @Test(description = "Verify the login ", priority = 0)
    public void VerifyUpdateTheImage() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.UpdateTheImage())
            Assert.fail();
    }
    @Test(description = "Verify the login ", priority = 0)
    public void VerifyClusterHoldings() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.ClusterHoldings())
            Assert.fail();
    }
    @Test(description = "Test: Verify Transaction")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifyTransaction() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.Transaction())
            Assert.fail();
    }
    @Test(description = "Test: Verify SaveTheActivities")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifySaveTheActivities() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.SaveTheActivities())
            Assert.fail();
    }
    @Test(description = "Test: Verify SaveTheInterest")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifySaveTheInterest() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.SaveTheInterest())
            Assert.fail();
    }


    @Test(description = "Test: Verify Subscriptions")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifySubscriptions() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.Subscriptions())
            Assert.fail();
    }
    @Test(description = "Test: Verify Collectibles")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifyCollectibles() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.Collectibles())
            Assert.fail();
    }
    @Test(description = "Test: Verify EmailPreferences")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifyEmailPreferences() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.EmailPreferences())
            Assert.fail();
    }
    @Test(description = "Test: Verify ForgetPassword")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifyForgetPassword() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.ForgetPassword())
            Assert.fail();
    }
    @Test(description = "Test: Verify updatePhoneNumber")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifyUpdatePhoneNumber() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.updatePhoneNumber())
            Assert.fail();
    }
    @Test(description = "Test: Verify CaliforniaResident")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifyCaliforniaResident() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.CaliforniaResident())
            Assert.fail();
    }
    @Test(description = "Test: Verify Disclosures")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifyDisclosures() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.Disclosures())
            Assert.fail();
    }
    @Test(description = "Test: Verify InviteAFriend")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifyInviteAFriend() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.InviteAFriend())
            Assert.fail();
    }
    @Test(description = "Test: Verify Logout")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifyLogout() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.Logout())
            Assert.fail();
    }
    @Test(description = "Test: Verify DeleteProfile")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifyDeleteProfile() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.DeleteProfile())
            Assert.fail();
    }
    @Test(description = "Test: Verify SaveWithoutFirstName")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifySaveWithoutFirstName() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.SaveWithoutFirstName())
            Assert.fail();
    }

    @Test(description = "Test: Verify SaveLastNameEmpty")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifySaveLastNameEmpty() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.SaveLastNameEmpty())
            Assert.fail();
    }
    @Test(description = "Test: Verify SaveFirstAndLastNameEmpty")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifySaveFirstAndLastNameEmpty() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.SaveFirstAndLastNameEmpty())
            Assert.fail();
    }
    @Test(description = "Test: Verify SaveAddressWithoutCityDetails")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifySaveAddressWithoutCityDetails() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.SaveAddressWithoutCityDetails())
            Assert.fail();
    }
    @Test(description = "Test: Verify SaveAddressWithoutStateDetails")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifySaveAddressWithoutStateDetails() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.SaveAddressWithoutStateDetails())
            Assert.fail();
    }
    @Test(description = "Test: Verify SaveAddressWithoutCountryDetails")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifySaveAddressWithoutCountryDetails() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.SaveAddressWithoutCountryDetails())
            Assert.fail();
    }
    @Test(description = "Test: Verify SaveAddressWithoutDetails")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifySaveAddressWithoutDetails() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.SaveAddressWithoutDetails())
            Assert.fail();
    }
    @Test(description = "Test: Verify ClickContinueButtonWithoutPhoneNumber")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifyClickContinueButtonWithoutPhoneNumber() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.ClickContinueButtonWithoutPhoneNumber())
            Assert.fail();
    }
    @Test(description = "Test: Verify ClickContinueButtonWithoutForgetPassword")
    @Severity(SeverityLevel.CRITICAL)
    @Story("This story belongs to the ProfilePage")
    public void VerifyClickContinueButtonWithoutForgetPassword() throws Exception {
        loginTest.NonGuardian();
        if (!ProfilePage.ClickContinueButtonWithoutForgetPassword())
            Assert.fail();
    }

}
